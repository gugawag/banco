package br.edu.gugawag.banco;

public class AppBanco {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        Conta c2 = new Conta();
        c1.setSaldo(10.0);
        c1.setSaldo(20.0);
        System.out.println(c1.getSaldo());
    }
}
