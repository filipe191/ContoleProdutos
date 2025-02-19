package Produto;

public class Livro extends Produto{

    private String editora;

    public Livro(int id, String nome, double preco, String editora) {
        super(id, nome, preco);
        this.editora = editora;
    }
}
