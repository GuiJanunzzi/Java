package br.com.fiap.porto.mainCarroDao;

import br.com.fiap.porto.Model.Carro;
import br.com.fiap.porto.dao.CarroDao;
import br.com.fiap.porto.factory.ConnectionFactory;

public class AtualizacaoDaoTest {
    public static void main(String[] args) {
        //Pedir para o usuário os dados do carro para atualização

        //Criar o objeto carro (Com ID)
        Carro carro = new Carro(9, "Gol", "QWE5678", 1, false);

        try {
            //Criar o objeto DAO
            CarroDao carroDao = new CarroDao(ConnectionFactory.getConnection());

            //Chamar o método para atualizar
            carroDao.atualizar(carro);
            System.out.println("Carro Atualizado com sucesso!");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
