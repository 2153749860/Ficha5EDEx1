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
public class MainArrayUnorderedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ElementoNaoExisteException {
        // TODO code application logic here
        ArrayUnorderedList<String> lista1 = new ArrayUnorderedList();

        int teste = 6;

        switch (teste) {
            case 0: //teste addToRear
                lista1.addToRear("A");
                lista1.addToRear("C");
                lista1.addToRear("D");
                lista1.addToRear("B");

                Iterator it = lista1.iterator();

                while (it.hasNext()) {
                    String obj = (String) it.next();
                    System.out.println(obj);
                }
                break;

            case 1: //teste addToFront com lista vazia
                lista1.addToFront("A");

                Iterator it2 = lista1.iterator();

                while (it2.hasNext()) {
                    String obj = (String) it2.next();
                    System.out.println(obj);
                }
                break;

            case 2: //teste addToFront
                lista1.addToFront("D");
                lista1.addToFront("B");
                lista1.addToFront("A");
                lista1.addToFront("C");
                

                Iterator it3 = lista1.iterator();

                while (it3.hasNext()) {
                    String obj = (String) it3.next();
                    System.out.println(obj);
                }
                break;
                
            case 3: //teste addToFront com lista cheia
                lista1.addToFront("D");
                lista1.addToFront("B");
                lista1.addToFront("A");
                lista1.addToFront("C");
                lista1.addToFront("F");
                lista1.addToFront("H");
                
                Iterator it4 = lista1.iterator();

                while (it4.hasNext()) {
                    String obj = (String) it4.next();
                    System.out.println(obj);
                }
                break;
                
            case 4: //teste com apenas dois elementos
                lista1.addToRear("D");
                lista1.addToFront("B");
                
                Iterator it5 = lista1.iterator();

                while (it5.hasNext()) {
                    String obj = (String) it5.next();
                    System.out.println(obj);
                }
                break;
                
            case 5: //teste addAfter
                lista1.addToRear("D");
                lista1.addToRear("B");
                lista1.addToRear("A");
                lista1.addToRear("C");
                lista1.addToRear("E");
                
                lista1.addAfter("X", "C");
                
                
                Iterator it6 = lista1.iterator();

                while (it6.hasNext()) {
                    String obj = (String) it6.next();
                    System.out.println(obj);
                }
                break;
                
            case 6: //teste addAfter sem o elemento existir
                lista1.addToRear("D");
                lista1.addToRear("B");
                lista1.addToRear("A");
                lista1.addToRear("C");
                lista1.addToRear("E");
                
                lista1.addAfter("X", "S");
                
                
                Iterator it7 = lista1.iterator();

                while (it7.hasNext()) {
                    String obj = (String) it7.next();
                    System.out.println(obj);
                }
                break;
        }
    }
    
}
