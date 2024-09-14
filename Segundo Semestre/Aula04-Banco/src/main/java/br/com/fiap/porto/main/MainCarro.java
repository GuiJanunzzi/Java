package br.com.fiap.porto.main;

import br.com.fiap.porto.Model.Carro;
import br.com.fiap.porto.dao.CarroDao;

import javax.swing.*;

public class MainCarro {

    public static void main(String[] args) {
        //Ler os dados do carro
        String modelo = JOptionPane.showInputDialog("Digite o modelo do carro: ");
        String placa = JOptionPane.showInputDialog("Digite a placa do carro: ");
        float motor = Float.parseFloat(JOptionPane.showInputDialog("Digite o motor do carro: "));
        boolean automatico = JOptionPane.showConfirmDialog(null, "É automático?",
                "Automático",JOptionPane.YES_NO_OPTION) == 0;
        //Instanciar o carro
        Carro carroInsrt = new Carro(modelo, placa, motor, automatico);
        //Instanciar o DAO
        CarroDao carroDao = new CarroDao();
        //Chamar o método para cadastrar
        try {
            carroDao.cadastrar(carroInsrt);
            System.out.println("Cadastro realizado com sucesso!");
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}
