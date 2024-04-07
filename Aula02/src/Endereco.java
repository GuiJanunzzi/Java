public class Endereco {

    String logadouro;
    short numero;
    String complemento;
    String cep;

    String retornarEndereco(){
        return logadouro + numero + complemento + cep;
    }

}
