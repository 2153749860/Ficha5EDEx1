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
public class MainListADT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws EmptyCollectionException, ElementoNaoExisteException {
        // TODO code application logic here
        ArrayList lista1 = new ArrayList();

        int teste = 21;

        switch (teste) {
            case 0: //teste removeFirst com elementos na lista
                lista1.add(1);
                lista1.add(2);
                lista1.add(3);
                lista1.add(4);
                lista1.add(5);

                System.out.println(lista1.toString());

                System.out.println("Item removido: " + lista1.removeFirst() + "\n");

                System.out.println(lista1.toString());
                break;

            case 1: //teste removeFirst sem elementos na lista
                System.out.println(lista1.toString());
                
                System.out.println(lista1.removeFirst());
                break;
            
            case 2: //teste removeFirst com alguns elementos na lista
                lista1.add(1);
                lista1.add(2);
                lista1.add(3);
                
                System.out.println(lista1.toString());
                
                System.out.println("Item removido: " + lista1.removeFirst() + "\n");
                
                System.out.println(lista1.toString());
                break;
             
            case 3: //teste removeFirst com 1 elemento na lista
                lista1.add(1);
                
                System.out.println(lista1.toString());
                System.out.println("Item removido: " + lista1.removeFirst() + "\n");
                System.out.println(lista1.toString());
                break;
                
            case 4: //teste removeLast com elementos na lista
                lista1.add(1);
                lista1.add(2);
                lista1.add(3);
                lista1.add(4);
                lista1.add(5);

                System.out.println(lista1.toString());
                System.out.println("Item removido: " + lista1.removeLast() + "\n");
                System.out.println(lista1.toString());
                break;

            case 5: //teste removeLast sem elementos na lista
                lista1.removeLast();
                break;
            
            case 6: //teste removeLast com 1 elemento na lista
                lista1.add(1);
                System.out.println(lista1.toString());
                System.out.println("Item removido: " + lista1.removeLast() + "\n");
                System.out.println(lista1.toString());
                break;
                
            case 7: //teste removeLast com alguns elementos na lista
                lista1.add(1);
                lista1.add(2);
                lista1.add(3);
                
                System.out.println(lista1.toString());
                System.out.println("Item removido: " + lista1.removeLast() + "\n");
                System.out.println(lista1.toString());
                break;

            case 8: //teste contains de um elemento que existe na lista
                lista1.add(1);
                lista1.add(2);
                lista1.add(3);
                lista1.add(4);

                System.out.println(lista1.contains(1));
                break;

            case 9: //teste contains de um elemento que não existe na lista
                lista1.add(1);
                lista1.add(2);
                lista1.add(3);
                lista1.add(4);

                System.out.println(lista1.contains(0));
                break;

            case 10: //teste remove de elemento que existe na lista
                lista1.add(1);
                lista1.add(2);
                lista1.add(3);
                lista1.add(4);
                lista1.add(5);

                System.out.println(lista1.toString());
                System.out.println("Item removido: " + lista1.remove(3) + "\n");
                System.out.println(lista1.toString());
                break;

            case 11: //teste remove com lista vazia
                lista1.remove(1);
                break;

            case 12: //teste remove de um elemento que nao existe na lista
                lista1.add(1);
                lista1.add(2);
                lista1.add(3);
                
                lista1.remove(4);
                break;
                
            case 13: //teste remove com 1 elemento na lista
                lista1.add(1);
                
                System.out.println(lista1.toString());
                System.out.println("Item removido: " + lista1.remove(1) + "\n");
                System.out.println(lista1.toString());
                break;
                
            case 14: //teste remove com alguns elementos na lista
                lista1.add(1);
                lista1.add(2);
                lista1.add(3);
                
                System.out.println(lista1.toString());
                System.out.println("Item removido: " + lista1.remove(2) + "\n");
                System.out.println(lista1.toString());
                break;
                
            case 15: //teste find de um elemento que existe na lista
                lista1.add(1);
                lista1.add(2);
                lista1.add(3);
                lista1.add(4);
                lista1.add(5);
                
                System.out.println(lista1.find(3));
                break;
            
            case 16: //teste find de um elemento que nao existe na lista
                lista1.add(1);
                lista1.add(2);
                lista1.add(3);
                
                System.out.println(lista1.find(4));
                break;
                
            case 17: //teste metodo first com elementos na lista
                lista1.add(1);
                lista1.add(2);
                lista1.add(3);
                lista1.add(4);
                lista1.add(5);
                
                System.out.println(lista1.first());
                break;
                
            case 18: //teste metodo first sem elementos na lista
                System.out.println(lista1.first());
                break;
                
            case 19: //teste metodo last com elementos na lista
                lista1.add(1);
                lista1.add(2);
                lista1.add(3);
                lista1.add(4);
                lista1.add(5);
                
                System.out.println(lista1.last());
                break;
                
            case 20: //teste metodo last sem elementos na lista
                System.out.println(lista1.last());
                break;
                
            case 21: //teste iterador
                lista1.add(1);
                lista1.add(2);
                lista1.add(3);
                Iterator it = lista1.iterator();
                while (it.hasNext()) {
                    int obj =  (int) it.next();
                    System.out.println(obj);
                }
                break;
        }

    }

}
