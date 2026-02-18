package semana02.dia06;

public class TesteComposicao {
    public static void main(String[] args){
        Endereco end = new Endereco("Av. Ministro Albuquerque Lima", "200", "Fortaleza");

        Cliente cliente = new Cliente("Anderson", end);

        cliente.exibirInformacoes();
    }
}
