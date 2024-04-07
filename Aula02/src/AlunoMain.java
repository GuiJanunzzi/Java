import java.util.Scanner;

public class AlunoMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // ler os dados: nome, nota gs, cp e challenge
        System.out.println("Digite o nome do aluno: ");
        String nome = scanner.next() + scanner.nextLine();
        System.out.println("Digite a nota da Global Solution: ");
        float notaGs = scanner.nextFloat();
        System.out.println("Digite a nota do Checkpoint: ");
        float notaCp = scanner.nextFloat();
        System.out.println("Digite a nota do Challenge: ");
        float notaChallenge = scanner.nextFloat();

        // calcular e exibir a media do aluno
        double media = notaGs * 0.6 + notaCp * 0.2 + notaChallenge * 0.2;

        System.out.println("A média do " + nome + " é " + media);

    }

}
