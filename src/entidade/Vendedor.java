package entidade;

public class Vendedor extends Pessoa{

    private double comissao;
    private String matricula;

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String toString() {
        return "Vendedor{" +
                "cpf='" + cpf + '\'' +
                ", matricula=" + matricula +
                ", nome='" + nome + '\'' +
                ", sobreNome='" + sobreNome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", email='" + email + '\'' +
                ", comissao=" + comissao +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", telefone=" + telefone +
                ", genero=" + genero +
                '}';
    }
}
