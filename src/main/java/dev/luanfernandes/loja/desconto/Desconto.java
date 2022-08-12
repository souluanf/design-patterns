package dev.luanfernandes.loja.desconto;

import dev.luanfernandes.loja.orcamento.Orcamento;
import lombok.AllArgsConstructor;

import java.math.BigDecimal;

/**
 * Feita a implementação de template method. Esse padrão favorece o reaproveitamento de códigos entre classes,
 * evitando assim duplicações de código.
 */
@AllArgsConstructor
public abstract class Desconto {
    protected Desconto proximo;

    /**
     * Implementação de Template Method: método modelo, que faz parte do processo e delega as demais responsabilidades
     * @param orcamento
     * @return
     */
    public BigDecimal calcular(Orcamento orcamento) {
        if (deveAplicar(orcamento)) {
            return efetuarCalculo(orcamento);
        }
        return proximo.calcular(orcamento);
    }

    /**
     * Responsável pela lógica de desconto que deve ser aplicada
     * @param orcamento
     * @return
     */
    protected abstract BigDecimal efetuarCalculo(Orcamento orcamento);

    /**
     * Responsável por validar se desconto deve ser aplicado
     * @param orcamento
     * @return
     */
    protected abstract boolean deveAplicar(Orcamento orcamento);
}
