package Produto;

public  class Produto {
    protected int id;
    protected String nome;
    protected double preco;

    public Produto(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public String obterDados() {
        return String.format("ID: %d | Nome: %s | Pre;o Original: %.2f", this.id , this.nome, this.preco);
    }
}
