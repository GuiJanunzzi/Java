import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTeste {

    public static void main(String[] args) {
        //Criar um mapeamento de veículos, chave é a placa do veiculo, valor é modelo do carro
        Map<String, String> veiculos = new HashMap<>();

        //Adicionar 3 veiculos no mapeamento
        veiculos.put("ABC-1234","Civic 2.0 Preto");
        veiculos.put("FJU-5A15","Onix 1.0 Cinza");
        veiculos.put("DEF-5678","Kombi 1.0 Azul");

        //Recuperar o modelo do veiculo pela placa
        System.out.println(veiculos.get("ABC-1234"));
        System.out.println(veiculos.get("FJU-5A15"));
        System.out.println(veiculos.get("DEF-5678"));

        //Adicionar um veiculo com a mesma chave, adicionar a chave ABC-1234 o veiculo Palio 1.0 Vermelho
        veiculos.put("ABC-1234", "Palio 1.0 Vermelho");
        System.out.println(veiculos.get("ABC-1234"));

        //Exibir todos os veiculos no formato: Placa : Modelo
        Set<String> chaves = veiculos.keySet();
        for (String item : chaves){
            System.out.println(item + " : " + veiculos.get(item));
        }



    }

}
