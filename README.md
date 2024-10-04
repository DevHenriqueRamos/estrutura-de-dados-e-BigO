# Estruturas de Dados em Java

## Introdução

Neste repositório, você encontrará quatro implementações de estruturas de dados fundamentais, todas desenvolvidas do zero em Java. Essas implementações ajudam a ilustrar como funcionam pilhas, filas, listas encadeadas e mapas hash.

## Introdução à Notação Big-O

Entendendo a complexidade assintótica dos algoritmos. A notação Big-O classifica algoritmos com base no tempo e espaço que eles requerem em relação ao tamanho da entrada. Ela fornece um limite superior para o pior cenário possível, ou seja, como o algoritmo se comportará no pior dos casos. Algumas das complexidades mais comuns incluem:

- **O(1)**: Tempo constante. O desempenho não é afetado pelo tamanho da entrada.
- **O(log n)**: Tempo logarítmico. O desempenho cresce lentamente conforme a entrada aumenta.
- **O(n)**: Tempo linear. O desempenho cresce proporcionalmente ao tamanho da entrada.
- **O(n²)**: Tempo quadrático. Comum em algoritmos de força bruta que envolvem loops aninhados.

A compreensão da complexidade assintótica é crucial para escrever código eficiente.

## Estruturas de Dados

### 1. Pilha (Stack)

- **Descrição**: Uma pilha é uma estrutura de dados que segue o princípio LIFO (Last In, First Out).
- **Principais Operações**:
  - `push`: Adiciona um elemento ao topo da pilha.
  - `pop`: Remove e retorna o elemento do topo da pilha.
  - `top`: Retorna o elemento do topo sem removê-lo.
  - `isEmpty`: Retorna um booleano com o estado atual da pilha.
  - `size`: Retorna um inteiro com o número de elementos da pilha.
- **Complexidade Assintótica**:
  - `push`: **O(1)**
  - `pop`: **O(1)**
  - `top`: **O(1)**
  - `isEmpty`: **O(1)**
  - `size`: **O(1)**

### 2. Fila FIFO (Queue)

- **Descrição**: Uma fila é uma estrutura de dados que segue o princípio FIFO (First In, First Out).
- **Principais Operações**:
  - `enqueue`: Adiciona um elemento ao final da fila.
  - `dequeue`: Remove o elemento do início da fila.
  - `front`: Retorna o elemento do início sem removê-lo.
  - `rear`: Retorna o elemento do final sem removê-lo.
  - `size`: Retorna o tamanho da fila.
  - `isEmpty`: Retorna um booleano com o estado atual da fila.
- **Complexidade Assintótica**:
  - `enqueue`: **O(1)**
  - `dequeue`: **O(1)**
  - `front`: **O(1)**
  - `rear`: **O(1)**
  - `size`: **O(1)**
  - `isEmpty`: **O(1)**

### 3. Lista Encadeada (Linked List)

- **Descrição**: Uma lista encadeada é uma coleção de nós onde cada nó contém um valor e uma referência ao próximo nó e ao nó anterior.
- **Principais Operações**: 
  - `push`: Adiciona o nó ao fim da lista.
  - `pop`: Remove o nó no fim da lista e retorna o mesmo.
  - `insert`: Insere um novo nó na posição da lista indicada via parâmetro.
  - `remove`: Remove um nó na posição da lista indicada via parâmetro.
  - `elementAt`: Retorna o elemento que está no índice da lista indicado via parâmetro.
  - `size`: Retorna o tamanho da lista.
  - `printList`: Printa uma representação da lista em texto.
- **Complexidade Assintótica**:
  - `push`: **O(1)**
  - `pop`: **O(1)**
  - `insert`: **O(n)**
  - `remove`: **O(n)**
  - `elementAt`: **O(n)**
  - `size`: **O(1)**
  - `printList`: **O(n)**

### 4. Mapa Hash (Hash Map)

- **Descrição**: Um mapa hash é uma estrutura de dados que associa chaves a valores, permitindo a inserção, remoção e busca rápida.
- **Principais Operações**:
  - `put`: Adiciona ou atualiza um par chave-valor.
  - `get`: Retorna o valor associado a uma chave.
  - `delete`: Remove um par chave-valor.
  - `clear`: Remove todos os elementos do Mapa.
- **Complexidade Assintótica**:
  - `put`: **O(1) (em média)**
  - `get`: **O(1) (em média)**
  - `remove`: **O(1) (em média)**
  - `clear`: **O(1)**

## Conclusão

Essas implementações são uma demonstração prática das estruturas de dados fundamentais e suas complexidades associadas. A compreensão e a habilidade de implementar essas estruturas são essenciais para qualquer programador.
</br></br>


