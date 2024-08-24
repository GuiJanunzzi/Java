package br.com.fiap.exercicios.exceptions;

public class TaLisoException extends Exception{
    public TaLisoException(String mensagem){
        super(mensagem);
    }
    public TaLisoException(){
        super("O valor inserido é inválido!! Tu tá liso :(");
    }
}
