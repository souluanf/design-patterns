package dev.luanfernandes.loja.http;

import dev.luanfernandes.loja.exceptions.HttpException;

import java.net.URL;
import java.net.URLConnection;
import java.util.Map;


/**
 * Esse é o padrão de projeto adapter. É um dos padrões de projeto que o objeto dele é esse, fazer uma adaptação.
 * Tenho uma classe, no nosso caso a classe RegistroDeOrcamento, ela precisa conversar com a outra classe,
 * no caso o protocolo http, só que tem várias maneiras distintas de conversar com essa outra classe, e
 * não quero ficar preso a uma dessas maneiras e não quero implementar esses detalhes de infraestrutura.
 * Então crio uma classe no meio que vai fazer essa adaptação, essa ponte entre a minha classe e
 * esse mundo externo, no caso. Essa classe vai funcionar como um adaptador. Ela está fazendo essa adaptação.
 * Utilizando interfaces e polimorfismos do jeito que fizemos deixamos nosso código bem
 * flexível, posso trocar de adaptadores. Um exemplo de adaptador do mundo real, fazendo uma
 * analogia, seria quando você vai ligar um cabo na tomada da sua casa.
 * Imagine que você comprou um celular novo, pegou o carregador dele, só que o carregador
 * dele está naquele padrão novo brasileiro, que tem os três pinos. Só que a tomada da sua casa
 * só tem dois pinos. E agora? Como faço para encaixar a tomada? O cabo na tomada. Vou ter que
 * arrancar esse terceiro pino? Vou ter que mexer no meu código, no meu carregador, digamos assim?
 * Não, você pega um T, uma extensão, você pega um adaptador, você coloca um adaptador
 * no meio e ele faz a ponte entre seu cabo e a tomada, a interface da tomada. Percebe?
 * Utilizando um adaptador não temos que mexer no nosso código.
 * E se você trocar um dia, for para outra casa, trocar o cabo e tal, você pode trocar
 * o adaptador. Pode trocar esse T, essa extensão, não vai precisar mexer em nenhum dos dois lados,
 * então você consegue criar novas adaptações, criar novos adaptadores, sem ter que mexer no seu código.
 * Percebe? Crio novos adaptadores sem mexer no código existente. Isso te dá muito mais
 * flexibilidade, deixa o código mais flexível. Esse que é o objetivo do padrão adapter.
 * Pensa um pouco no projeto que você está trabalhando, estudando, se não tem uma situação dessa,
 * que você tem duas classes, só que essa classe está dependendo de detalhes de infraestrutura demais,
 * de muitos detalhes dessa outra classe que você possa futuramente ter que trocar.
 * Tenta criar um adaptador que vai fazer essa ponte para deixar seu código mais flexível.
 * Espero que vocês tenham gostado desse padrão e vejo vocês no próximo vídeo, onde vamos continuar
 * explorando outros problemas e conhecendo outros padrões. Um abraço e até lá.
 *
 */
public class JavaHttpClient implements HttpAdapter {
    @Override
    public void post(String url, Map<String, Object> dados) {
        try {
            URL urlApi = new URL(url);
            URLConnection connection = urlApi.openConnection();
            connection.connect();
        } catch (Exception e) {
            throw new HttpException("Erro ao enviar requisição HTTP");
        }
    }
}
