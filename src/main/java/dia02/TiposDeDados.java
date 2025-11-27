package dia02;

public class TiposDeDados {
    public static void main(String[] args){
        // tipos numéricos inteiros
        int idade = 29;
        long populacao = 7_800_000_000L;

        // tipos numéricos decimais
        double salario = 3500.50;
        float altura = 1.70f;

        //tipo booleano
        boolean estudando = true;

        //tipo caractere
        char inicial = 'A';

        //string (não é primitivo)
        String nome = "Anderson Lopes";

        //imprimindo valores

        System.out.println("=== Meus dados ===");
        System.out.println("nome: "+ nome);
        System.out.println("Inicial: "+ inicial);
        System.out.println("Idade: "+ idade + " anos");
        System.out.println("Altura: "+ altura + "m");
        System.out.println("Sálario: " + estudando);
        System.out.println("População mundial: " + populacao);

    }
}
