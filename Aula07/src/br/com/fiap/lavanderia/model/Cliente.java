package br.com.fiap.lavanderia.model;

public class Cliente extends Pesssoa{

    private boolean assinante;

    public Cliente(int id, String nome, String cpf, Endereco endereco, boolean assinante){
        super(id, nome, cpf, endereco);
        this.assinante = assinante;
    }

    public void pagar(double valor){
        //Se for assinante tem 10% de desconto
        if (assinante){
            valor *= 0.9;
        }
        //Exibir o nome e o valor a ser pago
        System.out.println(nome + " Valor a ser pago: "+ valor );

    }

    public boolean isAssinante() {
        return assinante;
    }

    public void setAssinante(boolean assinante) {
        this.assinante = assinante;
    }
}
