package dev.luanfernandes.loja.orcamento;

import dev.luanfernandes.loja.orcamento.situacao.EmAnalise;
import dev.luanfernandes.loja.orcamento.situacao.Finalizado;
import dev.luanfernandes.loja.orcamento.situacao.SituacaoOrcamento;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
public class Orcamento {
    private BigDecimal valor;
    private int quantidadeItens;
    private SituacaoOrcamento situacao;

    public Orcamento(BigDecimal valor, int quantidadeItens) {
        this.valor = valor;
        this.quantidadeItens = quantidadeItens;
        this.situacao = new EmAnalise();
    }

    public void aplicarDescontoExtra() {
        BigDecimal valorDescontoExtra = this.situacao.calcularValorDescontoExtra(this);
        this.valor = this.valor.subtract(valorDescontoExtra);
    }
    public void aprovar() {
        this.situacao.aprovar(this);
    }
    public void reprovar() {
        this.situacao.reprovar(this);
    }
    public void finalizar() {
        this.situacao.finalizar(this);
    }
    public boolean isFinished() {
        return situacao instanceof Finalizado;
    }
}
