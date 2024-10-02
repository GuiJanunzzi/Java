package br.com.fiap.porto.mainDao;

import br.com.fiap.porto.Model.Carro;
import br.com.fiap.porto.dao.CarroDao;
import br.com.fiap.porto.exception.IdNaoEncontradoException;

import java.sql.SQLException;

public class PesquisaPorIdTeste {

    public static void main(String[] args) {
        CarroDao carroDao = new CarroDao();

        try {
            //Pesquisar um carro pelo ID
            Carro carro = carroDao.pesquisarPorId(7);

            //Exibir os dados do carro
            System.out.println("Id: " + carro.getId() + " ,Modelo: " + carro.getModelo() +
                            " ,Placa: " + carro.getNumeroPlaca() +
                            " ,Motor: " + carro.getMotor() +
                            " ,Automático? " + carro.isAutomatico());
        }catch (Exception e) {
            System.err.println(e.getMessage());
        }



    }

}
