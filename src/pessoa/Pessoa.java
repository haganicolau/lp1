package pessoa;

public abstract class Pessoa {
    protected String nome;
    protected Data data;

    public abstract String toString();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}
