public class ContaCorrente extends Conta{
    private double limiteChequeEspecial;

    public ContaCorrente(int numero, Cliente cliente, double limiteChequeEspecial) {
        super(numero, cliente);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public boolean sacar(double valor) {
        if (getSaldo() + limiteChequeEspecial >= valor) {
            depositar(-valor);
            return true;
        }
        return false;
    }


    @Override
    public void aplicarRendimentos() {
        // Não há rendimentos para conta corrente
    }

}
