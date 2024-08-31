package br.com.fiap.teste;

import java.io.*;

public class LeituraArquivo {
    public static void main(String[] args) {
        try {
            //Ler o arquivo "arquivo.txt"
            FileReader fileReader = new FileReader("arquivo.txt");
            BufferedReader arquivoEntrada = new BufferedReader(fileReader);
            //Exibir os dados
            String linha;
            while ((linha = arquivoEntrada.readLine()) != null){
                System.out.println(linha);
            }

            fileReader.close();
            arquivoEntrada.close();
        } catch (IOException e){
            throw new RuntimeException(e);
        }


    }
}
