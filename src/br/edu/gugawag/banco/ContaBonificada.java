package br.edu.gugawag.banco;

/**
 * @author Gustavo Wagner, gugawag@gmail.com
 */
public class ContaBonificada extends Conta {

    private Double porcentagemBonificacao;

    public ContaBonificada(String numero, Double saldo, Double porcentagemBonificacao) {
        super(numero, saldo);
        this.porcentagemBonificacao = porcentagemBonificacao;
    }

    public Double getPorcentagemBonificacao() {
        return porcentagemBonificacao;
    }

    public Double calcularBonus(){
        return super.getSaldo() * this.porcentagemBonificacao;
    }

    @Override
    public Double getSaldo(){
        return super.getSaldo() + this.calcularBonus();
    }
}
