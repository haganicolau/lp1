package entidade;

import java.util.ArrayList;
import java.util.List;

public class Venda {
    private Vendedor vendedor;
    private Cliente cliente;
    private List<Produto> produtos;
    private double precoTotal;
    private StatusVenda statusVenda;

    public Venda(Vendedor vendedor, Cliente cliente) {
        this.vendedor = vendedor;
        this.cliente = cliente;

        this.produtos = new ArrayList<Produto>();
        this.statusVenda = StatusVenda.ATIVA;
    }

    public void adicionarProdutosLista(Produto produto) {
        this.produtos.add(produto);
    }

    public void efetuarVenda() {
        if(this.statusVenda == StatusVenda.CANCELADA) {
            System.out.println("Não é possível finalizar uma venda cancelada");
            return;
        }
        if(this.statusVenda == StatusVenda.FINALIZADA) {
            System.out.println("Não é possível finalizar uma venda já finalizada");
            return;
        }

        this.precoTotal = this.calcularValorVenda();
        if(!saldoSuficiente()) {
            System.out.println("Saldo insuficiente do cliente");
            return;
        }

        creditarCliente();
        this.statusVenda = StatusVenda.FINALIZADA;
    }

    private double calcularValorVenda() {
        double valorTotal = 0;
        for(Produto produtoAux : this.produtos) {
            valorTotal = valorTotal + produtoAux.getPrecoVenda();
        }
        return valorTotal;
    }

    private boolean saldoSuficiente() {
        if(this.cliente.getDinheiroDisponivel() <= this.precoTotal) {
            return false;
        }
        return true;
    }

    private void creditarCliente() {
        double valorFinal = this.cliente.getDinheiroDisponivel() - this.precoTotal;
        this.cliente.setDinheiroDisponivel(valorFinal);
    }

    public void cancelarVenda() {
        if(this.statusVenda == StatusVenda.FINALIZADA) {
            System.out.println("Não é possível cancelar uma venda finalizada");
            return;
        }

        this.statusVenda = StatusVenda.CANCELADA;
        this.produtos = new ArrayList<Produto>();
    }

    @Override
    public String toString() {
        return "Venda {" + "\n" +
                "   vendedor=" + vendedor + "\n" +
                "   cliente=" + cliente + "\n" +
                "   produtos=" + produtos + "\n" +
                "   precoTotal=" + precoTotal + "\n" +
                "   statusVenda=" + statusVenda + "\n" +
                '}';
    }
}
