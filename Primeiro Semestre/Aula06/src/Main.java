import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String marca = "Tesla \nCarro elétrico";
        System.out.println(marca);
        JOptionPane.showMessageDialog(null, "CPF: \n1234567-08");

        //Comparar Strings
        String churros = new String("Doce de Leite");
        String churros2 = new String("Doce de Leite");
        //Comparar se as strings são iguais, não considerando maíusculas e minusculas
        //"equals" compara as Strings "==" não
        if (churros.equalsIgnoreCase(churros2))
            System.out.println("Churros iguais");
        else
            System.out.println("Churros diferentes");

        /**
         * Comentário de bloco
         *
         */

    }
}