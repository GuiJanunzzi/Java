package br.com.fiap.porto.dao;

import br.com.fiap.porto.Model.Carro;
import br.com.fiap.porto.exception.IdNaoEncontradoException;
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

    public Carro pesquisarPorId(int id) throws IdNaoEncontradoException, SQLException, ClassNotFoundException{
        //Fazer uma conexão
        Connection conexao = ConnectionFactory.getConnection();

        //Criar um PreparedStatement
        PreparedStatement stmt = conexao.prepareStatement("select * from t_java_carro where id_carro = ?");
        //Setar o id no comando SQL
        stmt.setInt(1,id);
        //Executar o comando SQL
        ResultSet resultSet = stmt.executeQuery();
        //Recuperar o registro, se existir
        if (!resultSet.next()){
            throw new IdNaoEncontradoException("Carro não encontrado");
        }
        return parseCarro(resultSet);
    }

    public List<Carro> listar() throws IdNaoEncontradoException, SQLException, ClassNotFoundException{
        //Fazer uma conexão
        Connection conexao = ConnectionFactory.getConnection();
        //Criar um statement
        Statement stmt = conexao.createStatement();
        //Executar uma pesquisa no banco de dados
        ResultSet rs = stmt.executeQuery("select * from t_java_carro order by id_carro");//Ordenando pelo ID
        //Criar lista de carro
        List<Carro> carros = new ArrayList<>();
        //Percorrer os registros encontrados
        while (rs.next()) {//Enquanto houver registro
            Carro carro = parseCarro(rs);
            carros.add(carro);
        }
        //Retornando a lista de carro
        return carros;
    }

    //Método para recuperar carros do banco
    private Carro parseCarro(ResultSet rs) throws SQLException {
        //Recuperar os valores das colunas do registro
        int id = rs.getInt("id_carro");
        String modelo = rs.getString("ds_modelo");
        String placa = rs.getString("nr_placa");
        float motor = rs.getFloat("ds_motor");
        boolean automatico = rs.getBoolean("ds_automatico");
        //Criando um objeto carro
        return new Carro(id,modelo,placa,motor,automatico);
    }

    public void atualizar(Carro carro) throws IdNaoEncontradoException, SQLException, ClassNotFoundException{
        //Criar a conexão
        Connection conexao = ConnectionFactory.getConnection();
        //Criar o PreparedStatement
        PreparedStatement stmt = conexao.prepareStatement("update T_JAVA_CARRO set ds_modelo = ?, " +
                "nr_placa = ?, ds_motor = ?, ds_automatico = ? where id_carro = ?");
        //Setar os valores no SQL
        stmt.setString(1, carro.getModelo());
        stmt.setString(2, carro.getNumeroPlaca());
        stmt.setFloat(3, carro.getMotor());
        stmt.setBoolean(4, carro.isAutomatico());
        stmt.setInt(5, carro.getId());
        //Execuar o comando
        int linhas = stmt.executeUpdate();
        if (linhas == 0){
            throw new IdNaoEncontradoException("ID não existe na base de dados!");
        }
    }

    public void excluir(int id) throws IdNaoEncontradoException, SQLException, ClassNotFoundException{
        //Criar a conexão
        Connection conexao = ConnectionFactory.getConnection();
        //Criar o PreparedStatement
        PreparedStatement stmt = conexao.prepareStatement("delete from t_java_carro where id_carro = ?");
        //Setar os valores no SQL
        stmt.setInt(1, id);
        //Execuar o comando e recuperar a quantidade de linhas removidas
        int linhas = stmt.executeUpdate();
        if (linhas == 0){
            throw new IdNaoEncontradoException("ID não existe na base de dados!");
        }
    }

}
