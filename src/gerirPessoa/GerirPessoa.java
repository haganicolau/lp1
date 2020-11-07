package gerirPessoa;

import pessoa.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class GerirPessoa {
    List<Pessoa> pessoas;

    public GerirPessoa() {
        this.pessoas = new ArrayList<Pessoa>();
    }

    public void imprimirDadosPessoa(Pessoa pessoa) {
        pessoa.toString();
    }
}
