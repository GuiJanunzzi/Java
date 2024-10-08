package br.com.fiap.porto.mainCarroDao;

import br.com.fiap.porto.Model.Carro;
import br.com.fiap.porto.dao.CarroDao;
import br.com.fiap.porto.factory.ConnectionFactory;

public class PesquisaPorIdTeste {

    public static void main(String[] args) {


        try {
            CarroDao carroDao = new CarroDao(ConnectionFactory.getConnection());

            //Pesquisar um carro pelo ID
            Carro carro = carroDao.pesquisarPorId(7);

            //Exibir os dados do carro
            System.out.println(carro);
        }catch (Exception e) {
            System.err.println(e.getMessage());
        }



    }

}
