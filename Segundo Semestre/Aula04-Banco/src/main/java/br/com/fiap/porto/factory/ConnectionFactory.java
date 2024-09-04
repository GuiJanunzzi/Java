package br.com.fiap.porto.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public Connection getConnection(){
        Connection conn = null;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");//registrando o driver
            conn = DriverManager.getConnection(
                    "jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl", "usuario", "senha");
            System.out.println("Conectado");

            conn.close();//fechando a conexão
        }catch (ClassNotFoundException e){
            System.err.println("O driver JDBC não foi encontrado!");
            e.printStackTrace();
        }catch (SQLException e){
            System.err.println("Não foi possivel conectar com o banco de dados!");
            e.printStackTrace();
        }
        return conn;
    }

}
