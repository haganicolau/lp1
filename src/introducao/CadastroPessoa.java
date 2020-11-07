package introducao;

import pessoa.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class CadastroPessoa {
    private List<Pessoa> pessoas;
    private int qtdAtual;

    public CadastroPessoa() {
        this.pessoas = new ArrayList<Pessoa>();
        this.qtdAtual = 0;
    }

    public void cadastrarPessoas(Pessoa pessoa) {
        this.pessoas.add(pessoa);
        this.qtdAtual = pessoas.size();
    }

    public void imprimiCadastro() {
        for (Pessoa pessoa : this.pessoas) {
            pessoa.toString();
            System.out.println(" ");
        }
    }

}
