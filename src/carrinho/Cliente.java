package carrinho;

public class Cliente extends Pessoa {

    private String cpf;
    private String dataNascimento;
    private double dinheiroDisponivel;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getDinheiroDisponivel() {
        return dinheiroDisponivel;
    }

    public void setDinheiroDisponivel(double dinheiroDisponivel) {
        this.dinheiroDisponivel = dinheiroDisponivel;
    }
}
