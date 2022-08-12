package dev.luanfernandes.loja.desconto;

import dev.luanfernandes.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {

    /**
     * Aplicação de Chain of Reponsability. Para cada tipo, verifica se o desconto é aplicado ou não.
     * Ele vefica ‘item’ por ‘item’, como cadeia. Caso ele nao seja plicado chama o próximo, até o encontrar.
     * @param orcamento Entidade responsável pelo orçamento do produto/serviço
     * @return retorna desconto se disponível
     */
    public BigDecimal calcular(Orcamento orcamento) {
        Desconto cadeiraDescontos = new DescontoOrcamentoMaisDeCincoItens(
                new DescontoOrcamentoValorMaiorQuinhentos(
                        new SemDesconto()
                )
        );
        return cadeiraDescontos.calcular(orcamento);
    }
}
