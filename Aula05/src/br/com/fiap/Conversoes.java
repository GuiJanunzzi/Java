package br.com.fiap;

public class Conversoes {

    public static void main(String[] args) {
        // byte, short, int, long
        //float, double

        byte digito = 1;
        int digitoInt = digito;

        int numero = 1;
        byte numeroByte = (byte) numero; //cast, foça o tipo dado a ser o tipo escolhido

        float nota = 10;
        double notaDouble = nota;

        double preço = 5;
        float preçoFloat = (float) preço;

    }

}
