package entidade;

public class Cliente extends Pessoa{

    private double dinheiroDisponivel;

    public double getDinheiroDisponivel() {
        return dinheiroDisponivel;
    }

    public void setDinheiroDisponivel(double dinheiroDisponivel) {
        this.dinheiroDisponivel = dinheiroDisponivel;
    }

    public String toString() {
        return "Cliente {" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", sobreNome='" + sobreNome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", email='" + email + '\'' +
                ", dinheiroDisponivel=" + dinheiroDisponivel +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", telefone='" + telefone + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }
}
