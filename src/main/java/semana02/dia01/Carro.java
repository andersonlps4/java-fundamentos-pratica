package semana02.dia01;

public class Carro {

        String modelo;
        String marca;
        int ano;
        String cor;
        double velocidadeAtual;

        void acelerar() {
            velocidadeAtual += 10;
            System.out.println(modelo + " Acelerou! Velocidade: "+ velocidadeAtual + "km/h");
        }

        void frear() {
            velocidadeAtual -= 10;
            System.out.println(modelo + " Freou! Velocidade: "+ velocidadeAtual + "km/h");
        }

}
