package br.com.fiap;

import javax.swing.*;

public class Menu {

    public static void main(String[] args) {
        //Calculadora: digite dois numeros e escolha a opção 1-somar 2-subtrair 3-multiplicar 4-dividir

        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero 1:"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero 2:"));

        int opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção: 1-somar 2-subtrair 3-multiplicar 4-dividir"));

        switch (opcao){
            case 1:
                int soma = n1 +n2;
                JOptionPane.showMessageDialog(null, "A soma é: " + soma);
                break;
            case 2:
                int subtracao = n1 - n2;
                JOptionPane.showMessageDialog(null, "A subtração é: " + subtracao);
                break;
            case 3:
                int multiplicacao = n1 * n2;
                JOptionPane.showMessageDialog(null, "A multiplicação é: " + multiplicacao);
                break;
            case 4 :
                int divisao = n1 / n2;
                JOptionPane.showMessageDialog(null, "A divisão é: " + divisao);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção invalida!");
        }


    }//main
}//class
