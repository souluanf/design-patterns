package dev.luanfernandes.loja.pedido.acao;

import dev.luanfernandes.loja.pedido.Pedido;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EnviarEmailPedido implements AcaoAposGerarPedido{
    public void executarAcao(Pedido pedido){
        log.info("Enviando email com dados do pedido");
    }
}
