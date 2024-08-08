import javax.swing.*;

public class MaiusculaTeste {

    public static void main(String[] args) {
        //Ler a String
        String palavra = JOptionPane.showInputDialog("Digite uma palavra: ");

        //Mostrar a String em maiúsculo
        JOptionPane.showMessageDialog(null, palavra.toUpperCase());

    }
}