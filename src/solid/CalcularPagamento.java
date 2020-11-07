package solid;

public class CalcularPagamento {
    public double calcularPagamento(Diretor diretor) {
        return diretor.calcularPagamento();
    }

    public void batePonto(Diretor funcionario) {
        funcionario.baterPonto("22:00");
    }
}
