package br.com.fiap.porto.mainCarroDao;

import br.com.fiap.porto.Model.Carro;
import br.com.fiap.porto.dao.CarroDao;
import br.com.fiap.porto.factory.ConnectionFactory;

import java.util.List;

public class ListagemDaoTest {
    public static void main(String[] args) {


        try{
            //Instanciar o DAO
            CarroDao carroDao = new CarroDao(ConnectionFactory.getConnection());

            //Chamar o método listar
            List<Carro> lista = carroDao.listar();
            //Exibir os dados pesquisados
            for (Carro c : lista){
                System.out.println(c.getId()+" "+c.getModelo()+" "+c.getNumeroPlaca()+" "+c.getMotor()+" "+c.isAutomatico());
            }

        }catch (Exception e){
            System.err.println(e.getMessage());
        }

    }
}
