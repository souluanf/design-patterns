package dev.luanfernandes.loja.orcamento.situacao;

import dev.luanfernandes.loja.exceptions.DomainException;
import dev.luanfernandes.loja.orcamento.Orcamento;

import java.math.BigDecimal;

/**
 * Classe implementa State: assim como o padrão Strategy, resolve o problema de muitos ifs no código.
 * Mas baseado em Estados possíveis dentro de uma entidade, quando existe regra de transição de Estado.
 */
public abstract class SituacaoOrcamento {

    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento){
        return BigDecimal.ZERO;

    }
    public void aprovar(Orcamento orcamento){
        throw new DomainException("Orçamento não pode ser aprovado");
    }

    public void reprovar(Orcamento orcamento){
        throw new DomainException("Orçamento não pode ser reprovado");
    }

    public void finalizar(Orcamento orcamento){
        throw new DomainException("Orçamento não pode ser finalizado");
    }
}
