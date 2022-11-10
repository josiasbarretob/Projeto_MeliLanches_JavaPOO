package src.model;

import java.util.Arrays;
import java.util.Scanner;

public class Sanduiche extends Produto {
    //Como criar ARRAY DE STRING com os Ingredientes do produto?
    public static Scanner leia = new Scanner(System.in);
    private int i = 0;
    String[] ingredientes = new String[i];

    public Sanduiche(String nome, int id, float preco, int tipo, int quantidadeEmEstoque, String[] itens) {
        super(nome, id, preco, tipo); this.ingredientes = itens;
    }

    public String[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    //<--- PONTO DE ATENÇÃO --->
    public void incluirItens(String[] itens) {

        int quantidadeDeItens = 0; System.out.println("Digite a quantidade total de itens: ");
        quantidadeDeItens = leia.nextInt();

        while (quantidadeDeItens > 0) {
            this.ingredientes[quantidadeDeItens] = itens[quantidadeDeItens]; quantidadeDeItens++;
        }
    }

    @Override
    public String toString() {
        return "Sanduiche " + "itens: " + Arrays.toString(ingredientes) + '}';
    }
}
