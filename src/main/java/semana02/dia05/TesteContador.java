package semana02.dia05;

public class TesteContador { public static void main(String[] args) {
    Contador c1 = new Contador();
    Contador c2 = new Contador();
    Contador c3 = new Contador();

    System.out.println("\nTotal de objetos criados: " + Contador.getTotal());
}

}
