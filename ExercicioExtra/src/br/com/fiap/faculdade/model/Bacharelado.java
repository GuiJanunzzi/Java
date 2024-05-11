package br.com.fiap.faculdade.model;

public class Bacharelado extends Formacao {
    private String projetoConclusao;
    private int cargaHorariaEstagio;

    //toString
    @Override
    public String toString() {
        return super.toString() + "\nProjeto Conclusão: " + projetoConclusao + "\nCarga Horária do Estágio: " + cargaHorariaEstagio;
    }

    //Construtores
    public Bacharelado(){}

    public Bacharelado(String descricao, int periodo, double mensalidade, int duracao, String projetoConclusao, int cargaHorariaEstagio) {
        super(descricao, periodo, mensalidade, duracao);
        this.projetoConclusao = projetoConclusao;
        this.cargaHorariaEstagio = cargaHorariaEstagio;
    }

    //Método
    public double calcularMensalidade(double fator){

    }

    //Getters and Setters
    public String getProjetoConclusao() {
        return projetoConclusao;
    }

    public void setProjetoConclusao(String projetoConclusao) {
        this.projetoConclusao = projetoConclusao;
    }

    public int getCargaHorariaEstagio() {
        return cargaHorariaEstagio;
    }

    public void setCargaHorariaEstagio(int cargaHorariaEstagio) {
        this.cargaHorariaEstagio = cargaHorariaEstagio;
    }
}
