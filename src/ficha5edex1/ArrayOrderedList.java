/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha5edex1;


/**
 *
 * @author vitor
 * @param <T>
 */
public class ArrayOrderedList<T> extends ArrayList<T> implements OrderedListADT<T> {

    public ArrayOrderedList() {
        super();
    }

    public ArrayOrderedList(int tamanho) {
        super(tamanho);
    }

    @Override
    public void add(T element) throws NonComparableExcep {

        //cast
        if (!(element instanceof Comparable)) {
            throw new NonComparableExcep("Nao e comparavel");
        }

        if (this.rear == this.list.length) {
            this.expandCapacity();
        }

        Comparable<T> x = (Comparable<T>) element;

        //meter no inicio sem nada
        if (this.isEmpty()) {
            this.list[this.rear] = element;
        } else if (x.compareTo(list[this.rear - 1]) > 0) {
            list[this.rear] = element;
        } else {
            int indice = 0;
            boolean found = false;
            // procura
            for (int i = 0; i < this.rear && found == false; i++) {
                if (x.compareTo(this.list[i]) < 0) {
                    indice = i;
                    found = true;
                }
            }

            ///shift
            for (int j = this.rear - 1; j >= indice; j--) {
                list[j + 1] = list[j];
            }

            ///colocar
            list[indice] = element;

        }
        this.rear++;

    }

}
