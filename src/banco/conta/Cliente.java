package banco.conta;

import banco.adm.Autenticavel;

public class Cliente implements Autenticavel {
    private String nome;
    private String cpf;
    private String senha;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean autenticou(String senha) {
        if(senha.equals(this.senha)) {
            return true;
        } else {
            return false;
        }
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
