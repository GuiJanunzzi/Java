package br.com.fiap.porto.Model;

public class Carro {
    private int id;
    private String modelo;
    private String numeroPlaca;
    private float motor;
    private boolean automatico;
    private Concessionaria concessionaria;

    //Construtores
    public Carro(String modelo, String numeroPlaca, float motor, boolean automatico, Concessionaria concessionaria) {
        this.modelo = modelo;
        this.numeroPlaca = numeroPlaca;
        this.motor = motor;
        this.automatico = automatico;
        this.concessionaria = concessionaria;
    }

    public Carro(int id, String modelo, String numeroPlaca, float motor, boolean automatico) {
        this.id = id;
        this.modelo = modelo;
        this.numeroPlaca = numeroPlaca;
        this.motor = motor;
        this.automatico = automatico;
    }

    //Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumeroPlaca() {
        return numeroPlaca;
    }

    public void setNumeroPlaca(String numeroPlaca) {
        this.numeroPlaca = numeroPlaca;
    }

    public float getMotor() {
        return motor;
    }

    public void setMotor(float motor) {
        this.motor = motor;
    }

    public boolean isAutomatico() {
        return automatico;
    }

    public void setAutomatico(boolean automatico) {
        this.automatico = automatico;
    }

    public Concessionaria getConcessionaria() {return concessionaria;}

    public void setConcessionaria(Concessionaria concessionaria) {this.concessionaria = concessionaria;}

    //ToString

    @Override
    public String toString() {
        return "ID: " + id +
                ", Modelo: " + modelo +
                ", Placa: " + numeroPlaca +
                ", Motor: " + motor +
                ", Automatico? " + automatico;
    }
}
