import java.util.Scanner;

public class Pratica {

    public static void main(String[] args) {

        //Coleta dos dados
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do aluno:");
        String nomeAluno = scanner.next();
        System.out.println("Digite a nota do Checkpoint:");
        float notaCp = scanner.nextFloat();
        System.out.println("Digite a nota do Challenge: ");
        float notaChallenge = scanner.nextFloat();
        System.out.println("Digite a nota da Global Solution: ");
        float notaGs = scanner.nextFloat();

        //Calculo da média
        double media = notaCp * 0.2 + notaChallenge * 0.2 + notaGs * 0.6;

        //Exibição os dados
        System.out.println("Nome: " + nomeAluno);
        System.out.println("Média: " + media);

    }
}