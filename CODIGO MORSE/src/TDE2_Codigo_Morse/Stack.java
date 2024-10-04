package TDE2_Codigo_Morse;

public class Stack<T> {
    private Lista<T> lista;
    private int capacity;

    public Stack(int size) {
        this.capacity = size;
        this.lista = new Lista<>(size);
    }

    public void push(T element) {
        if (lista.estaCheia()) {
            System.out.println("A pilha está cheia. Não é possível adicionar mais elementos.");
            return;
        }
        lista.adicionar(element);
    }

    public T pop() {
        if (lista.estaVazia()) {
            System.out.println("A pilha está vazia. Não há elementos para remover.");
            return null;
        }
        return lista.removerUltimo();
    }

    public void clear() {
        lista.limpar();
    }

    public boolean isFull() {
        return lista.estaCheia();
    }

    public boolean isEmpty() {
        return lista.estaVazia();
    }
}