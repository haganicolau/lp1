package banco.adm;

//DRY - DONT REPEAT YOURSELF
public abstract class Funcionario {
    protected String cpf;
    protected String nome;
    protected double salario;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public abstract double calcularBonificacao();

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return this.nome;
    }

}
