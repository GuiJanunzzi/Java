package br.com.fiap.exercicios;

import br.com.fiap.exercicios.exceptions.TaLisoExceptions;

public class ContaCorrente {
    private double saldo;
    private double limite;

    //Construtor
    public ContaCorrente(double saldo, double limite) {
        this.saldo = saldo;
        this.limite = limite;
    }

    //Métodos
    public void sacar(double valor) throws Exception{
        if (valor < 0)
            throw new Exception("O valor do saque não pode ser negativo!!");
        if (valor > saldo)
            throw new TaLisoExceptions();
        saldo -= valor;
        System.out.println("Saque de R$" + valor + " realizado com sucesso!" );
        System.out.println("O saldo atual é: R$" + saldo);
    }

    public void depositar(double valor) throws Exception{
        if (valor < 0)
            throw new Exception("O valor do deposito não pode ser negativo!!");

        saldo += valor;
        System.out.println("Deposito de R$" + valor + " realizado com sucesso!" );
        System.out.println("O saldo atual é: R$" + saldo);
    }

    //Getters and Setters
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) throws Exception{
        if (limite < 0)
            throw new Exception("O valor do limite não pode ser negativo");
        this.limite = limite;
    }
}