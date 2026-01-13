package semana02.dia03;

public class Produto {
    String nome;
    double preco;
    int quantidadeEstoque;

    public Produto() {
        System.out.println("Novo produto criado!");
    }

    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    //public Produto(String nome, double preco) {
   //     this.nome = nome;
   //     this.preco = preco;
   //     this.quantidadeEstoque = 0;
   // }

    void exibirDetalhes() {
        System.out.println("Produto: " + this.nome);
        System.out.println("Preço: R$ " + this.preco);
        System.out.println("Estoque: " + this.quantidadeEstoque);
        System.out.println("-----------------");
    }
}
