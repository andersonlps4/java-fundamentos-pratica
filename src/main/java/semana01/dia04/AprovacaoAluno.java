package semana01.dia04;

import java.util.Scanner;

public class AprovacaoAluno {

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Sistema de aprovação ===");

        System.out.println("Digite a nota 1");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a nota 2");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a nota 3");
        double nota3 = scanner.nextDouble();

        double media = ((nota1 + nota2 + nota3)/3);

        if (media >= 7.0) {
            System.out.println("Status: APROVADO");
        } else if (media >= 5.0) {
            System.out.println("Status: RECUPERAÇÃO");
        } else {
            System.out.println("Status: REPROVADO");
        }

        scanner.close();


    }
}
