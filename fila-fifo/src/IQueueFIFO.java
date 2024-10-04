public interface IQueueFIFO {
//  Adiciona um inteiro à fila
    public void enqueue(int value);

//  Remove um inteiro da fila
    public void dequeue();

//  Retorna o inteiro que está no fim da fila
    public int rear();

//  Retorna o inteiro que está na frente da fila
    public int front();

//  Retorna o tamanho da fila
    public int size();

//  Retorna true ou false dependendo da fila estar vazia ou não
    public boolean isEmpty();
}
