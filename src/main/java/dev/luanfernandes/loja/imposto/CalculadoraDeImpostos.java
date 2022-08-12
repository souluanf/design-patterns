package dev.luanfernandes.loja.imposto;

import dev.luanfernandes.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {

    /**
     * Aplicando Strategy
     * @param orcamento representa um objeto utilizado para fazer o orçamento de determinado produto
     * @param imposto representaa  interface que define o contrato para os cslculos de impostos
     * @return valor de imposto já calculo
     */
    public BigDecimal calcular(Orcamento orcamento, Imposto imposto){
        return imposto.calcular(orcamento);
    }
}
