package dev.luanfernandes.loja.imposto;

import dev.luanfernandes.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class ICMS extends Imposto {

    public ICMS(Imposto outro) {
        super(outro);
    }

    /**
     * Implementação do calculo de ICMS
     * @param orcamento representa entidade utilizada para calculo de impostos
     * @return imposto de ICMS calculado
     */
    @Override
    public BigDecimal realizarCalculo(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }
}
