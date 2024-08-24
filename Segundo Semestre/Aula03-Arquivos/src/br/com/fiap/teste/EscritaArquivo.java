package br.com.fiap.teste;

import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EscritaArquivo {
    public static void main(String[] args) {

        try {
            //Abrir o arquivo em modo escrita
            FileWriter outputStream = new FileWriter("arquivo.txt");
            PrintWriter writer = new PrintWriter(outputStream);

            //Escrever no arquivo
            String escrita = JOptionPane.showInputDialog("Digite algo que deseja escrever");
            writer.println(escrita);

            //Fechar os recursos
            outputStream.close();
            writer.close();
        }catch (IOException e){
            System.err.println(e.getMessage());
        }

    }
}
