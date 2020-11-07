package banco.adm;

public enum TipoFuncionario {
    FUNCIONARIO(0), GERENTE(1), SUPERVISOR(2);

    private int tipo;
    private TipoFuncionario(int tipo) {
        this.tipo = tipo;
    }
}
