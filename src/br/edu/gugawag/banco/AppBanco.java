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
        } catch (ContaJahExistenteException e){
            System.err.println(e.getMessage());
        }

        for (Conta c: banco.getContas()) {
            System.out.println(c.toString());
        }

        ContaBonificada cb2 = new ContaBonificada("2", 100.0, 0.1);

        //Perceba que, ao passar a referência cb para println, o que vai ser executado é o método cb.toString(), que
        // sobrescrevemos de Object
        System.out.println(cb2);

        Conta cb3 = new ContaBonificada("3", 200.0, 0.2);

        //Abaixo, forma 1 de dar um cast
        ContaBonificada cb4 = (ContaBonificada)cb3;

        //Abaixo, forma 2 de dar um cast. O resultado é o mesmo do anterior. Apenas não precisamos criar nova referência
        System.out.println((((ContaBonificada) cb3).getPorcentagemBonificacao()));

        /*Perceba que, mesmo cb2 sendo uma referência do tipo conta, como ele é tb uma ContaBonificada, será usado
          o método getSaldo() de ContaBonificada, não de Conta, pois Java primeiro procura métodos nas subclasses, e
          apenas se não encontrar nas subclasses um método mais específico é que ele vai subindo na hierarquia. */
        System.out.println(cb3);

        ContaSuperBonificada csb = new ContaSuperBonificada("4", 100.0, 0.1);
        //Perceba que a ContaSuperBonificada tem sua forma de calcular seu saldo, por sobrescrever a forma de bonificar
        System.out.println(csb);


    }

    public void menu(){
        System.out.println("1 - Cadastrar conta;");
        System.out.println("2 - Buscar conta;");
    }

}
