package br.com.fiap.lavanderia.model;

public class Gerente extends Funcionario{

    private double bonificacao;

    public Gerente(int id, String nome, String cpf, Endereco endereco, String cargo, double salario, double bonificacao){
        super(id, nome, cpf, endereco, cargo, salario);
        this.bonificacao = bonificacao;
    }

    public double getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(double bonificacao) {
        this.bonificacao = bonificacao;
    }
}
