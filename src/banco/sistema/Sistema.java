package banco.sistema;

import banco.adm.Autenticavel;
import banco.adm.Funcionario;

public class Sistema {
    String senha = "12345";

    public void autenticar(Autenticavel func) {
        boolean response = func.autenticou(this.senha);
        if(response) {
            System.out.println("acesso liberado");
        }
        else {
            System.out.println("acesso negado");
        }
    }
}
