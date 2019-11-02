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
public class MainArrayOrderedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws EmptyCollectionException, ElementoNaoExisteException {
        // TODO code application logic here
        ArrayOrderedList<String> lista1 = new ArrayOrderedList<>();

        int teste = 0;

        switch (teste) {
            case 0: //teste tudo direito
                lista1.add("A");
                lista1.add("B");
                lista1.add("C");
                lista1.add("D");

                /*
                Iterator it = lista1.iterator();
                while (it.hasNext()) {
                    int obj = (int) it.next();
                    System.out.println(obj);
                }
*/
                break;
        }

    }
}
