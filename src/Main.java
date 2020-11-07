import pessoa.Data;
import pessoa.Funcionario;
import pessoa.Pessoa;
import pessoa.dao.FuncionarioFileDAO;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String [] args) {

        FuncionarioFileDAO dao = new FuncionarioFileDAO();
//        Funcionario novoFunc = new Funcionario();
//        novoFunc.setNome("Andreia Marcela");
//        novoFunc.setSalario(6000);
//        novoFunc.setData(new Data(01,12,1998));
//        dao.write(novoFunc);


        List<Pessoa> funcionarios = dao.read();
        for(Pessoa func : funcionarios ) {
            System.out.println(func.toString());
        }
    }
}


