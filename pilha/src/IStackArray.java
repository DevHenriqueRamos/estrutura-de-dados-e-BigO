public interface IStackArray {
//  Coloca um inteiro no topo da pilha
    public void push(int value);

//  Remove o valor de topo da pilha e o retorna ao chamador
    public int pop();

//  Espia o inteiro que está no topo e o retorna sem mexer na pilha
    public int top();

//  Retorna true ou false dependendo da pilha estar vazia ou não
    public boolean isEmpty();

//  Retorna um valor inteiro com o numero de elementos da pilha
    public int size();
}

