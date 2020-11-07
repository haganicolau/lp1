package solid;

public class CFO extends Diretor {

    @Override
    public void baterPonto(String hora) {
        return;
    }

    @Override
    public double calcularPagamento() throws RuntimeException {
        return this.horasTrabalhadas * 250;
    }
}
