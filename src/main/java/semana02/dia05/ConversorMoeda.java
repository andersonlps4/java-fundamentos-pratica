package semana02.dia05;

public class ConversorMoeda {

    public static final double TAXA_DOLAR = 5.15;


    public static final double IOF = 0.06;

    public static double converterDolarParaReal(double valorDolar) {
        double valorSemImposto = valorDolar * TAXA_DOLAR;
        return valorSemImposto + (valorSemImposto * IOF);
    }

}
