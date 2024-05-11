package br.com.fiap.faculdade.model;

public class Medio extends Formacao {
    private String tipo;

    //toString
    @Override
    public String toString() {
        return super.toString() + "\nTipo: " + tipo;
    }

    //Construtores
    public Medio(){}

    public Medio(String descricao, int periodo, double mensalidade, int duracao, String tipo) {
        super(descricao, periodo, mensalidade, duracao);
        this.tipo = tipo;
    }

    //Método
    public double calcularMensalidade(double fator){

    }

    //Getter and Setter
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
