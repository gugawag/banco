package br.edu.gugawag.banco;

import java.util.Scanner;

public class AppBanco {
    public static void main(String[] args) {
        Banco banco = new Banco("BB");
        Conta conta = new Conta("123", 100.0);

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o número da conta: ");
        String numeroConta = entrada.next();
        System.out.println("Digite o saldo inicial: ");
        Double saldoInicial = entrada.nextDouble();

        banco.criarConta(numeroConta, saldoInicial);
        banco.criarConta("456", 0.0);

        for (Conta c: banco.getContas()) {
            System.out.println(c.getNumero() + " - " + c.getSaldo());
        }

        Conta contaPesquisada = banco.buscarConta("321");
        System.out.println(contaPesquisada.getSaldo());
    }
}
