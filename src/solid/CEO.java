package solid;

public class CEO extends Diretor {

    @Override
    public void baterPonto(String hora) {
        return;
    }

    @Override
    public double calcularPagamento() throws RuntimeException {
        return this.horasTrabalhadas * 1000;
    }


}
