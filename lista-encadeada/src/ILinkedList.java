public interface ILinkedList {
//  Adiciona o nó ao fim da lista
    void push(int data);

//  Remove o nó no fim da lista e retorna o mesmo
    int pop();

//  Adiciona um nó na posição da lista indicada via parâmetro
    void insert(int index, int data);

//  Remove um nó na posição da lista indicada via parâmetro
    void remove(int index);

//  Retorna o elemento que está no índice da lista indicado via parâmetro
    int elementAt(int index);

//  Retorna o tamanho da lista
    int size();

//  Retorna uma representação em texto da lista
    void printList();
}
