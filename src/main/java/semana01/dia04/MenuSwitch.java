package semana01.dia04;

import java.util.Scanner;

public class MenuSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Menu de Opções ===");
        System.out.println("1 - Café");
        System.out.println("2 - Chá");
        System.out.println("3 - Suco");
        System.out.println("4 - Água");
        System.out.print("\nEscolha uma opção: ");

        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Você escolheu: Café ☕");
                System.out.println("Preço: R$ 3,50");
                break;
            case 2:
                System.out.println("Você escolheu: Chá 🍵");
                System.out.println("Preço: R$ 2,50");
                break;
            case 3:
                System.out.println("Você escolheu: Suco 🧃");
                System.out.println("Preço: R$ 5,00");
                break;
            case 4:
                System.out.println("Você escolheu: Água 💧");
                System.out.println("Preço: R$ 2,00");
                break;
            default:
                System.out.println("Opção inválida!");
        }

        scanner.close();
    }
}
