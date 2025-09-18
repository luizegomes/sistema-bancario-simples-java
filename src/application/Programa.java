package application;

import entities.Conta;
import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Conta conta;

        System.out.print("Digite o número da conta: ");
        int numeroConta = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite o titular da conta: ");
        String titular = sc.nextLine();
        System.out.print("Há um depósito inicial (s/n)? ");
        char depositoInicial = sc.next().charAt(0);
        double saldo = 0;
        if (depositoInicial == 's' || depositoInicial == 'S') {
            System.out.print("Insira o valor do depósito inicial: ");
            saldo = sc.nextDouble();
            conta = new Conta(numeroConta, titular, saldo);
        } else {
            conta = new Conta(numeroConta, titular);
        }

        System.out.println();
        System.out.println("Dados da conta:");
        System.out.println(conta);

        System.out.println();
        System.out.print("Insira um valor de depósito: ");
        saldo = sc.nextDouble();
        conta.deposito(saldo);
        System.out.println("Dados da conta atualizados:");
        System.out.println(conta);

        System.out.println();
        System.out.print("Insira um valor de saque: ");
        saldo = sc.nextDouble();
        conta.saque(saldo);
        System.out.println("Dados da conta atualizados:");
        System.out.println(conta);

        sc.close();
    }
}
