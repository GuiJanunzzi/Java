package br.com.fiap.porto.dao;

import br.com.fiap.porto.Model.Carro;
import br.com.fiap.porto.factory.ConnectionFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

//Classe responsável por interagir com o banco de dados e realizar ações na tabela T_CARRO
public class CarroDao {

    public void cadastrar(Carro carro) throws SQLException, ClassNotFoundException {
        //Fazendo uma conexão
        Connection conexao = ConnectionFactory.getConnection();
        //Criar um statement configurável
        PreparedStatement stmt = conexao.prepareStatement("insert into t_java_carro (id_carro, ds_modelo, nr_placa, ds_motor, ds_automatico) " +
                "values (sq_t_carro.nextval, ?,?,?,?)");
        //Setar os valores do carro na query
        stmt.setString(1, carro.getModelo());
        stmt.setString(2, carro.getNumeroPlaca());
        stmt.setFloat(3, carro.getMotor());
        stmt.setBoolean(4, carro.isAutomatico());
        //Executar o comando SQL
        stmt.executeUpdate();
    }

    public List<Carro> listar() throws SQLException, ClassNotFoundException{
        List<Carro> carros = new ArrayList<>();
        //Fazendo uma conexão
        Connection conexao = ConnectionFactory.getConnection();
        //Criando um statement
        Statement stmt = conexao.createStatement();
        //Executar uma pesquisa no banco de dados
        ResultSet rs = stmt.executeQuery("select * from t_carro order by id_carro");//Ordenando pelo ID
        //Percorrer todos os registros encontrados
        while (rs.next()) {//Enquanto houver registro
            //Recuperar os valores das colunas do registro
            int id = rs.getInt("id_carro");
            String modelo = rs.getString("ds_modelo");
            String placa = rs.getString("nr_placa");
            double motor = rs.getDouble("ds_motor");
            int automatico = rs.getInt("ds_automatico");

            carros.add(id,modelo,placa,motor,automatico);
        }
        return null
    }

}
