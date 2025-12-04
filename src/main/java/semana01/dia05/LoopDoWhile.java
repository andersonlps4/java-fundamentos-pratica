package semana01.dia05;

import java.util.Scanner;

public class LoopDoWhile {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== Menu ===");
            System.out.println("1 - Saldo");
            System.out.println("2 - Depósito");
            System.out.println("3 - Saque");
            System.out.println("4 - Sair");
            System.out.println("Escolha: ");

            opcao = scanner.nextInt();
            scanner.nextLine();


            switch (opcao){
                case 1:
                    System.out.println("Saldo: R$ 1000,00!");
                    break;
                case 2:
                    System.out.println("Depósito realizado!");
                    break;
                case 3:
                    System.out.println("Saque realizado!");
                    break;
                case 4:
                    System.out.println("Saindo");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 4);

        scanner.close();
    }
}
