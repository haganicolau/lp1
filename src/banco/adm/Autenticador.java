package banco.adm;

//DRY - DONT REPEAT YOURSELF
public class Autenticador implements Autenticavel {
    private String senha;

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
