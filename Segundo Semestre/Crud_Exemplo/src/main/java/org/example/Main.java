package org.example;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Main throw void e{
    try{
        // 1. Registrar o driver, coma url de conexão
        var conn = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "rm558461", "fiap24");
        //2. Criar um Statement
        var stmt = conn.prepareStatement("INSERT INTO T_JAVA_PRODUTOS (ID, NOME, PRECO) VALUES (DEFAULT,?,?)");
        stmt.setString(1, "Toblerone 100g");
        stmt.setDouble();
        //3.executar o statement
        stmt.executeUpdate();
        //4.fechar o statement
        stmt.close();
    }catch(SQLException e){
        e.printStackTrace();
    }
}