import br.com.fiap.faculdade.model.Bacharelado;
import br.com.fiap.faculdade.model.Medio;
import br.com.fiap.faculdade.model.Tecnologo;
import br.com.fiap.faculdade.model.TipoPeriodo;

import javax.swing.*;

public class TesteFormacao {

    public static void main(String[] args) {
        //Pedir para o usuário escolher qual formação será preenchida
        String formacao = JOptionPane.showInputDialog("Digite a formação (Medio, Tecnologo, Bacharelado");
        String descricao = JOptionPane.showInputDialog("Digite a descrição: ");
        //Converte uma string para uma das constantes
        TipoPeriodo periodo = TipoPeriodo.valueOf(
                JOptionPane.showInputDialog("Digite o Periodo (MANHA, TARDE, NOITE, PERIODO_INTEGRAL"));

        if (formacao.equalsIgnoreCase("Medio")){

            String tipo = JOptionPane.showInputDialog("Digite o tipo");
            //Instanciar o objeto
            Medio medio = new Medio(descricao, periodo, tipo);
            //Definir a duração
            medio.definirDuracao();
            //Calcular a mensalidade
            medio.calcularMensalidade(0.8);
            //Exibir os dados do objeto
            JOptionPane.showInputDialog(null, medio);

        } else if (formacao.equalsIgnoreCase("Tecnologo")){
            boolean planoEstendido =  Boolean.parseBoolean(JOptionPane.showInputDialog("É plano estendido (true/false)"));
            //Instanciar
            Tecnologo tecnologo = new Tecnologo(descricao, periodo, planoEstendido);
            //Chamar os metodos para configurar o periodo e mensalidade
            tecnologo.definirDuracao();
            tecnologo.calcularMensalidade(1);
            //Exibir os dados
            JOptionPane.showMessageDialog(null, tecnologo);

        } else if (formacao.equalsIgnoreCase("Bacharelado")){
            String projeto = JOptionPane.showInputDialog("Digite o projeto de TCC");
            int cargaEstagio = Integer.parseInt(JOptionPane.showInputDialog("Digite a carga horária de estágio"));
            //Instanciar
            Bacharelado bacharelado = new Bacharelado(descricao, periodo, projeto,cargaEstagio);
            //Chamar os metodos para configurar o periodo e mensalidade
            bacharelado.definirDuracao();
            bacharelado.calcularMensalidade(1.1);
            //Exibir os dados
            JOptionPane.showMessageDialog(null, bacharelado);
        }
    }
}