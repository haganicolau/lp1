package pessoa;

public class Funcionario extends Pessoa {
    private double salario;

    @Override
    public String toString() {
        return this.getNome() + ";" +
                salario + ";" +
                this.getData().toString();
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularImposto() {
        return this.salario * 0.03;
    }
}
