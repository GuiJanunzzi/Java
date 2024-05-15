import br.com.fiap.faculdade.model.Medio;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String formacao = JOptionPane.showInputDialog("Qual formação você deseja instanciar");
        if (formacao.equalsIgnoreCase("Medio")){
            Medio medio = new Medio("3° Ano", "Manha", 1700.0, null, "Tecnico");
        }

    }
}