package semana01.dia05;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) +1;
        int tentativas = 0;
        int palpite = 0;

        System.out.println("=== Jogo da adivinhação ===");
        System.out.println("Adivinhe o número entre 1 a 100");

        while (palpite != numeroSecreto){
            System.out.println("\nSeu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite < numeroSecreto){
                System.out.println("Muito baixo! tente novamente!");
            }else if (palpite > numeroSecreto) {
                System.out.println("Muito alto, tente novamente!");
            }else {
                System.out.println("\n parabéns! você acertou!");
                System.out.println("números de tentativas: " + tentativas);
            }
        }

        scanner.close();
    }
}
