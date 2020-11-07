package carrinho;

public class Pessoa {
    protected String nome;
    protected Endereco endereco;
    protected Telefone telefone;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(
        String cep,
        String logradouro,
        int numero,
        String bairro,
        String cidade,
        String uf
    ) {
        this.endereco = new Endereco();
        this.endereco.setCep(cep);
        this.endereco.setLogradouro(logradouro);
        this.endereco.setNumero(numero);
        this.endereco.setBairro(bairro);
        this.endereco.setCidade(cidade);
        this.endereco.setUf(uf);
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }
}
