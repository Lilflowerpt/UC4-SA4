package senai.uc4.sa4;

import java.util.ArrayList;

public class Venda {

    private double virTotal;
    private ArrayList<Produto> listavenda;

    public Venda() {
        virTotal = 0;
        listavenda = new ArrayList<>();
    }

    public void adicionarItemVenda(Produto prod) {
        listavenda.add(prod);
        setVirTotal(getVirTotal() + prod.getPreco());
    }

    public void visualizarVenda() {
        System.out.println("Produtos no carrinho:");
        for(Produto produto : listavenda) {
            System.out.println(produto.toString());
        }
    }

    public void concluirVenda(Pagamento pag) {
        System.out.printf("Valor total: R$%.2f\n", getVirTotal());
        pag.realizarPagamento(pag);
        listavenda.clear();
        setVirTotal(0);
    }

    // Getters and Setters

    public double getVirTotal() {
        return virTotal;
    }

    public void setVirTotal(double virTotal) {
        this.virTotal = virTotal;
    }

    public ArrayList<Produto> getListavenda() {
        return listavenda;
    }

    public void setListavenda(ArrayList<Produto> listavenda) {
        this.listavenda = listavenda;
    }

    @Override
    public String toString() {
        return "Venda{" +
                "virTotal=" + virTotal +
                ", listavenda=" + listavenda +
                '}';
    }
}
