package br.edu.gugawag.banco;

public class Conta {

    private String numero;
    private Double saldo;

    public Conta(){
    }

    public Conta(String numero, Double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

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
        this.debitar(valor);
        destino.creditar(valor);
    }

    public Double getSaldo() {
        return saldo;
    }

    public void debitar(Double valor) {
        this.saldo -= valor;
    }

    public void creditar(Double valor) {
        this.saldo += valor;
    }

    public String toString() {
        return "Número: " + this.getNumero() + " - Saldo: " + this.getSaldo();
    }
}
