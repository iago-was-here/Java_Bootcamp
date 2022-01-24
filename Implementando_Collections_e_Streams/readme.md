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

- java.util.LinkedList;
  - nome_da_fila.peek(). Retorna sem remover o primeiro elemento da fila.
  - nome_da_fila.pool(). Retorna  e remove o primeiro elemento da fila.
  - nome_da_fila.element(). Retorna o primeiro elemento e lança um erro a tempo de compilação se a fila estiver vazia.
- Garante ordem de inserção
- Permite adição, leitura e remoção seguindo a regra FIFO
- Não permite mudanças de ordenação
## Set

- java.util.HashSet;
  - Criada pra trabalhar com grandes conjuntos de dados com uma performance melhor na leitura destes.
  - Utilizamos quando não se faz necessário manter uma ordenação
  - Não ordenado
  - Não permite itens repetidos
  - Não permite mudança de ordenação.
- java.util.TreeSet;
   - Utilizamos quando é necessário alterar a ordem através de comparators
   - Performático para leitura e como tem a necessidade de reordenção para modificar um elemento acaba sendo mais lento que o LinkedHashSet
- java.util.LinkedHashSet;
  - Utilizamos quando é necessário manter a ordem de inserção dos elementos
  - Por ser necessário manter a ordem é a implementação mais lenta.
- Permite adição e remoção normalmente. Não possui busca por item e atualização. Para leitura apenas navegação.

## Map

- java.util.HashMap;
  - nome-do-mapa.put(tipo de chave, tipo de valor). Adiciona ou substitui um novo elemento para o mapa.
  - nome-do-mapa.get(chave do elemento desejado). Retorna o valor do elemento passado no parametro.
  - nome-do-mapa.containsKey(chave do elemento desejado). Retorna um boolean após verificar se há a chave passada como parametro no mapa.
  - nome-do-mapa.containsValue(Valor do elemento desejado). Retorna um boolean após verificar se há o valor passado como parametro no mapa.
  - Metódos de navegação no map
    - for (Map.Entry<String, Integer> entry : nome-do-mapa.entrySet()) {
			  System.out.println(entry.getKey() + "-----" + entry.getValue());
		  }
		
		  for (String key : nome-do-mapa.keySet()) {
			  System.out.println(key + "-----" + campeoesMundialFifa.get(key));
	  	}
- java.util.TreeMap;
  - Possui metódos similares aos do TreeSet.
- java.util.HashTable;
  - Pode ser utilizado em meios que utilizam threads sincronizadas.
- Entrada de chave e valor.
- Permite valores repetidos mas não permite repetição de chave.
- Permite adição, busca por chave ou valor, atualização, remoção e navegação.
