package dev.luanfernandes.loja.imposto;

import dev.luanfernandes.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class ISS extends Imposto{

    public ISS(Imposto outro) {
        super(outro);
    }

    /**
     * Implementação do calculo de ISS
     * @param orcamento representa entidade utilizada para calculo de impostos
     * @return imposto de ISS calculado
     */

    @Override
    public BigDecimal realizarCalculo(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal("0.06"));
    }
}
