package dev.luanfernandes.loja;

import dev.luanfernandes.loja.imposto.CalculadoraDeImpostos;
import dev.luanfernandes.loja.imposto.ICMS;
import dev.luanfernandes.loja.imposto.ISS;
import dev.luanfernandes.loja.orcamento.Orcamento;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

/**
 * Teste Padrão Decorator
 */
@Slf4j
public class TestImposto {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"),1);
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
        // Decorando uma classe com outra
       log.info("{}",calculadora.calcular(orcamento,new ISS(new ICMS(null))));
    }
}
