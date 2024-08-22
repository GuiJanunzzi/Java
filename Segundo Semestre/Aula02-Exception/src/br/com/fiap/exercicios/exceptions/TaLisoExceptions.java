package br.com.fiap.exercicios.exceptions;

public class TaLisoExceptions extends Exception{
    public TaLisoExceptions(String mensagem){
        super(mensagem);
    }
    public TaLisoExceptions(){
        super("O valor inserido é inválido!! Tu tá liso :(");
    }
}
