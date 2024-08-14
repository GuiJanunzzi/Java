package br.com.fiap.exercicios;

public class Aluno {
    private String rm;
    private String nome;
    private int idade;
    private int nota1;
    private int nota2;

    //Construtores
    public Aluno(String rm, String nome, int idade, int nota1, int nota2) {
        this.rm = rm;
        this.nome = nome;
        this.idade = idade;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    //Métodos
    public double media(){
        return (nota1 + nota2)/2;
    }

    //Getters and Setters
    public String getRm() {
        return rm;
    }

    public void setRm(String rm) {
        this.rm = rm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    //ToString
    @Override
    public String toString() {
        return
                "nome: " + nome +
                "RM: " + rm +
                "Idade: " + idade +
                "Nota1: " + nota1 +
                "Nota2: " + nota2;
    }
}
