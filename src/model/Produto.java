package src.model;

public class Produto {
    private String nome;
    private int id;
    private float preco;
    private int tipo;

    public Produto(String nome, int id, float preco, int tipo) {
        this.nome = nome; this.id = id; this.preco = preco; this.tipo = tipo;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void visualizar() {
        String tipo = ""; switch (getTipo()) {
            case 1:
                tipo = "Sanduíche"; break;
            case 2:
                tipo = "Bedida"; break;
            case 3:
                tipo = "Acompanhamento"; break;
            case 4:
                tipo = "Sobremesa"; break;
        } System.out.println("************************************");
        System.out.println("****** INFORMAÇÕES DO PRODUTO ******"); System.out.println("ID: " + getId());
        System.out.println("Nome: " + getNome()); System.out.println("Preço: R$ " + getPreco());
        System.out.println("Classificação: " + getTipo());
        System.out.println("************************************");

    }
}
