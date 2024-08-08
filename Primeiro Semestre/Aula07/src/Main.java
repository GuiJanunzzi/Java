import br.com.fiap.lavanderia.model.Funcionario;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        //Instanciar um funcionário
        Funcionario funcionario = new Funcionario(01,"Cauã Aragão", "12345678900",
                null, "Assistente técnico", 3000);

        //setar o nome e cargo do funcionário
        funcionario.setNome("Jorge Roberto");
        funcionario.setCargo("Assistente técnico");

//        JOptionPane.showMessageDialog(null, funcionario.getNome() + " " + funcionario.getCargo());

        System.out.println(funcionario.getNome() + " - " + funcionario.getCargo());
    }
}