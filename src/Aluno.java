public class Aluno {

    String nome;
    float notaCP;
    float notaChallenge;
    float notaGS;

    float mediaFinal(){
        float media = notaCP * 0.2f + notaChallenge * 0.2f + notaGS * 0.6f;
        return media


    }

}