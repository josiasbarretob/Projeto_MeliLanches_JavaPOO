package src.model;

public class Bebida extends Produto {

    private int categoria;
    private String marca;
    private String sabor;
    private int quantidadeEmEstoque;

    public Bebida(String nome, int id, float preco, int tipo, int categoria, String marca, String sabor,
            int quantidadeEmEstoque) {
        super(nome, id, preco, tipo); this.categoria = categoria; this.marca = marca; this.sabor = sabor;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void visualizar() {
        super.visualizar();

        String tipo = ""; switch (getCategoria()) {
            case 1:
                tipo = "Suco"; break;
            case 2:
                tipo = "Refrigerante"; break;
        } System.out.println("Bebida: " + tipo);
        System.out.println("Quantidade em estoque: " + getQuantidadeEmEstoque());
    }
}
