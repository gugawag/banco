package br.edu.gugawag.banco;

/**
 * Copyright CSJT-Conselho Superior da Justiça do Trabalho.
 *
 * @author Gustavo Wagner, gwmendes@trt13.jus.br
 * Criada em: 02/05/2018
 */
public class Conta {

    private String numero;

    private Double saldo;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * Método para transferir um valor entre contas. A conta origem vai ser debitada o valor passado. A conta destino
     * receberá o valor passado.
     *
     * @param destino A conta que vai receber o valor
     * @param valor O valor a ser transferido
     */
    public void transferir(Conta destino, Double valor){
        this.setSaldo(this.getSaldo()-valor);
        destino.setSaldo(destino.getSaldo()+valor);
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double valor) {
        if (valor <= this.saldo ){
            this.saldo = saldo;
        }
    }
}
