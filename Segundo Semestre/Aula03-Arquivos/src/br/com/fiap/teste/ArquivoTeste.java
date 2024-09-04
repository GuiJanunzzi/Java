package br.com.fiap.teste;

import java.io.File;
import java.io.IOException;

public class ArquivoTeste {

    public static void main(String[] args) {
        try {
            //Criar um objeto que representa uma pasta
            File pasta = new File("churros");

            //Se a pasta não existir, criar a pasta
            if (!pasta.exists()){//Se a pasta não existir
                pasta.mkdir();//Criar a pasta
                System.out.println("Pasta criada!");
            }

            //Criar um arquivo dentro da pasta churros
            File arquivo = new File(pasta, "doceDeLeite.txt");
            if (!arquivo.exists()){//Se arquivo não existir
                arquivo.createNewFile();//Criar arquivo
                System.out.println("Arquivo Criado!");
            }
        }catch (IOException e){
            System.err.println("Não foi possivel criar o arquivo!");
        }
    }
}
