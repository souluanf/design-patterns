package dev.luanfernandes.loja;

import dev.luanfernandes.loja.pedido.GeraPedido;
import dev.luanfernandes.loja.pedido.GeraPedidoHandler;
import dev.luanfernandes.loja.pedido.acao.EnviarEmailPedido;
import dev.luanfernandes.loja.pedido.acao.SalvarPedidoBancoDados;

import java.math.BigDecimal;
import java.util.List;


public class TestPedidos {
    public static void main(String[] args) {
        String cliente = "Luan Fernandes";
        BigDecimal valorOrcamento = new BigDecimal("500");
        int quantidadeItens = Integer.parseInt("2");
        GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
        GeraPedidoHandler handler = new GeraPedidoHandler(List.of(new SalvarPedidoBancoDados(),new EnviarEmailPedido()));
        handler.execute(gerador);
    }
}
