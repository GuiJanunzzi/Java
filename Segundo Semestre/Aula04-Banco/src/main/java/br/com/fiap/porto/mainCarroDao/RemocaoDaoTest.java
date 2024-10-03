package br.com.fiap.porto.mainCarroDao;

import br.com.fiap.porto.dao.CarroDao;
import br.com.fiap.porto.factory.ConnectionFactory;

public class RemocaoDaoTest {
    public static void main(String[] args) {


        try {
            //Criar objeto DAO
            CarroDao carroDao = new CarroDao(ConnectionFactory.getConnection());
            //Chamar o método para excluir
            carroDao.excluir(9);
            System.out.println("Veiculo removido com sucesso!");
        } catch (Exception e) {
            System.err.println(e.getMessage());;
        }
    }
}
