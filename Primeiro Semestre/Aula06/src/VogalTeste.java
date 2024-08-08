import javax.swing.*;

public class VogalTeste {

    public static void main(String[] args) {
        String vogal = JOptionPane.showInputDialog("Digite uma palavra: ");

//        String vogalModificada = vogal.replace("a", "*")
//                .replaceAll("e", "*")
//                .replaceAll("i", "*")
//                .replaceAll("o", "*")
//                .replaceAll("u", "*");

        for(int i=0; i< vogal.length(); i++){
            char caractere = vogal.charAt(i);
            if ("aeiouAEIOU".indexOf(caractere)!= -1)
                vogal = vogal.replace(caractere, '*');
        }

        JOptionPane.showMessageDialog(null, vogal);
    }
}
