package br.com.fiap.teste.exercicio;

import javax.swing.*;
import java.io.*;

public class Exercicio2 {
    public static void main(String[] args) {
        try {
            //Lendo os arquivos
            FileReader leitor = new FileReader("exercicio.txt");
            BufferedReader arquivosEntrada = new BufferedReader(leitor);
            //Abrir o arquivo em modo escrita
            //Neste caso tem que estar dentro do while por algum motivo que não sei
            FileWriter outputStream = new FileWriter("exercicioSaida.txt", true);
            PrintWriter writer = new PrintWriter(outputStream);

            //Somar
            String numero;
            while ((numero = arquivosEntrada.readLine()) != null){

                //Separando os numeros e fazendo o parse deles pelo index
                String[] vetor = numero.split(";");
                double nr1 = Double.parseDouble(vetor[0]);
                double nr2 = Double.parseDouble(vetor[1]);
                double soma = nr1 + nr2;

                //Printando no arquivo
                writer.println("Numero 1: " + nr1 + " Numero 2: " + nr2+ " Soma: " + soma);


            }

            outputStream.close();
            writer.close();
            leitor.close();
            arquivosEntrada.close();
        } catch (IOException e){
            throw new RuntimeException(e);
        }

    }
}
