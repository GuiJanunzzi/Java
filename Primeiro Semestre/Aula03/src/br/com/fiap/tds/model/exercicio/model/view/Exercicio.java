package br.com.fiap.tds.model.exercicio.model.view;

import br.com.fiap.tds.model.exercicio.model.CarroTeste;
import br.com.fiap.tds.model.exercicio.model.CorTeste;

import java.sql.SQLOutput;

public class Exercicio {

    public static void main(String[] args) {
        //Instanciar um Carro
        CarroTeste corsa =  new CarroTeste();
        corsa.setModelo("Corsa");
        corsa.setPlaca("FJU5015");
        corsa.setComprimento(3.7);
        corsa.setAnoFabricacao(2006);
        corsa.setQuantidadeLugares(5);
        corsa.setQuantidadePortas(4);

        CorTeste amarelo = new CorTeste();
        amarelo.alterarCor(225,225, 0, "Amarelo");

        corsa.setCor(amarelo);

        //Exibir as informações do carro
        System.out.println(corsa.getModelo()
                + " " + corsa.getPlaca()
                + " " + corsa.getPlaca()
                + " " + corsa.getComprimento()
                + " " + corsa.getAnoFabricacao()
                + " " + corsa.getQuantidadeLugares()
                + " " + corsa.getQuantidadePortas()
                + " " + corsa.getCor().getNome()
                + ", " + corsa.getCor().getR()
                + ", " + corsa.getCor().getG()
                + ", " + corsa.getCor().getB());
    }
}
