package entities;

public class Conta {

    private int numeroConta;
    private String titular;
    private double saldo;

    public Conta(int numeroConta, String titular, double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public Conta(int numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposito(double saldo) {
        this.saldo += saldo;
    }

    public void saque(double saldo) {
        this.saldo -= (saldo + 5);
    }
    
    public String toString(){
        return "Conta "
                + numeroConta
                + ", Titular: "
                + titular
                + ", Saldo: $ "
                + String.format("%.2f", saldo);
    }
}
