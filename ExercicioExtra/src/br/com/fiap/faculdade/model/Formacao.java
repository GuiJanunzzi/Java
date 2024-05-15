package br.com.fiap.faculdade.model;

//Classe abstrata -> não pode ser instanciada
// e pode conter métodos abstratos
public abstract class Formacao {
    protected String descricao;
    private TipoPeriodo periodo;
    private double mensalidade;
    protected int duracao;

    //toString
    @Override
    public String toString() {
        return "Descrição: " + descricao + "\nPeriodo: " + periodo + "\nMensalidade: " + mensalidade + "\nDuração: " + duracao;
    }

    //Construtores
    public Formacao(){}

    public Formacao(String descricao, String periodo, double mensalidade, int duracao) {
        this.descricao = descricao;
        this.periodo = periodo;
        this.mensalidade = mensalidade;
        this.duracao = duracao;
    }

    //Métodos
    //Método abstrato -> sem implementação
    public abstract void definirDuracao(String curso);

    public double calcularMedia(double global1, double global2){
        return global1 * 0.4 + global2 * 0.6;
    }

    public double calcularMedia(double global1, double checkpoit1, double challenge1, double global2, double checkpoint2, double challenge2){
        double semestre1 = global1 * 0.6 + checkpoit1 * 0.2 + challenge1 * 0.2;
        double semestre2 = global2 * 0.6 + checkpoint2 * 0.2 + challenge2 * 0.2;
        return semestre1 * 0.4 + semestre2 * 0.6;
    }

    public double calcularMedia(double checkpoint1, double checkpoint2, double checkpoint3){
        double media = 0;
        if (checkpoint1 > checkpoint2 && checkpoint3 > checkpoint2){
            media = (checkpoint1 + checkpoint3) / 2;
        }else if (checkpoint1 > checkpoint3 && checkpoint2 > checkpoint3){
            media = (checkpoint1 + checkpoint2) / 2;
        }else {
            media = (checkpoint2 + checkpoint3) /2;
        }
        return media;
    }

    //Getters and Setters
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }

    public int getDuracao() {
        return duracao;
    }
}
