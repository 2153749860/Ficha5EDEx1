/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha5edex1;

/**
 *
 * @author tiago
 * @param <T>
 */
public class ArrayOrderedList<T extends Comparable> extends ArrayList<T> implements OrderedListADT<T> {

    public ArrayOrderedList() {
        super();
    }

    public ArrayOrderedList(int tamanho) {
        super(tamanho);
    }

    public void add(T x) {
        //colocar no inicio
        if (this.isEmpty()) {
            this.list[0] = x;
            this.rear++;
            return;
        }
        //meter a meio da lista
        if(!this.isEmpty()){
            for (int i = 0; i < this.rear; i++) {
                if (x.compareTo(this.list[i]) < 0) {
                    for(int j=this.rear-1; j >= i; j--){
                        this.list[j+1] = this.list[j];
                    }
                    this.list[i] = x;
                    this.rear++;
                    return;
                }
            }
        }
        
        //meter no fim da lista
        this.list[this.rear] = x;
        this.rear++;
    }

}
