package TDE2_Codigo_Morse;

public class Lista<T> {
    private T[] data;
    private int size;
    private int capacity;

    @SuppressWarnings("unchecked")
    public Lista(int capacity) {
        this.capacity = capacity;
        this.data = (T[]) new Object[capacity];
        this.size = 0;
    }

    public void adicionar(T element) {
        if (size == capacity) {
            redimensionar();
        }
        data[size++] = element;
    }

    public T removerUltimo() {
        if (size == 0) {
            return null;
        }
        T element = data[--size];
        data[size] = null;
        return element;
    }

    public T acessar(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Índice fora do limite");
        }
        return data[index];
    }

    public void limpar() {
        for (int i = 0; i < size; i++) {
            data[i] = null;
        }
        size = 0;
    }

    public boolean estaVazia() {
        return size == 0;
    }

    public int tamanho() {
        return size;
    }

    public boolean estaCheia() {
        return size == capacity;
    }

    @SuppressWarnings("unchecked")
    private void redimensionar() {
        capacity *= 2;
        T[] novoArray = (T[]) new Object[capacity];
        System.arraycopy(data, 0, novoArray, 0, size);
        data = novoArray;
    }
}