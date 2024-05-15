package br.com.fiap.faculdade.model;

public class Tecnologo extends Formacao {
    private boolean planoEstendido;

    //toString
    @Override
    public String toString() {
        return super.toString() + "\nPlano estendido: " + planoEstendido;
    }

    //Construtores
    public Tecnologo(){}

    public Tecnologo(String descricao, String periodo, double mensalidade, int duracao, boolean planoEstendido) {
        super(descricao, periodo, mensalidade, duracao);
        this.planoEstendido = planoEstendido;
    }

    //Método
    @Override
    public void definirDuracao(String curso) {
        duracao = 24;
    }

    public double calcularMensalidade(double fator){
        return getDuracao() * fator * 600;
    }

    //Getter and Setter
    public boolean isPlanoEstendido() {
        return planoEstendido;
    }

    public void setPlanoEstendido(boolean planoEstendido) {
        this.planoEstendido = planoEstendido;
    }
}
