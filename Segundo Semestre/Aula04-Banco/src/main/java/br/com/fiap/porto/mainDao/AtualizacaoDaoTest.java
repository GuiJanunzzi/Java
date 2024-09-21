package br.com.fiap.porto.mainDao;

import br.com.fiap.porto.Model.Carro;
import br.com.fiap.porto.dao.CarroDao;

import java.sql.SQLException;

public class AtualizacaoDaoTest {
    public static void main(String[] args) {
        //Pedir para o usuário os dados do carro para atualização

        //Criar o objeto carro (Com ID)
        Carro carro = new Carro(8, "Gol", "QWE5678", 1, false);

        //Criar o objeto DAO
        CarroDao carroDao = new CarroDao();

        try {
            //Chamar o método para atualizar
            carroDao.atualizar(carro);
            System.out.println("Carro Atualizado com sucesso!");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
