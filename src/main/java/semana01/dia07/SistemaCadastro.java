package semana01.dia07;

import java.util.Scanner;

public class SistemaCadastro {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // variáveis para armazenar dados
        String[] nomes = new String[10];
        int[] idades = new int[10];
        double[] salarios = new double[10];
        int totalCadastros = 0;

        int opcao;

        do {
            System.out.println("\n╔════════════════════════════════╗");
            System.out.println("║   SISTEMA DE CADASTRO v1.0     ║");
            System.out.println("╚════════════════════════════════╝");
            System.out.println("1 - Cadastrar pessoa");
            System.out.println("2 - Listar pessoas");
            System.out.println("3 - Buscar pessoa por nome");
            System.out.println("4 - Estatísticas");
            System.out.println("0 - Sair");
            System.out.print("\nEscolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

        switch (opcao) {
            case 1: //cadastrar
                if (totalCadastros < 10) {
                    System.out.println("\n=== Cadastro de Pessoa ===");

                    System.out.print("Nome: ");
                    nomes[totalCadastros] = scanner.nextLine();

                    System.out.print("Idade: ");
                    idades[totalCadastros] = scanner.nextInt();

                    System.out.print("Salário: R$ ");
                    salarios[totalCadastros] = scanner.nextDouble();

                    totalCadastros++;
                    System.out.println("\n✓ Pessoa cadastrada com sucesso!");
                } else {
                    System.out.println("\n✗ Limite de cadastros atingido!");
                }
                break;

            case 2: //listar
                if (totalCadastros == 0) {
                    System.out.println("\nNenhuma pessoa cadastrada.");
                } else {
                    System.out.println("\n=== Pessoas Cadastradas ===");
                    for (int i = 0; i < totalCadastros; i++) {
                        System.out.println("\nPessoa #" + (i + 1));
                        System.out.println("Nome: " + nomes[i]);
                        System.out.println("Idade: " + idades[i] + " anos");
                        System.out.println("Salário: R$ " + String.format("%.2f", salarios[i]));
                    }
                }
                break;

            case 3: //buscar
                System.out.print("\nDigite o nome para buscar: ");
                String nomeBusca = scanner.nextLine();
                boolean encontrado = false;

                for (int i = 0; i < totalCadastros; i++) {
                    if (nomes[i].equalsIgnoreCase(nomeBusca)) {
                        System.out.println("\n✓ Pessoa encontrada!");
                        System.out.println("Nome: " + nomes[i]);
                        System.out.println("Idade: " + idades[i] + " anos");
                        System.out.println("Salário: R$ " + String.format("%.2f", salarios[i]));
                        encontrado = true;
                        break;
                    }
                }

                if (!encontrado) {
                    System.out.println("\n✗ Pessoa não encontrada.");
                }
                break;

            case 4: //estatísticas
                if (totalCadastros == 0) {
                    System.out.println("\nNenhuma pessoa cadastrada.");
                } else {
                    int somaIdades = 0;
                    double somaSalarios = 0;
                    int maisVelho = idades[0];
                    int maisNovo = idades[0];

                    for (int i = 0; i < totalCadastros; i++) {
                        somaIdades += idades[i];
                        somaSalarios += salarios[i];

                        if (idades[i] > maisVelho) {
                            maisVelho = idades[i];
                        }
                        if (idades[i] < maisNovo) {
                            maisNovo = idades[i];
                        }
                    }

                    double mediaIdade = (double) somaIdades / totalCadastros;
                    double mediaSalario = somaSalarios / totalCadastros;

                    System.out.println("\n=== Estatísticas ===");
                    System.out.println("Total de cadastros: " + totalCadastros);
                    System.out.println("Média de idade: " + String.format("%.1f", mediaIdade) + " anos");
                    System.out.println("Média salarial: R$ " + String.format("%.2f", mediaSalario));
                    System.out.println("Pessoa mais velha: " + maisVelho + " anos");
                    System.out.println("Pessoa mais nova: " + maisNovo + " anos");
                }
                break;

            case 0:
                System.out.println("\n Encerrando sistema...");
                System.out.println("Até logo!");
                break;

            default:
                System.out.println("\n✗ Opção inválida!");
        }

    } while (opcao != 0);

    scanner.close();
    }
}