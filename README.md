# Design Patterns em Java

###Conhecimento adquiridos neste projeto:

- Resolva problemas de muito ifs usando Strategy (impostos): 
  - Este padrão pode ser utilizado quando há diversos possíveis algoritmos para uma ação (como calcular imposto, por exemplo). Nele, nós separamos cada um dos possíveis algoritmos em classes separadas.
- Não repita código com Template Method (descontos):
  - O padrão Template Method favorece o reaproveitamento de códigos comuns entre classes, evitando assim duplicações de códigos.
- Saiba da importância de estudar os padrões de projeto
- Adicione comportamentos ao seu objeto com Decorator
- Crie diferentes ações com Observer
- Use o Builder para a criação de objetos complicados
- Chain of Responsability(impostos):
  -  Sempre que uma nova funcionalidade for implementada, o ideal é que possamos criar código novo e editar o mínimo possível de código já existente. Este é um dos principais pontos do princípio Aberto-Fechado (Open-Closed Principle) do SOLID. Ao editar código existente, podemos acabar quebrando funcionalidades já implementadas e funcionais.