package senai.uc4.sa4;

public class Produto {
    //ELmanoel

    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }


    public boolean verificarEstoque(Produto prod){
        if(prod.getQuantidadeEstoque() > 0) return true;
        return false;
    }

    // Getters and Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String toString() {
        return "Produto{" +
                "nome='" + getNome() + '\'' +
                ", preco=" + getPreco() +
                ", quantidadeEstoque=" + getQuantidadeEstoque() +
                '}';
    }

}
