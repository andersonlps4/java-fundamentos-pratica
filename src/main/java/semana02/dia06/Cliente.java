package semana02.dia06;

public class Cliente {
    private String nome;
    private Endereco endereco; // composição - cliente tem um endereço

    public Cliente(String nome, Endereco endereco){
        this.nome = nome;
        this.endereco = endereco;

    }

    public void exibirInformacoes(){
        System.out.println("Cliente: "+ nome);
        System.out.println("Endereço: "+ endereco.toString());
    }
}
