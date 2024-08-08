package br.com.fiap.exercicios;

import javax.swing.*;

public class TesteEleitores {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i ++){

            int idade1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a Idade da pessoa 1: "));

            if (idade1 < 16){
                JOptionPane.showMessageDialog(null,"Não eleitor");
            }
            else if (idade1 >= 18 && idade1 <= 65){
                JOptionPane.showMessageDialog(null, "Eleitor obrigatorio");
            }
            else{
                JOptionPane.showMessageDialog(null, "Eleitor facultativo");
            }

        }

    }
}
