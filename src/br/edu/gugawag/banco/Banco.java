package br.edu.gugawag.banco;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> contas;

    public Banco(String nome){
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public void criarConta(String numero, Double saldo){
        Conta conta = new Conta(numero, saldo);
        this.contas.add(conta);
    }

    public Conta buscarConta(String numero){
        for (Conta conta: this.getContas()) {
            if (numero.equals(conta.getNumero())){
                return conta;
            }
        }
        return null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }
}
