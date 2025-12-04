package semana02.dia01;

public class TesteCarro {

    public static void main(String[] args){

        Carro carro1 = new Carro();
        carro1.modelo = "Palio";
        carro1.cor = "Preto";
        carro1.ano = 2025;
        carro1.marca= "Fiat";
        carro1.velocidadeAtual = 56.0;

        Carro carro2 = new Carro();
        carro2.modelo = "HB20";
        carro2.cor = "Branco";
        carro2.ano = 2024;
        carro2.marca = "hyndai";
        carro2.velocidadeAtual = 114.6;

        System.out.println("=== Carro do Anderson ===");
        System.out.println(carro1.modelo);
        System.out.println(carro1.cor);
        carro1.acelerar();

        System.out.println("\n=== Carro do Lucas ===");
        System.out.println(carro2.modelo);
        System.out.println(carro2.cor);
        carro2.acelerar();
        carro2.frear();

    }
}
