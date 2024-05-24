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

    public Bacharelado(String descricao, TipoPeriodo periodo, String projetoConclusao, int cargaHorariaEstagio) {
        super(descricao, periodo);
        this.projetoConclusao = projetoConclusao;
        this.cargaHorariaEstagio = cargaHorariaEstagio;
    }

    //Método
    @Override
    public void definirDuracao() {
        if (descricao.toUpperCase().contains("ENGENHARIA")){
            duracao = 60;
        } else {
            duracao = 48;
        }

    }

    public double calcularMensalidade(double fator){
        return mensalidade =(getDuracao() * fator * 600) + (cargaHorariaEstagio * 12);
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
