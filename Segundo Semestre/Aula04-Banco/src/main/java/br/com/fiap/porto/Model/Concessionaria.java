package br.com.fiap.porto.Model;

public class Concessionaria {
    private int id;
    private String nome;
    private String cnpj;
    private int QtdVeiculoMaximo;

    //Construtor
    public Concessionaria() {
    }

    public Concessionaria(String nome, String cnpj, int qtdVeiculoMaximo) {
        this.nome = nome;
        this.cnpj = cnpj;
        QtdVeiculoMaximo = qtdVeiculoMaximo;
    }

    public Concessionaria(int id, String nome, String cnpj, int qtdVeiculoMaximo) {
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
        QtdVeiculoMaximo = qtdVeiculoMaximo;
    }

    //Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public int getQtdVeiculoMaximo() {
        return QtdVeiculoMaximo;
    }

    public void setQtdVeiculoMaximo(int qtdVeiculoMaximo) {
        QtdVeiculoMaximo = qtdVeiculoMaximo;
    }

    //toString
    @Override
    public String toString() {
        return "ID: " + id +
                ", Nome: " + nome +
                ", CNPJ: " + cnpj +
                ", Quantidade Máxima de Veiculos: " + QtdVeiculoMaximo;
    }
}
