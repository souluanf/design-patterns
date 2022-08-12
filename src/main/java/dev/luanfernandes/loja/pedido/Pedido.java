package dev.luanfernandes.loja.pedido;

import dev.luanfernandes.loja.orcamento.Orcamento;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class Pedido {
    private String cliente;
    private LocalDateTime data;
    private Orcamento orcamento;
}
