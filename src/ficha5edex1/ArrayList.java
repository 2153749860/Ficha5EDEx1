/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha5edex1;

import java.util.Iterator;

/**
 *
 * @author tiago
 */
public class ArrayList<T> implements ListADT<T> {

    protected int count;
    protected T[] list;
    protected int rear;
    protected static int DEFAULT_CAPACITY = 5;

    public ArrayList() {
        this.count = 0;
        this.list = (T[]) (new Object[DEFAULT_CAPACITY]);
        this.rear = 0;
    }
    
    public ArrayList(int tamanho) {
        this.count = 0;
        this.list = (T[]) (new Object[tamanho]);
        this.rear = 0;
    }

    public void add(T element) {
        if (this.count == this.list.length) {
            this.expandCapacity();
            list[this.rear] = element;
            this.rear++;
            this.count++;
        } else {
            list[this.rear] = element;
            this.rear++;
            this.count++;
        }
    }

    public void expandCapacity() {
        T[] newList = (T[]) (new Object[DEFAULT_CAPACITY * 2]);

        for (int i = 0; i < this.rear; i++) {
            newList[i] = this.list[i];
        }

        this.list = newList;
    }

    /**
     * Removes and returns the first element from this list.
     *
     * @return the first element from this list
     */
    @Override
    public T removeFirst() throws EmptyCollectionException {
        //se a lista estiver vazia
        if (this.isEmpty()) {
            throw new EmptyCollectionException("Lista Vazia!");
        } else {
            //guarda item a ser removido
            T removido = this.first();
            //ciclo for que começa na primeira posição, que vai mover todos os items uma casa para a esquerda
            for (int i = 0; i < this.list.length-1; i++) {
                this.list[i] = this.list[i + 1];
            }
            //coloca o ultimo elemento a null
            this.list[this.rear - 1] = null;
            //decrementa rear
            this.rear--;
            //decrementa count
            this.count--;
            //retorna item removido
            return removido;
        }
    }

    /**
     * Removes and returns the last element from this list.
     *
     * @return the last element from this list
     */
    @Override
    public T removeLast() throws EmptyCollectionException {
        //se a lista estiver vazia
        if (this.isEmpty()) {
            throw new EmptyCollectionException("Lista Vazia!");
        } else {
            //guarda item a ser removido
            T removido = this.last();
            //coloca posicao desse item a null
            this.list[this.rear - 1] = null;
            //decrementa rear
            this.rear--;
            //decrementa count
            this.count--;
            //retorna item removido
            return removido;
        }
    }

    /**
     * Removes and returns the specified element from this list.
     *
     * @param element the element to be removed from the list
     */
    @Override
    public T remove(T element) throws EmptyCollectionException, ElementoNaoExisteException {
        //se a lista estiver vazia
        if (this.isEmpty()) {
            throw new EmptyCollectionException("Lista Vazia!");
        }
        //se a lista contem o elemento
        if (this.contains(element)) {
            //guarda a posição do item a ser removido
            int posicaoRemovido = this.find(element);
            //guarda o item a ser removido
            T removido = this.list[this.find(element)];
            //ciclo for que começa na posição do item a ser removido, que vai mover todos os items uma casa para a esquerda
            for (int i = posicaoRemovido; i < this.rear - 1; i++) {
                this.list[i] = this.list[i + 1];
            }
            //coloca posição desse item a null
            this.list[this.rear - 1] = null;
            //decrementa rear
            this.rear--;
            //decrementa count
            this.count--;
            //retorna item removido
            return removido;
            //se nao existir
        } else {
            throw new ElementoNaoExisteException("Elemento não existe!");
        }
    }

    /**
     * Returns a reference to the first element in this list.
     *
     * @return a reference to the first element in this list
     */
    @Override
    public T first() {
        return this.list[0];
    }

    /**
     * Returns a reference to the last element in this list.
     *
     * @return a reference to the last element in this list
     */
    @Override
    public T last() {
        return this.list[this.rear - 1];
    }

    /**
     * Método que retorna a posição de um elemento
     *
     * @param element - elemento que procura
     * @return posicao desse elemento
     */
    public int find(T element) {
        for (int i = 0; i < this.rear; i++) {
            if (this.list[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Returns true if this list contains the specified target element.
     *
     * @param target the target that is being sought in the list
     * @return true if the list contains this element
     */
    @Override
    public boolean contains(T target) {
        if (this.find(target) != -1) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Returns true if this list contains no elements.
     *
     * @return true if this list contains no elements
     */
    @Override
    public boolean isEmpty() {
        //se o rear for a primeira posição
        return this.rear == 0;
    }

    /**
     * Returns the number of elements in this list.
     *
     * @return the integer representation of number of elements in this list
     */
    @Override
    public int size() {
        return this.count;
    }

    /**
     * Returns an iterator for the elements in this list.
     *
     * @return an iterator over the elements in this list
     */
    @Override
    public Iterator iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Returns a string representation of this list.
     *
     * @return a string representation of this list
     */
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Primeiro elemento: ");
        str.append(this.list[0]);
        str.append("\n");
        str.append("Ultimo elemento: ");
        str.append(this.list[this.rear - 1]);
        str.append("\n");
        str.append("Nº elementos: ");
        str.append(this.rear);
        str.append("\n");
        str.append("Tamanho da lista: ");
        str.append(this.list.length);
        str.append("\n");

        for (int i = 0; i < this.size(); i++) {
            str.append(this.list[i]);
            str.append("\n");
        }

        return str.toString();
    }

}
