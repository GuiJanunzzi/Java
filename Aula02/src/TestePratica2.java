public class TestePratica2 {

    public static void main(String[] args) {

        Endereco casaGui = new Endereco();

        casaGui.logadouro = "Rua Ipiranga";
        casaGui.numero = 242;
        casaGui.complemento = "casa";
        casaGui.cep = "06130-040";

        Cliente gui = new Cliente();

        gui.nome = "Guilherme Janunzzi";
        gui.cpf = "502.844.918-02";
        gui.endereco = casaGui;

        ContaCorrente conta = new ContaCorrente();

        conta.saldo = 0;
        conta.titular = gui;

        conta.depositar(200);
        conta.retirar(10);
        double saldoNaConta = conta.retornarSaldo();

        String pessoa = gui.retornarDados();

        String rua = casaGui.retornarEndereco();

        System.out.println(saldoNaConta);
        System.out.println(pessoa + rua);

    }

}
