package dev.luanfernandes.loja.imposto;

import dev.luanfernandes.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Imposto {

    private final Imposto outro;

    protected Imposto(Imposto outro) {
        this.outro = outro;
    }

    protected abstract BigDecimal realizarCalculo(Orcamento orcamento);

    public BigDecimal calcular(Orcamento orcamento){
        BigDecimal valorImposto = realizarCalculo(orcamento);
        BigDecimal valorOutroImposto = BigDecimal.ZERO;
        if (outro != null){
            valorOutroImposto = outro.realizarCalculo(orcamento);
        }
        return valorImposto.add(valorOutroImposto);
    }
}
