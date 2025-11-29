package dia04;

import java.util.Scanner;

public class EstruturaCondicional {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        //if simples
        if(idade >= 18){
            System.out.println("Você é maior de idade");
        } else {
            System.out.println("Você é menor de idade");
        }

        //if encadeado
        if (idade < 12){
            System.out.println("Categoria: Criança");
        } else if (idade < 18){
            System.out.println("Categoria: Adolecente");
        } else if (idade < 60) {
            System.out.println("Categoria: Adulto");
        }else {
            System.out.println("Categoria : Idoso");
        }
        scanner.close();
    }
}
