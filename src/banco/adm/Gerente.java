package banco.adm;

public class Gerente extends Funcionario implements Autenticavel, TesteInterface {

    private Autenticador autenticador;

    public Gerente(String nome) {
        super(nome);
        this.autenticador = new Autenticador();
    }

    @Override
    public double calcularBonificacao() {
        return this.salario * 0.25;
    }

    public double calcularBonificacao(int tempoCasa) {
        double bonificacao = calcularBonificacao();
        if(tempoCasa > 10) {
            return bonificacao + (this.salario * 0.05);
        } else {
            return bonificacao;
        }
    }

    public boolean autenticou(String senha) {
        return this.autenticador.autenticou(senha);
    }

    public void setSenha(String senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public void testeMethod() {

    }
}
