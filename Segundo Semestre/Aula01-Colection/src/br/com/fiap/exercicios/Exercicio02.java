package br.com.fiap.exercicios;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();
        String adicionarOutro;
        do {
            // Adicionar o aluno
            String nome = JOptionPane.showInputDialog("Digite o nome do aluno:");
            String rm = JOptionPane.showInputDialog("Digite o rm do aluno:");
            String idade = JOptionPane.showInputDialog("Digite a idade do aluno:");
            String nota1 = JOptionPane.showInputDialog("Digite a nota 1:");
            String nota2 = JOptionPane.showInputDialog("Digite a nota 2:");
            Aluno aluno = new Aluno(rm, nome, Integer.parseInt(idade), Integer.parseInt(nota1), Integer.parseInt(nota2));
            alunos.add(aluno);//Adiciona aluno na lista
            //Perguntar se deseja adicionar mais alunos
            adicionarOutro = JOptionPane.showInputDialog("Deseja adicionar outro aluno? (S/N):");
        } while (!adicionarOutro.equalsIgnoreCase("N"));
        double somaMediaGeral = 0;
        int somaIdadeGeral = 0;
        int maiorIdade = 0;
        int menorIdade = alunos.get(0).getIdade();
        //Imprimir alunos
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
            somaMediaGeral += aluno.media();
            somaIdadeGeral += aluno.getIdade();
            if (aluno.getIdade() > maiorIdade)
                maiorIdade = aluno.getIdade();
            if (aluno.getIdade() < menorIdade)
                menorIdade = aluno.getIdade();
        }
        alunos.toArray();

        System.out.println("O total de alunos cadastrados é: " + alunos.size());
        System.out.println("Media de notas: " + somaMediaGeral / alunos.size());
        System.out.println("Media de idade; " + somaIdadeGeral / alunos.size());
        System.out.println("Maior idade: " + maiorIdade);
        System.out.println("Menor idade: " + menorIdade);

        //Menu ao usuario
        Scanner leitor = new Scanner(System.in);
        System.out.println("Menu de opções:\n" +
                "1- Imprimir nomes e médias de todos os alunos\n" +
                "2- Imprimir nomes dos alunos que possuem média acima de 6.0\n" +
                "3- Imprimir nomes dos alunos que possuem idade acima de 30\n" +
                "4- Excluir os alunos com médias menores que 3.0\n" +
                "5- Sair do sistema\n" +
                "Escolha uma opção: ");
        String escolha = leitor.next() + leitor.nextLine();

        do {

            switch (escolha) {
                case "1":
                    for (Aluno aluno : alunos) {
                        System.out.println(aluno + "Média: " + aluno.media());
                    }
                    break;
                case "2":
                    for (Aluno aluno : alunos) {
                        if (aluno.media() >= 6.0) {
                            System.out.println(aluno);
                        }
                    }
                    break;
                case "3":
                    for (Aluno aluno : alunos) {
                        if (aluno.getIdade() >= 30) {
                            System.out.println(aluno);
                        }
                        break;
                    }
                case "4":
                    for (Aluno aluno : alunos) {
                        if (aluno.media() <= 3.0) {
                            //alunos.remove(aluno.indexOf());
                        }
                    }
                case "5":
                    escolha = "sair";
                    break;
            }


        }while (!(escolha == "sair"));
    }
}
