package dev.luanfernandes.loja;

import dev.luanfernandes.loja.http.JavaHttpClient;
import dev.luanfernandes.loja.orcamento.Orcamento;
import dev.luanfernandes.loja.orcamento.RegistroOrcamento;

import java.math.BigDecimal;

public class TestAdapter {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(BigDecimal.TEN, 1);
        orcamento.aprovar();
        orcamento.finalizar();

        // Fazendo a chamada do adapter
        RegistroOrcamento registro = new RegistroOrcamento(new JavaHttpClient());
        registro.registrar(orcamento);
    }
}

