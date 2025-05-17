[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/T2vUNN1h)

Explique a diferença entre um array de tipos primitivos (int[], double[]) e um array de objetos (Aluno[], Produto[]) em Java.

a) Como a memória é alocada em cada caso?

Se for um tipo primitivo é alocado um espaço continuo na memória do tamanho referente a quanto espaço ocupa o tipo de dados vezes o tamanho da array,
por exemplo, se um boolean ocupa 1 bit, um array de 8 booleans vai ocupar 1 byte (8 bits) de espaço continuo na memória.

Já se for um objeto (instancia de classe) é alocado um espaço continuo de nulos onde será futuramente alocado referências
aos objetos (ponteiros).

b) Quais cuidados devem ser tomados ao acessar elementos de um array de objetos?

É necessário sempre verificar se no elemento acessado existe de fato uma referência a um objeto, já que arrays de objetos são
por padrão inicializadas com valores nulos, e tentar realizar operações em valores nulos vai ocasionar em NullPointerExceptions.