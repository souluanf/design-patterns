package dev.luanfernandes.loja.orcamento;

import dev.luanfernandes.loja.exceptions.DomainException;
import dev.luanfernandes.loja.http.HttpAdapter;

import java.util.Map;

public class RegistroOrcamento {

    private final HttpAdapter http;

    public RegistroOrcamento(HttpAdapter http) {
        this.http = http;
    }

    // Implementação do padrão adapter
    public void registrar(Orcamento orcamento){
        if (!orcamento.isFinished()){
            throw new DomainException("Orçamento não finalizado");
        }
        String url = "https://api.exter/orcamento";
        Map<String, Object> dados = Map.of(
                "valor",orcamento.getValor(),
                "quantidadeItens",orcamento.getQuantidadeItens()
        );
        http.post(url,dados);
    }
}
