package banco.conta;

public class AbrirContaException extends Exception {
    public AbrirContaException() {
        super("Saldo insuficiente para abertura de conta");
    }
}
