public class ContaPoupanca extends Conta {

    private double taxaRendimento;

    public ContaPoupanca(int numero, Cliente cliente, double taxaRendimento) {
        super(numero, cliente);
        this.taxaRendimento = taxaRendimento;
    }

    @Override
    public void aplicarRendimentos() {
        double rendimento = getSaldo() * taxaRendimento;
        depositar(rendimento);
    }


}
