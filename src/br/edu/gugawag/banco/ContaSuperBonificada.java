package br.edu.gugawag.banco;

/**
 * @author Gustavo Wagner, gwmendes@trt13.jus.br
 */
public class ContaSuperBonificada extends ContaBonificada {

    public ContaSuperBonificada(String numero, Double saldo, Double porcentagemBonificacao) {
        super(numero, saldo, porcentagemBonificacao);
    }

    @Override
    public Double calcularBonus(){
        return super.calcularBonus()*2;
    }

}
