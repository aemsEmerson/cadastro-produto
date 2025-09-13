package entities;

public class Produto {
    private String nome;
    private Double preco;
    private Integer quantidade;

    public Produto() {

    }

    public Produto(String nome, Double preco, Integer quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Double valorTotalEmEstoque() {
        return preco * quantidade;
    }

    public void adicionarEstoque(int qtd) {
        quantidade += qtd;
    }

    public void removerEstoque(int qtd) {
        if (qtd > quantidade) {
            System.out.println("Saldo insuficiente");
        } else {
            quantidade -= qtd;
        }

    }

    @Override
    public String toString() {
        return String.format
                ("DADOS: \n\tProduto : %s,\n\tPreço: %.2f,\n\tQuantidade em estoque: %d,\n\tValor Total no Estoque: %.2f\n\t",
                        nome, preco, quantidade, valorTotalEmEstoque());
    }
}
