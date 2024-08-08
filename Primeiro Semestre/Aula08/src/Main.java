import br.com.fiap.loja.model.Livro;
import br.com.fiap.loja.model.Produto;

public class Main {
    public static void main(String[] args) {

        //Criar um objeto do tipo livro, com os valores
        Livro livro = new Livro(01, ".", ".", 30, 200,
                "editora", "genero", "fulanos");

        //Calcular o desconto com %
        double valorComDesconto = livro.calcularPrecoComDesconto(20.0);
        System.out.println("Desconto com %: " + valorComDesconto);

        //Calcular o desconto com a
        valorComDesconto = livro.calcularPrecoComDesconto(10);
        System.out.println("Desconto por quantidade: " + valorComDesconto);

        //Calcular o desconto com o Cupom
        valorComDesconto = livro.calcularPrecoComDesconto("FIAPLIVRO");
        System.out.println("Desconto com cupom: " + valorComDesconto);

        Produto livro2 = new Livro();
        livro2.setPreco(50);
        valorComDesconto = livro2.calcularPrecoComDesconto("FIAPLIVRO");
        System.out.println("Segundo livro com desconto: " + valorComDesconto);

        System.out.println(livro);

    }
}