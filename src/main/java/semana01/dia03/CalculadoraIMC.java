package semana01.dia03;

import java.util.Scanner;

public class CalculadoraIMC{
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("=== Calculadora de IMC ===");

    System.out.print("Digite seu peso (kg): ");
    double peso = scanner.nextDouble();

    System.out.print("Digite sua altura (m): ");
    double altura = scanner.nextDouble();

    double imc = peso / (altura * altura);

    System.out.println("\nSeu IMC é: " + String.format("%.2f", imc));

    scanner.close();
}


}