package src.model;

import java.util.Scanner;

public class Pedido extends Produto {

    public Pedido(String nome, int id, float preco, int tipo) {
        super(nome, id, preco, tipo);
    }

    public void VisualizarPedido() {
        super.visualizar();
    }

    public Produto produto(Produto produto) {
        // produto.setPreco();
        return produto;
    }
}
