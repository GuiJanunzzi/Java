package br.com.fiap.porto.mainConcessionariaDao;

import br.com.fiap.porto.Model.Concessionaria;
import br.com.fiap.porto.dao.ConcessionariaDao;
import br.com.fiap.porto.factory.ConnectionFactory;

import java.sql.Connection;


public class CadastroDaoTest {
    public static void main(String[] args) {
        try {
            Connection conexao = ConnectionFactory.getConnection();
            //Criar o DAO
            ConcessionariaDao concessionariaDao = new ConcessionariaDao(conexao);
            //Criar Concessionaria
            Concessionaria c = new Concessionaria("Agulhas Negras", "1231223000112",
                                                50);
            //Cadastrar a Concessionaria
            concessionariaDao.cadastrar(c);
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}
