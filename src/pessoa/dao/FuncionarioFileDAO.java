package pessoa.dao;

import pessoa.Data;
import pessoa.Funcionario;
import pessoa.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioFileDAO extends FileDAO {

    public FuncionarioFileDAO() {
        super("funcionario.txt");
    }

    @Override
    public List<Pessoa> read() {
       List<String> linhas = this.openFileToRead();

       List<Pessoa> funcionarios = new ArrayList<Pessoa>();

       for(String linha : linhas) {
           Pessoa func = convertLineToEntity(linha);
           funcionarios.add(func);
       }
       return funcionarios;
    }

    public Pessoa convertLineToEntity(String linha) {
        String[] explodeLine = linha.split(";");
        Funcionario func = new Funcionario();

        String nome = explodeLine[0];
        func.setNome(nome);

        Double salario = Double.parseDouble(explodeLine[1]);
        func.setSalario(salario);

        String[] explodeData = explodeLine[2].split("/");
        int dia = Integer.parseInt(explodeData[0]);
        int mes = Integer.parseInt(explodeData[1]);
        int ano = Integer.parseInt(explodeData[2]);
        Data data = new Data(dia, mes, ano);
        func.setData(data);

        return func;
    }








}
