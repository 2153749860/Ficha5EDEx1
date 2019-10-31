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
public class ArrayList<T> implements ListADT<T>{
    private int count;
    private T[] list;
    private int rear;
    private static int DEFAULT_CAPACITY = 5;

    public ArrayList() {
        this.count = 0;
        this.list = (T[]) (new Object[DEFAULT_CAPACITY]);
        this.rear = 0;
    }
    
    public void add(T element){
        if(this.count == this.list.length){
            this.expandCapacity();
            list[this.rear] = element;
            this.rear++;
            this.count++;
        } else{
            list[this.rear] = element;
            this.rear++;
            this.count++;
        }
    }
    
    public void expandCapacity(){
        T[] newList = (T[]) (new Object[DEFAULT_CAPACITY * 2]);
        
        for(int i=0; i<this.rear; i++){
            newList[i] = this.list[i];
        }
        
        this.list = newList;
    }

    
   @Override
    public T removeFirst() throws EmptyCollectionException{
        //se a lista estiver vazia
        if(this.isEmpty()){
            throw new EmptyCollectionException("Lista Vazia!");
        } else{
            //guarda item a ser removido
            T removido = this.first();
            //ciclo for que começa na primeira posição, que vai mover todos os items uma casa para a esquerda
            for(int i=0; i<this.list.length-1; i++){
                this.list[i] = this.list[i+1];
            }
            //coloca o ultimo elemento a null
            this.list[this.rear-1] = null;
            //decrementa rear
            this.rear--;
            //decrementa count
            this.count--;
            //retorna item removido
            return removido;
        }
    }

    @Override
    public T removeLast() throws EmptyCollectionException{
        //se a lista estiver vazia
        if(this.isEmpty()){
            throw new EmptyCollectionException("Lista Vazia!");
        } else{
            //guarda item a ser removido
            T removido = this.last();
            //coloca posicao desse item a null
            this.list[this.rear-1] = null;
            //decrementa rear
            this.rear--;
            //decrementa count
            this.count--;
            //retorna item removido
            return removido;
        }
    }

    @Override
    public T remove(T element) throws EmptyCollectionException, ElementoNaoExisteException{
        //se a lista estiver vazia
        if(this.isEmpty()){
            throw new EmptyCollectionException("Lista Vazia!");
        }
        //se a lista contem o elemento
        if(this.contains(element)){
            //guarda a posição do item a ser removido
            int posicaoRemovido = this.find(element);
            //guarda o item a ser removido
            T removido = this.list[this.find(element)];
            //ciclo for que começa na posição do item a ser removido, que vai mover todos os items uma casa para a esquerda
            for(int i=posicaoRemovido; i<this.rear-1; i++){
                this.list[i] = this.list[i+1];
            }
            //coloca posição desse item a null
            this.list[this.rear-1] = null;
            //decrementa rear
            this.rear--;
            //decrementa count
            this.count--;
            //retorna item removido
            return removido;
        //se nao existir
        } else{
            throw new ElementoNaoExisteException("Elemento não existe!");
        }
    }

    @Override
    public T first() {
        return this.list[0];
    }

    @Override
    public T last() {
        return this.list[this.rear-1];
    }
    
    /**
     * Método que retorna a posição de um elemento
     * @param element - elemento que procura
     * @return posicao desse elemento
     */
    public int find(T element){
        for(int i=0; i<this.rear; i++){
            if(this.list[i].equals(element)){
                return i;
            }
        }
        return -1;
    }

    /**
     * Método que verifica se contem um certo elemento
     * @param target - elemento a verificar
     * @return valor booleano em caso de sucesso/insucesso
     */
    @Override
    public boolean contains(T target) {
        /*
        for(int i=0; i<this.rear; i++){
            if(this.list[i].equals(target)){
                return true;
            }
        }
        return false;
        */
        if(this.find(target) != -1){
            return true;
        } else{
            return false;
        }
    }

    /**
     * Método que verifica se a lista está vazia
     * @return 
     */
    @Override
    public boolean isEmpty() {
        //se o rear for a primeira posição
        return this.rear == 0;
    }

    @Override
    public int size() {
        return this.count;
    }

    @Override
    public Iterator iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Primeiro elemento: ");
        str.append(this.list[0]);
        str.append("\n");
        str.append("Ultimo elemento: ");
        str.append(this.list[this.rear-1]);
        str.append("\n");
        str.append("Nº elementos: ");
        str.append(this.rear);
        str.append("\n");
        str.append("Tamanho da lista: ");
        str.append(this.list.length);
        str.append("\n");

        for(int i=0; i<this.size(); i++){
            str.append(this.list[i]);
            str.append("\n");
        }

        
        return str.toString();
    }
   
    
    
    
}
