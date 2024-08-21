package br.com.fiap.model;

public class Funcionario {
    private String nome;
    private double salario;

    //Métodos
    public double calcularFerias(int dias){
        double totalFerias = (salario/30)*dias;

    }

    public double calcularPlr(double metaObtida){

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
