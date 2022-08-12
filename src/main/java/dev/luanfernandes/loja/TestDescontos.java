package dev.luanfernandes.loja;

import dev.luanfernandes.loja.desconto.CalculadoraDeDescontos;
import dev.luanfernandes.loja.orcamento.Orcamento;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Slf4j
public class TestDescontos {
    public static void main(String[] args) {

        CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();

        Orcamento orcamento1 = new Orcamento(new BigDecimal("200"),6);
        Orcamento orcamento2 = new Orcamento(new BigDecimal("1000"),1);

        log.info("{}",calculadora.calcular(orcamento1));
        log.info("{}",calculadora.calcular(orcamento2));
    }
}
