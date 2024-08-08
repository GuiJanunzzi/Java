import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> compras = new ArrayList<>();
        compras.add("Arroz");
        compras.add("Feijão");
        //compras.add(100); erro de compilação por causa do generics

        //1-Exibir a quantidade da lista
        int tamanho = compras.size();
        System.out.println("Itens tamanho: " + tamanho);

        //2-Remover o Feijão da lista
        compras.remove("Feijão");

        //3-Vaidar se o Macarrão está na lista
        System.out.println("Tem Macarrão? "+ compras.contains("Macarrão"));

        //4-Criar um array(Vetor) da lista
        String[] vetorCompras = compras.toArray(new String[]{});

        //5-Adicionar o Macarrão na primeira posição da lista
        compras.add(0, "Macarrão");

        //6-Exibir o item da lista de compra que está na posição 0
        System.out.println("Item na posição 0 da lista: " + compras.get(0));

        //7-Apagar toda a lista de compra
        compras.clear();

        //8-Adicionar os itens PlayStation, Xbox, Tv, Nintendo
        compras.add("PlayStation");
        compras.add("Xbox");
        compras.add("Televisão");
        compras.add("Nintendo");

        //9-Substituir o item da posição 1 por chocolate
        compras.set(1, "Chocolate");

        //10-Achar a posição do primeiro Chocolate
        System.out.println("Posição(index) do chocolate na lista: " + compras.indexOf("chocolate"));

        //11-Criar uma sublista dos dois primeiros itens da lista
        compras.subList(0, 3);

        //Percorrer a lista e exibir o item da lista
        for (String item : compras){
            System.out.println(item);
        }

    }
}