package br.edu.gugawag.banco;

import org.junit.Assert;
import org.junit.Test;

public class ContaTest {

    @Test
    public void testDebitarValorMenorSaldo(){
        // Configuracao
        Conta conta = new Conta("123", 100.0);

        // executar
        conta.debitar(99.0);

        // testar
        Assert.assertTrue(1.0 == conta.getSaldo());
    }

    @Test
    public void testTransferir(){
        // configurar
        Conta conta1 = new Conta("123", 100.0);
        Conta conta2 = new Conta("124", 200.0);

        // executar
        conta1.transferir(conta2, 100.0);

        // teste
        Assert.assertEquals(Double.valueOf(300.0), conta2.getSaldo());
        Assert.assertEquals(Double.valueOf(0.0), conta1.getSaldo());
    }
}
