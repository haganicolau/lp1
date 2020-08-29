package entidade;

public class Pessoa {
    protected String cpf;
    protected String nome;
    protected String sobreNome;
    protected Endereco endereco;
    protected String email;
    protected String dataNascimento;
    protected Telefone telefone;
    protected TipoGenero genero;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(String cep, String logradouro, int numero, String bairro, String cidade, String uf) {
        this.endereco = new Endereco();
        this.endereco.setCep(cep);
        this.endereco.setLogradouro(logradouro);
        this.endereco.setNumero(numero);
        this.endereco.setBairro(bairro);
        this.endereco.setCidade(cidade);
        this.endereco.setUf(uf);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public TipoGenero getGenero() {
        return genero;
    }

    public void setGenero(TipoGenero genero) {
        this.genero = genero;
    }
}
