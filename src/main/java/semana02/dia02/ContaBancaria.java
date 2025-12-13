package semana02.dia02;

import java.util.Scanner;

public class ContaBancaria {
    //Scanner scanner = new Scanner(System.in);
    String titular;
    double saldo;

    void depositar(double valor){
        if(valor > 0){
            saldo += valor;
            System.out.println("depósito de R$ " + valor + " realizado");
        } else {
            System.out.println("Valor inválido");
        }
    }

    boolean sacar(double valor){
        if(valor > 0 && saldo >= valor){
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado");
            return true;
        } else {
            System.out.println("Saldo insuficiente");
            return false;
        }
    }

    double consultarSaldo() {
        return saldo;
    }
}
