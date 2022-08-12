package dev.luanfernandes.loja.pedido;

import dev.luanfernandes.loja.orcamento.Orcamento;
import dev.luanfernandes.loja.pedido.acao.AcaoAposGerarPedido;

import java.time.LocalDateTime;
import java.util.List;

/*
 * Um Command Handler tem como responsabilidade, normalmente, apenas orquestrar as tarefas a
 * serem executadas, ou seja, chamar as classes necessárias que realizam as tarefas desejadas.
 * No nosso caso, o Command Handler tinha possuía o código do fluxo em seu corpo.

 * Se em algum momento uma das tarefas parar de funcionar, nós sabemos que há uma classe específica
 * para este propósito e podemos começar a depuração por ela.
 *
 * Imagine que a ferramenta utilizada para enviar mensagens eletrônicas mude depois de alguns anos. O nosso Command Handler
 * não precisa saber deste detalhe específico, então é interessante que cada
 * classe seja responsável apenas por uma pequena tarefa.
 */

/**
 * Então a ideia do Observer é, eu tenho ouvintes observadores, classes que estão observando
 * um determinado evento, uma determinada ação. No caso seria a classe "EnviarEmailPedido".
 * Ela é um observador. Ela está observando algo e quando ela for chamada ela vai executar esse código.
 * No nosso exemplo um "System.out".
 * [06:38] A classe de salvar pedido no bando também é um ouvinte, também é um observador.
 * Ela está observando uma ação e quando ela for chamada ela vai fazer esse "System.out".
 * E aqui é a classe que está disparando esse evento. Então o Observer é quando temos essa questão.
 * Você tem um evento e você tem ouvintes ou observadores desses eventos.
 * Esse Observer também é conhecido como listener. Você tem um listener, um ouvinte.
 */
public class GeraPedidoHandler {

    // construtor com injeção de dependências: repository, service, etc

    List<AcaoAposGerarPedido> acoes;

    public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
        this.acoes = acoes;
    }

    public void execute(GeraPedido dados) {
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);
        acoes.forEach(acao -> acao.executarAcao(pedido));
    }
}
