package br.com.fiap.porto.main;

import br.com.fiap.porto.factory.ConnectionFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class PesquisarTest {
    public static void main(String[] args) {
        try{
            //Conexão com o banco de dados
            Connection conexao = ConnectionFactory.getConnection();
            System.out.println("Conexão realizada com sucesso!");
            //Criando um statement
            Statement stmt = conexao.createStatement();
            //Executar uma pesquisa no banco de dados
            ResultSet rs = stmt.executeQuery("select * from t_carro order by id_carro");//Ordenando pelo ID
            //Percorrer todos os registros encontrados
            while (rs.next()){//Enquanto houver registro
                //Recuperar os valores das colunas do registro
                int id = rs.getInt("id_carro");
                String modelo = rs.getString("ds_modelo");
                String placa = rs.getString("nr_placa");
                double motor = rs.getDouble("ds_motor");
                int automatico = rs.getInt("ds_automatico");

                //Exibir os dados
                System.out.println("Id do Carro: " + id + ", Modelo: " + modelo + ", Placa: " + placa +
                        ", Motor: " + motor + ", Automatico: " + automatico + "\n");
            }
        }catch (Exception e){
            System.err.println(e.getMessage());
        }


    }
}
