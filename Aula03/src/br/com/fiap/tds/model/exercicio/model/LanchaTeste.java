package br.com.fiap.tds.model.exercicio.model;

import br.com.fiap.tds.model.exercicio.model.CorTeste;

public class LanchaTeste {
    private String modelo;
    private int quantidadeLugares;
    private double comprimento;
    private int anoFabicacao;
    private CorTeste cor;
    private int quantidadeMotores;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getQuantidadeLugares() {
        return quantidadeLugares;
    }

    public void setQuantidadeLugares(int quantidadeLugares) {
        this.quantidadeLugares = quantidadeLugares;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public int getAnoFabicacao() {
        return anoFabicacao;
    }

    public void setAnoFabicacao(int anoFabicacao) {
        this.anoFabicacao = anoFabicacao;
    }

    public CorTeste getCor() {
        return cor;
    }

    public void setCor(CorTeste cor) {
        this.cor = cor;
    }

    public int getQuantidadeMotores() {
        return quantidadeMotores;
    }

    public void setQuantidadeMotores(int quantidadeMotores) {
        this.quantidadeMotores = quantidadeMotores;
    }
}
