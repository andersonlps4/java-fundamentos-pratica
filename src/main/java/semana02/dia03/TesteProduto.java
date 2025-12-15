package semana02.dia03;

public class TesteProduto {

    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook", 3500.00, 10);

        Produto p2 = new Produto("Mouse", 50.00);

        Produto p3 = new Produto();
        p3.nome = "Teclado";
        p3.preco = 120.00;

        p1.exibirDetalhes();
        p2.exibirDetalhes();
        p3.exibirDetalhes();
    }
}
