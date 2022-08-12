package dev.luanfernandes.loja.pedido;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@AllArgsConstructor
public class GeraPedido {
    private String cliente;
    private BigDecimal valorOrcamento;
    private int quantidadeItens;
}
