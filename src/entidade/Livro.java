package entidade;

import exception.InvalidIdException;

public class Livro {

    private int id;
    private String nome;

    public Livro(int id, String nome) throws InvalidIdException {
        if(id < 0) {
            throw new InvalidIdException();
        }
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
