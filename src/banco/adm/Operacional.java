package banco.adm;

public class Operacional extends Funcionario implements Autenticavel {

    private Autenticador autenticador;

    public Operacional(String nome) {
        super(nome);
        this.autenticador = new Autenticador();
    }

    @Override
    public double calcularBonificacao() {
        return this.salario * 0.1;
    }

    public boolean autenticou(String senha) {
        return this.autenticador.autenticou(senha);
    }

    public void setSenha(String senha) {
        this.autenticador.setSenha(senha);
    }
}
