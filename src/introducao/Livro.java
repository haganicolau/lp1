package introducao;

public class Livro {

    private String titulo;
    private String editora;
    private String autor;
    private int quantidadePaginas;
    private double preco;
    private String isbn;

    public Livro(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditora() {
        return this.editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setISBN(String isbn) {
        this.isbn = isbn;
    }

    public int getQtdPaginas() {
        return this.quantidadePaginas;
    }

    public void setQuantidadePaginas(int qtdPaginas) {
        this.quantidadePaginas = qtdPaginas;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
