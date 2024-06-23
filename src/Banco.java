import java.util.ArrayList;
import java.util.List;

public class Banco {

    private List<Conta> contas;

    public Banco() {
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public Conta buscarConta(int numero) {
        for (Conta conta : contas) {
            if (conta.getNumero() == numero) {
                return conta;
            }
        }
        return null;
    }

    public void realizarTransacao(Transacao transacao) {
        // Lógica para processar a transação
    }
}
