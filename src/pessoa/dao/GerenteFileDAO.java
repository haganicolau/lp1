package pessoa.dao;

import pessoa.Pessoa;

import java.util.List;

public class GerenteFileDAO extends FileDAO {

    public GerenteFileDAO() {
        super("gerente.txt");
    }

    @Override
    public List<Pessoa> read() {
        return null;
    }

    @Override
    public Pessoa convertLineToEntity(String linha) {
        return null;
    }
}
