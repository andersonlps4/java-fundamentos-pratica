package dia02;

public class Calculadora {
    public static void main(String[] args){
        int numero1 = 10;
        int numero2 = 3;

        int soma = numero1 + numero2;
        int subtracao = numero1 - numero2;
        int multiplicacao = numero1 * numero2;
        double divisao = (double) numero1 / numero2; //casting
        int resto = numero1 % numero2;

        System.out.println("=== Calculadora ===");
        System.out.println(numero1 + " + " + numero2 + " = " + soma);
        System.out.println(numero1 + " - " + numero2 + " = " + subtracao);
        System.out.println(numero1 + " * " + numero2 + " = " + multiplicacao);
        System.out.println(numero1 + " / " + numero2 + " = " + divisao);
        System.out.println(numero1 + " % " + numero2 + " = " + resto);
    }
}
