package br.com.fiap.porto.mainCarroDao;

import br.com.fiap.porto.Model.Carro;
import br.com.fiap.porto.Model.Concessionaria;
import br.com.fiap.porto.dao.CarroDao;
import br.com.fiap.porto.dao.ConcessionariaDao;
import br.com.fiap.porto.factory.ConnectionFactory;

import javax.swing.*;
import java.sql.Connection;

public class CadastroDaoTest {

    public static void main(String[] args) {
        //Ler os dados do carro
        String modelo = JOptionPane.showInputDialog("Digite o modelo do carro: ");
        String placa = JOptionPane.showInputDialog("Digite a placa do carro: ");
        float motor = Float.parseFloat(JOptionPane.showInputDialog("Digite o motor do carro: "));
        boolean automatico = JOptionPane.showConfirmDialog(null, "É automático?",
                "Automático",JOptionPane.YES_NO_OPTION) == 0;
        boolean adicionarConcessionaria = JOptionPane.showConfirmDialog(null,
                "Deseja daicionar a concessionaria?",
                "Confirmação",JOptionPane.YES_NO_OPTION) == 0;
        //Instanciar o carro
        Carro carroInsrt = new Carro(modelo, placa, motor, automatico);
        try {
            //Adicionado uma concessionaria ao carro
            if (adicionarConcessionaria) {
                int idCon = Integer.parseInt(JOptionPane.showInputDialog("Digite o código da concessionaria: "));
                ConcessionariaDao concessionariaDao = new ConcessionariaDao(ConnectionFactory.getConnection());
                Concessionaria concessionaria = concessionariaDao.pesquisarPoiId(idCon);
                carroInsrt.setConcessionaria(concessionaria);
            }
            //Instanciar o DAO
            CarroDao carroDao = new CarroDao(ConnectionFactory.getConnection());
            //Chamar o método para cadastrar
            carroDao.cadastrar(carroInsrt);
            System.out.println("Cadastro realizado com sucesso!");
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }

}
