package br.com.fiap.view;

import br.com.fiap.exception.MesesInvalidoException;
import br.com.fiap.model.Funcionario;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FuncionarioView {
    public static void main(String[] args) {
        //Instanciar um funcionario com os valores
        Funcionario funcionario1 = new Funcionario("Gustavo", 10000);
        Scanner leitor = new Scanner(System.in);

        try {
            //Pedir para o usuário a qtd de meses trabalhada
            System.out.println("Digite a quantidade de meses trabalhadas: ");
            int quantidadeMeses = leitor.nextInt();

            //Calcular o PLR do funcionário
            double plr = funcionario1.calcularPlr(true, quantidadeMeses);
            System.out.println(plr);

            //Calcular Férias
            System.out.println("Digite a quantidade de dias de férias: ");
            int diasFerias = leitor.nextInt();
            double ferias = funcionario1.calcularFerias(diasFerias);
            System.out.println(ferias);
        }catch (InputMismatchException e){
            System.err.println(e.getMessage());

        }catch (MesesInvalidoException e){
            System.err.println("Tratamento diferenciado...");

        }catch (Exception e){
            System.err.println(e.getMessage());
        }



    }
}
