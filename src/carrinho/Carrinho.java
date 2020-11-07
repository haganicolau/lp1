package carrinho;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Carrinho {
    private List<Produto> produtos;
    private Cliente cliente;
    private double precoTotal;

    public Carrinho() {
        this.produtos = new ArrayList<Produto>();
        this.precoTotal = 0;
    }

    public void inserirProduto(Produto produto) {
        this.produtos.add(produto);
        calcularPrecoTotal();
    }

    public void limparCarrinho() {
        this.produtos = new ArrayList<Produto>();
        this.precoTotal = 0;
    }

    public double calcularPrecoTotal() {
        this.precoTotal = 0;
        for(Produto produtoAux : this.produtos) {
            this.precoTotal = this.precoTotal + produtoAux.getPrecoDeVenda();
        }
        return this.precoTotal;
    }

    public void removerProduto(int sku) {
        Produto produtoToRemove = null;
        for(Produto produtoAux : this.produtos) {
            if(produtoAux.getSku() == sku) {
                produtoToRemove = produtoAux;
            }
        }
        this.produtos.remove(produtoToRemove);
        calcularPrecoTotal();
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }
}
