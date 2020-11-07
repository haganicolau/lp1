package banco.adm;

public class Terceirizado extends Funcionario {

    public Terceirizado(String nome) {
        super(nome);
    }

    @Override
    public double calcularBonificacao() {
        return 0 * 0.3;
    }

    public boolean autenticou(String senha) {
        return false;
    }
}
