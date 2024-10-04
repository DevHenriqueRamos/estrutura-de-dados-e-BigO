public interface IHashMap {
//  Adiciona o par chave/valor ao mapa
    void put(int key, int value);

//  Remove um par chave-valor
    int delete(int key);

//  Retorna o valor associado à chave passada via parâmetro
    int get(int key);

//  Remove todos os elementos do mapa
    void clear();
}
