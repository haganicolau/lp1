package solid;

public abstract class Diretor {

    protected String nome;
    protected TipoDiretor cargo;
    protected int horasTrabalhadas;
    protected double precoHora;

    public abstract void baterPonto(String hora);

    public int reportarHoras() {
        return this.horasTrabalhadas;
    }

    public abstract double calcularPagamento() throws RuntimeException;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoDiretor getCargo() {
        return cargo;
    }

    public void setCargo(TipoDiretor cargo) {
        this.cargo = cargo;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getPrecoHora() {
        return precoHora;
    }

    public void setPrecoHora(double precoHora) {
        this.precoHora = precoHora;
    }
}
