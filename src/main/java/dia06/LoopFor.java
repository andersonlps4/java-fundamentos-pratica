package dia06;

public class LoopFor {
    public static void main(String[] args){
        for (int i = 1; i <= 10; i++){
            System.out.println("Número: " + i);
        }

        System.out.println("\n === Números pares de 0 a 20 ===");
        for (int i = 0; i <= 20; i+=2){
            System.out.println(i);
        }

        System.out.println("\n=== Contagem regressiva ===");
        for (int i = 10; i >= 1; i--){
            System.out.println(i);
        }
        System.out.println("Lançamento");
    }
}
