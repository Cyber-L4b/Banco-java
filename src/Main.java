
public class Main {
    public static void main(String[] args) {

        Banco banco = new Banco();

        Cliente cliente1 = new Cliente("Robson Gabriel", "123.456.789-00");
        Conta conta1 = new ContaCorrente(1, cliente1, 500.0);

        banco.adicionarConta(conta1);

        System.out.println(conta1);


    }
}