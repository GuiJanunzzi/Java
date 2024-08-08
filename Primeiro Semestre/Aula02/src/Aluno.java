public class Aluno {
    String nome;
    float notaCp;
    float notaChallenge;
    float notaGs;

    float mediaFinal(){
        float media = notaCp * 0.2f + notaChallenge * 0.2f + notaGs * 0.6f;
        return media;
    }
}