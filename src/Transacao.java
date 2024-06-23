
public class Transacao {
    private Conta contaOrigem;
    private Conta contaDestino;
    private double valor;
    private TipoTransacao tipo;

    public Transacao(Conta contaOrigem, Conta contaDestino, double valor, TipoTransacao tipo) {
        this.contaOrigem = contaOrigem;
        this.contaDestino = contaDestino;
        this.valor = valor;
        this.tipo = tipo;
    }

    public boolean executar() {
        switch (tipo) {
            case DEPOSITO:
                contaDestino.depositar(valor);
                return true;
            case SAQUE:
                return contaOrigem.sacar(valor);
            case TRANSFERENCIA:
                if (contaOrigem.sacar(valor)) {
                    contaDestino.depositar(valor);
                    return true;
                }
                return false;
            default:
                return false;
        }
    }
    public enum TipoTransacao {
        DEPOSITO,
        SAQUE,
        TRANSFERENCIA
    }
}
