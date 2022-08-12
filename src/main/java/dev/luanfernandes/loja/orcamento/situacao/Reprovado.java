package dev.luanfernandes.loja.orcamento.situacao;

import dev.luanfernandes.loja.orcamento.Orcamento;

public class Reprovado extends SituacaoOrcamento{
    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }
}
