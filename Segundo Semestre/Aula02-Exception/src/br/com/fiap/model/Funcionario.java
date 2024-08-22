package br.com.fiap.model;

import br.com.fiap.exception.MesesInvalidoException;

public class Funcionario {
    private String nome;
    private double salario;

    //Métodos
    public double calcularFerias(int dias) throws MesesInvalidoException {
        //Validação de dias de ferias
        if (dias < 1 || dias > 12)
            throw new MesesInvalidoException("Quantidade de dias inválido!!");
        return (salario + salario/3)*dias/30;
    }

    //5X salario proporcional a meta obtida e meses trabalhado
    public double calcularPlr(boolean metaObtida, int meses) throws Exception{
        //Validar o meses entre 1 e 12
        if (meses < 1 || meses > 12)
            throw  new Exception("Quantidade de meses inválido!!");
        if (metaObtida)
            return salario * 5 * meses/12;
        return 0;
    }

    //Construtor
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    //Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    //ToString
    @Override
    public String toString() {
        return "Nome: " + nome +
                " Salário: " + salario;
    }
}
