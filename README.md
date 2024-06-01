# Estruturas de Dados: Mega Resumo

## Vetores (Arrays)
- **Descrição:** Armazenam elementos em posições contíguas na memória, com tamanho fixo.
- **Remoção de Elementos:**
  - **Posição específica:** \(O(n)\)
  - **Exemplo:** `vetor.remove(30)`
- **Adição de Elementos:**
  - **No final:** \(O(1)\) se houver espaço, \(O(n)\) se redimensionar
  - **Posição específica:** \(O(n)\)
  - **Exemplo:** `vetor.append(40)`, `vetor.insert(1, 15)`
- **Ordenação:** Efetiva com quicksort, mergesort, etc.
  - **Complexidade:** Varia (\(O(n \log n)\) em média)
- **Busca:**
  - **Linear:** \(O(n)\)
  - **Binária (vetor ordenado):** \(O(\log n)\)
  - **Exemplo:** `indice = vetor.index(20)`

## Listas (Lists)
- **Descrição:** Estrutura dinâmica que pode conter diferentes tipos de elementos.
- **Remoção de Elementos:**
  - **Posição específica:** \(O(n)\) no pior caso
  - **Exemplo:** `lista.remove(3.14)`
- **Adição de Elementos:**
  - **No final:** \(O(1)\)
  - **Posição específica:** \(O(n)\)
  - **Exemplo:** `lista.append(40)`, `lista.insert(1, 15)`
- **Ordenação:** Eficiente com mergesort, especialmente para listas ligadas.
  - **Complexidade:** \(O(n \log n)\)
- **Busca:** 
  - **Linear:** \(O(n)\)
  - **Exemplo:** `indice = lista.index(4)`

## Pilhas (Stacks)
- **Descrição:** Seguem o princípio LIFO (Last In, First Out).
- **Remoção de Elementos:**
  - **No topo:** \(O(1)\)
  - **Exemplo:** `pilha.pop()`
- **Adição de Elementos:**
  - **No topo:** \(O(1)\)
  - **Exemplo:** `pilha.append(40)`
- **Ordenação:** Não é comum ordenar diretamente; pode ser feita indiretamente.
  - **Complexidade:** \(O(n \log n)\) usando métodos auxiliares
- **Busca:** 
  - **Linear:** \(O(n)\)
  - **Exemplo:** `encontrado = 20 in pilha`

## Filas (Queues)
- **Descrição:** Seguem o princípio FIFO (First In, First Out).
- **Remoção de Elementos:**
  - **Na frente:** \(O(1)\)
  - **Exemplo:** `fila.popleft()`
- **Adição de Elementos:**
  - **No final:** \(O(1)\)
  - **Exemplo:** `fila.append(40)`
- **Ordenação:** Não é comum ordenar diretamente; pode ser feita indiretamente.
  - **Complexidade:** \(O(n \log n)\) usando métodos auxiliares
- **Busca:** 
  - **Linear:** \(O(n)\)
  - **Exemplo:** `encontrado = 20 in fila`

## Comparativo de Complexidades

| Estrutura de Dados | Remoção (Posição Específica) | Adição no Final | Adição em Posição Específica | Ordenação | Busca Linear | Busca Binária |
|--------------------|------------------------------|-----------------|-----------------------------|-----------|--------------|---------------|
| Vetor (Array)      | \(O(n)\)                     | \(O(1)\) ou \(O(n)\) se redimensionar | \(O(n)\) | \(O(n \log n)\) | \(O(n)\) | \(O(\log n)\) se ordenado |
| Lista (List)       | \(O(n)\)                     | \(O(1)\)        | \(O(n)\)                    | \(O(n \log n)\) | \(O(n)\) | Não aplicável |
| Pilha (Stack)      | \(N/A\) (só no topo)         | \(O(1)\)        | \(N/A\) (só no topo)        | \(O(n \log n)\) com métodos auxiliares | \(O(n)\) | Não aplicável |
| Fila (Queue)       | \(N/A\) (só na frente)       | \(O(1)\)        | \(N/A\) (só no final)       | \(O(n \log n)\) com métodos auxiliares | \(O(n)\) | Não aplicável |

## Conclusão
Cada estrutura de dados possui características distintas que a tornam mais ou menos adequada para diferentes tarefas:

- **Vetores** são eficientes para acesso aleatório e ordenação, mas menos eficientes para inserções e remoções em posições arbitrárias.
- **Listas** oferecem flexibilidade com tipos de dados variados e tamanho dinâmico, mas inserções e remoções podem ser custosas.
- **Pilhas** são ideais para operações LIFO rápidas.
- **Filas** são ideais para operações FIFO rápidas.

A escolha da estrutura de dados depende das operações predominantes que você precisa realizar.
