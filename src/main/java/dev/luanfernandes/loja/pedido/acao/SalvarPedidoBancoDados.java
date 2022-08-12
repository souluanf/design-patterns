package dev.luanfernandes.loja.pedido.acao;

import dev.luanfernandes.loja.pedido.Pedido;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SalvarPedidoBancoDados implements AcaoAposGerarPedido{
    public void executarAcao(Pedido pedido){
        log.info("Salvando pedidos no banco de dados");
    }
}
