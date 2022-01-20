# Implementando Collections e Steams com Java

## List

- java.util.list;
  - Collections.sort (Ordenação da list);
  - nome_da_lista.set(index,tipo de dado da lista). Alteração dos elementos da list através do indice;
  - nome_da_lista.remove(index). Remove elemento pelo indice;
  - nome_da_lista.remove(object). Remove elemento especificado nos parametros;
  - nome_da_lista.get(index). Retorna pelo indice um elemento da lista;
  - nome_da_lista.size(). Retorna o tamanho da lista;
  - nome_da_lista.contains(object). Retorna se o elemento especificado está presente na lista;
  - nome_da_lista.isEmpty(). Retorna se a lista está vazia;
  - nome_da_lista.clear(). Limpa a lista inteira
- Java.util.ArrayList;
- java.util.Vector;
- Garante ordem de inserção.
- Permite adição, atualização, leitura e remoção sem regras adicionais.
- Permite ordenação através de comparators.
  
## Queue (Filas)

- java.util.LinkedList
  - nome_da_fila.peek(). Retorna sem remover o primeiro elemento da fila.
  - nome_da_fila.pool(). Retorna  e remove o primeiro elemento da fila.
  - nome_da_fila.element(). Retorna o primeiro elemento e lança um erro a tempo de compilação se a fila estiver vazia.
- Garante ordem de inserção
- Permite adição, leitura e remoção seguindo a regra FIFO
- Não permite mudanças de ordenação
## Set
## Map
