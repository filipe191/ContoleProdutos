package Main;

import Produto.Eletronico;
import controle.ControleProdutos;

public class Main {
    public static void main(String[] args) {
        ControleProdutos controleProdutos = new ControleProdutos();

        Eletronico eletronico = new Eletronico(1, "Smarthphone", 3500.00, 0.3);

        controleProdutos.adicionarProduto(eletronico);

        controleProdutos.listarProdutos();

    }
}
