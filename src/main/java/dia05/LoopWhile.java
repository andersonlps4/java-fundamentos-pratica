package dia05;

public class LoopWhile {
    public static void main(String[] args){
        System.out.println("=== Contagem com while ===");

        int contador = 1;
        while (contador <= 10){
            System.out.println("Número: " + contador);
            contador ++;
        }

        System.out.println("\n=== Tabuada do 5 ===");
        int multiplicador = 1;
        while (multiplicador <=10){
            System.out.println("5 x " + multiplicador + " = " + (5 * multiplicador));
            multiplicador++;
        }
    }
}
