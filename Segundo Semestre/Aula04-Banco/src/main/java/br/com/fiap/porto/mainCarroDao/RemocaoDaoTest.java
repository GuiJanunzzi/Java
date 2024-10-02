package br.com.fiap.porto.mainCarroDao;

import br.com.fiap.porto.dao.CarroDao;

public class RemocaoDaoTest {
    public static void main(String[] args) {
        //Criar objeto DAO
        CarroDao carroDao = new CarroDao();

        try {
            //Chamar o método para excluir
            carroDao.excluir(9);
            System.out.println("Veiculo removido com sucesso!");
        } catch (Exception e) {
            System.err.println(e.getMessage());;
        }
    }
}
