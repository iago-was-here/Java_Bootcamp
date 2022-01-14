## Collections Java

 * Uma coleção é uma estrutura de dados, que pode armazenar referência a outros objetos
 * Para escolher qual collection será melhor para a aplicação sendo desenvolvida, devemos levar em consideração:
   * requisitos de memória, características  de desempenho dos metódos  de adição, remoção, pesquisa e classificação de elementos.
### Set

- java.util.set;
- não permite elementos duplicados;
- não possui índice;
- HashSet armazena seus dados em uma tabela de hash.
- TreeSet armazena seus dados em uma árvore.

### List

- java.util.list
- permite elementos duplicados.
-  Implementada por várias classes, dentre elas ArrayList, LinkedList e Vector.
-  Metódos:
   -  sort (classifica os elementos de uma list).
   -  binarySearch (localiza um objeto em uma list usando o algoritmo de pesquisa binária de alto desempenho).
   -  reverse (inverte os elementods de uma list).
   -  shuffle (ordena aleatoriamente os elentos de uma list).
   -  fill (configura todo elemento list para referir-se a um objeto especificado).
   -  copy (copia referências de uma list em outra).
   -  min (retorna o menor elemento em uma Collection).
   -  max (retorna o maior elemento em uma collection).
   -  addAll (Acrescenta todos os elementos em um array a uma Collection).
   -  frequency (calcula quantos elementos da coleção são iguais ao elemento especificado)
   -  disjoint (determina se duas coleções não tem nenhum elemento em comum).

### Map

- associa chaves a valores, não aceita duas chaves iguais.
- Não deriva de Collection.
- HashTable armazena seus dados em uma tabela de hash.
- HashMap armazena seus dados em uma tabela de hash(não sincronizado, permite valores e chaves null).
- TreeMap armazena seus dados em uma árvore.
