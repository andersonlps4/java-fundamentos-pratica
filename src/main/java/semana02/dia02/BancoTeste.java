package semana02.dia02;

public class BancoTeste {

    public static void main(String [] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.titular = "Anderson Lopes";
        conta.saldo = 1000.0;

        System.out.println("Saldo inicial: R$ " + conta.consultarSaldo());

        conta.depositar(500.0);
        System.out.println("Saldo após o depósito: R$ " + conta.consultarSaldo());

        boolean saqueRealizado = conta.sacar(2000.0);
        System.out.println("Saque funcionou? " + saqueRealizado);

        conta.sacar(200.0);
        System.out.println("Saldo final: R$ " + conta.consultarSaldo());

    }
}
