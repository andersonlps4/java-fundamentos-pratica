package semana02.dia05;

public class TesteStatic {

    public static void main(String[] args) {

        double valorEmDolares = 100.00;
        double valorEmReais = ConversorMoeda.converterDolarParaReal(valorEmDolares);

        System.out.println("Taxa do Dólar: " + ConversorMoeda.TAXA_DOLAR);
        System.out.println("$ " + valorEmDolares + " = R$ " + String.format("%.2f", valorEmReais));
    }
}
