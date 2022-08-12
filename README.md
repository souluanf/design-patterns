# Design Patterns em Java

### Exemplos práticos de alguns dos padrões.

#### Strategy
Este padrão pode ser utilizado quando há diversos possíveis algoritmos para uma ação (como calcular imposto, por exemplo). Nele, nós separamos cada um dos possíveis algoritmos em classes separadas. De modo geral resolva problemas de muito ifs. 

#### Template Method
O padrão Template Method favorece o reaproveitamento de códigos comuns entre classes, evitando assim duplicações de códigos.
#### Decorator
Adicione comportamentos ao seu objeto
#### Observer
Crie diferentes ações
#### Builder
Criação de objetos complicados
#### Chain of Responsibility:
Sempre que uma nova funcionalidade for implementada, o ideal é que possamos criar código novo e editar o mínimo possível de código já existente. Este é um dos principais pontos do princípio Aberto-Fechado (Open-Closed Principle) do SOLID. Ao editar código existente, podemos acabar quebrando funcionalidades já implementadas e funcionais.