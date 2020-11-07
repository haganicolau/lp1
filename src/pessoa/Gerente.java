package pessoa;

public class Gerente extends Funcionario {
    private String area;

    @Override
    public String toString() {
        return this.getNome() + ";" +
                area + ";" +
                this.getData().toString() + ";";
    }

    @Override
    public double calcularImposto() {
        return this.getSalario() * 0.05;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
