# Estruturas de dados Java

## Anotações do curso:

- Conceito de Memória:
  - Memória Primária - memória volátil.
  - Memória Secundária - memória permanente.
### Tipos de Dados: 

| Tipo  |  Memória Consumida  |  Valor Mínimo  |  Valor Máximo  |  Precisão  |
|-------| ------------------- |--------------- | -------------- | -----------|
| boolean |  1 bit   |  false |  true |  -- |
|  byte   |  1 byte  |  -128 |  127 |  -- |
|  char   |  2 byte  |  '\u0000' |  '\uffff' |  -- |
|  short  |  2 byte  |  -32.768 |  32.767 |  -- |
|  int    |  4 bytes |  -2.147.483.648 |  2.147.483.647 |  -- |
|  long   |  8 bytes |  -9.223.372.036.854.770.000 |  9.223.372.036.854.770.000 |  -- |
|  float  |  4 bytes |  -3,4028E + 38 |  3,4028E + 38 |  6 -- 7 dígitos |
|  double |  8 bytes |  -17976E + 308 |  17976E + 308 |  15 dígitos |

### Atribuição e Referência:

- As atribuições em Java são por cópia de valor sempre;
- Tipo primitivo copiamos o valor em memória;
- Objetos copiamos o valor da referência em memória, sem duplicar o objeto.

### Conceito de Nó e de Encadeamento de Nó:

- Nó: espaço de memória que armazena um dado ou uma referência a outro nó;
- Conceito similar aos ponteiros em C;

### Generics em Java:

- evitar casting excessivo
- evitar redundancia de códio
- encontrar erros em tempo de compilação
- introduzido deade o Java SE 5.0
- Wildcards (Coringas)
  - Unknow Wildcards (Unbounded)
  - Bounded Wildcard (Upper Rounded/Lower Bounded)

### Pilhas (LIFO: Last In, First Out)

- Pilha de dados que se comporta de acordo com algumas regras:
  - Ultimo dado a ser inserido, é o primeiro a sair.
  - Pilha de nós, os nós inseridos fazem um apontamento para o nó inserido anteriormente e o ultimo nó possui uma referencia.
  - Metódo Top retira o nó do topo da pilha.
  - Metódo Push recoloca o nó no topo da pilha.
  - Metódo isEmpty verifica a validade da referência do nó no topo da pilha.

### Filas (FIFO: First in, First Out)

- Fila de dados que se comporta de acordo com alumas regras:
  - Primeiro dado a ser inserido, é o primeiro a sair.
  - Metódo enqueue, insere um nó no ultimo lugar da fila
  - Metódo dequeue, retira o primeiro nó no primeiro lugar da fila.
  - Metódo isEmpty verifica a validade da referência do nó no topo da pilha.

### Listas Encadeadas

- Lista de dados que se comporta de acordo com alumas regras:
  - Se comporta de forma similar a fila, com a diferença de que entradas e saidas sã controladas por indices.
  - Metódo Add, insere um nó em uma determinada posição da lista.
  - Metódo remove, remove um nó em uma determinada posição da lista.
  - Metódo get, pega uma "cópia" do nó sem exclui-lo da lista.

### Listas Duplamente Encadeadas

- Principal diferença é que cada nó posssui duas referências (nó anterior e posterior).
- Possui também duas referências de entrada (Primeiro  e ultimo nó).
- Metódo add(el) adiciona o elemento a lista
- Metódo add(index.el) adiciona o elemento a um determinado indice
- Metódo remove(index) remove o elemento passando o indice como referencia
- Metódo get(index) retorna o elemento passando o indice como referencia

### Listas Circulares

- Bem similar a uma lista encadeada simples, com a diferença que o ultimo elemento não aponta para null e sim de volta ao primeiro elemento.
- Metódo add(el), adicona um novo nó, alterando as referencias de entrada (Cabeça e Cauda);
- Metódo remove
- Metódo get(index)
- Metódo isEmpty

### Arvores (trees)

- Estrutura de dados bidimensional
- não linear
- constituída de nós que representam um modelo hierárquico
  - armazenam os dados com base em relações de dependências.
- Listas,Filas e Pilhas são estruturas lineares

- São utilizados em:
  - sistema de arquivos
  - banco dados
  - interfaces gráficas
  - páginas web
  
- características:
  - Nó: elemento da arvore que pode armazenar dados e referencia para outros nós.
  - Raiz: origem de todas as demais ramificações.
  - Pai e Filho: dois nós interligados, descente direto é o filho..
  - Irmão: nós com mesmo pai.
  - Nível de um nó: posição hierárquica com relaçãoa a raiz.
  - Altura ou profundidade: grau máximo dos nós.
  - Folha ou nó terminal: nó da ponta da arvore.
  - Nó interno: nós que não são folhas.
  - Grau de um nó: determinadad pelo n° de filhos.
  - Subarvore: nó da arvore principal sendo considerado um ramo.
  
  - Tipos de Arvores:
    - Binária
    - AVL
    - Ordenada
    - Rubro-Ngra
    - 2-3
    - 2-4
    - B
    - B+
    - Hiperbólica
  
  ### Arvore de busca binária

- Os nós maiores que a raiz sempre estarão a direita e os menores a esquerda.
- Nó da arvore binaria possui duas referencias, para a esquerda e para a direita.
- Interface Comparable utilizada para tornas objetos comparavéis.
- Inserção: compara com a raiz e então compara com os nós internos e terminais.
- Exclusão: ao exluir um elemento, substituimos-o pelo maior nó a esquerda.
- Exibição: utilizaremos algoritmos recursivos.
- Atravessamento em árvore:
  - in ordem: retorna os valores em ordem crescente.
  - pré ordem: entra pela raiz, exibe o nós e vai pelas subarvores.
  - pós ordem: retorna os valores em ordem decrescente.


### Principais implementações das estruturas de dados Java

- Equals() e hashCode():
  - Devem ser implementados juntos;
  - Tem como objetivo melhorar a busca de objetos.
- Stack:
  - Metódos:
  - push: insere um objeto na pilha;
  - pop: remove o objeto do topo da pilha;
  - peek: apenas exibe o objeto do topo da pilha;
  - empty: retorna se a pilha está vazia ou não.
  
- Queue(Interface Queue):
  - Metódos:
  - add: adicona um novo objeto a fila e se não conseguir retorna um erro;
  - offer: tenta adicionar um novo objeto a fila e se não conseguir retorna false;
  - peek: apenas exibe o objeto do inicio da fila;
  - pool: exibe e remove o objeto do inicio da fila;
  - isEmpty: retorna se a fila esta vazia.

- List:
  - Metódos:
  - add: adicona um objeto a lista;
  - contains: retorna se a lista possui o objeto passado como parâmetro;
  - get: retorna o objeto de acordo com o indice passado como parâmetro;
  - indexOf: retorna o indice do objeto passado como parâmetro;
  - remove: remove o objeto de acordo com o indice passado.

- Set(Interface Set):
  - *Conjunto* de objetos que não segue ordem de inserção;
  
- Map(Interface Map):
- 