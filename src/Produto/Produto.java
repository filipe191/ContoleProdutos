package Produto;

public class Produto {
    protected int id;
    protected String nome;
    protected double preco;

    public Produto(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public String obterDados() {
        return String.format("ID: %d | Nome: %s | Preço Original: %.2f | Preço com Imposto: %.2f",
                this.id, this.nome, this.preco, this.calcularPrecoComImposto());
    }

    public double calcularPrecoComImposto() {
        return this.preco * 1.08; // 8% de imposto para produtos comuns
    }
}
