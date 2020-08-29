import entidade.*;

public class Main {

    public static void main(String [] args) {

        Cliente cliente = new Cliente();
        cliente.setNome("Paulo Henrique");
        cliente.setCpf("841.294.012-11");
        cliente.setEmail("roberto@email.com");

        cliente.setEndereco("64028-785", "Comerciante Chico Regino",127,
                "Santa Cruz", "Teresina", "PI");

        cliente.setSobreNome("Silva de Morais");
        cliente.setDataNascimento("25/09/1995");
        Telefone telefone = new Telefone("862989-1243", TipoTelefone.CELULAR);
        cliente.setTelefone(telefone);
        cliente.setGenero(TipoGenero.MASCULINO);
        cliente.setDinheiroDisponivel(2000);

        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Isaque");
        vendedor.setSobreNome("Newton");
        Telefone telefone3 = new Telefone("6298765432", TipoTelefone.COMERCIAL);
        vendedor.setTelefone(telefone3);
        vendedor.setEmail("isaque@vendedor.com.br");
        vendedor.setGenero(TipoGenero.MASCULINO);
        vendedor.setCpf("11111111111");
        vendedor.setMatricula("12345678900");

        Produto produto = new Produto();
        produto.setNomeProduto("Dell Inspiron 15 3000");
        produto.setCategoria("eletronico");
        produto.setDescricao("Notebook de 15 polegadas mais leve e fino");
        produto.setPrecoCompra(980.0);
        produto.setPrecoVenda(1500.0);
        produto.setSku(1233);

        Produto produto2 = new Produto();
        produto2.setNomeProduto("Mouse Redragon");
        produto2.setCategoria("eletronico");
        produto2.setDescricao("Mouse Gamer Redragon Nothosaur M606");
        produto2.setPrecoCompra(22.0);
        produto2.setPrecoVenda(63.);
        produto2.setSku(321);

        Venda venda = new Venda(vendedor, cliente);
        venda.adicionarProdutosLista(produto);
        venda.adicionarProdutosLista(produto2);
        venda.efetuarVenda();

        System.out.println(venda);

    }
}

