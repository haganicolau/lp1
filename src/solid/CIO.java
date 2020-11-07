package solid;

public class CIO extends Diretor {

    @Override
    public void baterPonto(String hora) {
        return;
    }

    @Override
    public double calcularPagamento() throws RuntimeException {
        return this.horasTrabalhadas * 500;
    }
}
