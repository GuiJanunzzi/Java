package br.com.fiap.exercicios.model;

import br.com.fiap.exercicios.ContaCorrente;
import br.com.fiap.exercicios.exceptions.TaLisoException;


import java.util.Scanner;

public class TesteContaCorrente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Instanciando uma Conta Corrente
        ContaCorrente conta = new ContaCorrente(100, 100);
        try {
            //Pedir o valor para sacar
            System.out.println("Informe o valor que deseja sacar: ");
            double saque = scanner.nextDouble();
            conta.sacar(saque);

        } catch (TaLisoException e) {
            System.err.println(e.getMessage());
        } catch (Exception e){
            System.out.println("Erro");
            System.err.println(e.getMessage());
            scanner.nextLine();
        }

        try {
            //Pedir o valor para depositar
            System.out.println("Informe o valor do deposito: ");
            double deposito = scanner.nextDouble();
            conta.depositar(deposito);

        } catch(Exception e){
            System.out.println("Error");
            System.err.println(e.getMessage());
            scanner.nextLine();
        }

        try{
            //Pedir o valor para alterar o limite
            System.out.println("Informe o novo valor do limite: ");
            double limite = scanner.nextDouble();
            conta.setLimite(limite);
            System.out.println("O novo limite é de: R$" + conta.getLimite());
        } catch (Exception e){
            System.out.println("Error");
            System.err.println(e.getMessage());
        }
    }


}
