package dia03;

import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura (m)");
        double altura = scanner.nextDouble();

        System.out.println("Está empregado? (true/false): ");
        boolean empregado = scanner.nextBoolean();

        System.out.println("\n=== Dados Cadastrados ===");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Altura: " + altura + "m");
        System.out.println("Empregado: " + (empregado ? "Sim" : "Não"));

        scanner.close();
    }
}
