/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha5edex1;

/**
 *
 * @author tiago
 */
public class ArrayUnorderedList<T> extends ArrayList<T> implements UnorderedListADT<T> {

    @Override
    public void addToFront(T element) {
        if(this.rear == this.list.length){
            this.expandCapacity();
        }
        
        //ciclo for
        for(int i = this.rear-1; i >= 0; i--){
            this.list[i+1] = this.list[i];
        }
        this.list[0] = element;
        this.rear++;
    }

    @Override
    public void addToRear(T element) {
        if (this.rear == this.list.length) {
            this.expandCapacity();
            list[this.rear] = element;
            this.rear++;
        } else {
            list[this.rear] = element;
            this.rear++;
        }
    }

    @Override
    public void addAfter(T element, T atual) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
