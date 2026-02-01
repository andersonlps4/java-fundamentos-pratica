package semana02.dia05;

public class Contador {

    private static int total = 0; // compartilhado por TODAS as instâncias
    private int numero; // específico de cada objeto

    public Contador() {
        total++; // incrementa o contador global
        this.numero = total; // atribui o número atual a este objeto
        System.out.println("Objeto #" + numero + " criado. Total de objetos: " + total);
    }

    public static int getTotal() {
        return total;
    }

    public int getNumero() {
        return numero;
    }
}
