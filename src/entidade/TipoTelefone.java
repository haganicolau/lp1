package entidade;

public enum TipoTelefone {
    RESIDENCIAL(1), CELULAR(2), COMERCIAL(3);

    private int valor;

    TipoTelefone(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return this.valor;
    }
}
