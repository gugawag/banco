package br.edu.gugawag.banco;

import java.util.Scanner;

public class AppBanco {

    public static void main(String[] args) {

        AppBanco gui = new AppBanco();
        gui.menu();

        Banco banco = new Banco("BB");

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o número da conta: ");
        String numeroConta = entrada.next();
        System.out.println("Digite o saldo inicial: ");
        Double saldoInicial = entrada.nextDouble();

        try {
            banco.criarConta(numeroConta, saldoInicial);
            banco.criarConta(numeroConta, saldoInicial);
        } catch (ContaJahExistenteException e){
            System.err.println(e.getMessage());
        }

        for (Conta c: banco.getContas()) {
            System.out.println(c);
        }

    }

    public void menu(){
        System.out.println("1 - Cadastrar conta;");
        System.out.println("2 - Buscar conta;");
    }

}
