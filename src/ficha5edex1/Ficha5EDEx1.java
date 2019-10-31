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
public class Ficha5EDEx1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws EmptyCollectionException, ElementoNaoExisteException {
        // TODO code application logic here
        ArrayList lista1 = new ArrayList();

        int teste = 11;

        switch (teste) {
            case 0: //teste removeFirst com elementos
                lista1.add(1);
                lista1.add(2);
                lista1.add(3);
                lista1.add(4);
                lista1.add(5);

                System.out.println(lista1.toString());

                lista1.removeFirst();

                System.out.println(lista1.toString());
                break;

            case 1: //teste removeFirst sem elementos
                lista1.removeFirst();
                break;

            case 2:
                //teste removeLast com elementos
                lista1.add(1);
                lista1.add(2);
                lista1.add(3);
                lista1.add(4);
                lista1.add(5);

                lista1.removeLast();
                System.out.println(lista1.toString());
                break;

            case 3: //teste removeLast sem elementos
                lista1.removeLast();
                break;

            case 4: //teste contains de um elemento que existe
                lista1.add(1);
                lista1.add(2);
                lista1.add(3);
                lista1.add(4);

                System.out.println(lista1.contains(1));
                break;

            case 5: //teste contains de um elemento que não existe
                lista1.add(1);
                lista1.add(2);
                lista1.add(3);
                lista1.add(4);

                System.out.println(lista1.contains(0));
                break;

            case 6: //teste remove
                lista1.add(1);
                lista1.add(2);
                lista1.add(3);
                lista1.add(4);
                lista1.add(5);

                lista1.remove(3);

                System.out.println(lista1.toString());
                break;

            case 7: //teste remove lista vazia
                lista1.remove(1);
                break;

            case 8: //teste remove elemento nao existe
                lista1.add(1);
                lista1.add(2);
                lista1.add(3);
                
                lista1.remove(4);
                break;
                
            case 9: //teste find de um elemento que existe
                lista1.add(1);
                lista1.add(2);
                lista1.add(3);
                lista1.add(4);
                lista1.add(5);
                
                System.out.println(lista1.find(3));
                break;
            
            case 10: //teste find de um elemento que nao existe
                lista1.add(1);
                lista1.add(2);
                lista1.add(3);
                
                System.out.println(lista1.find(4));
                break;
                
            case 11: //teste metodo first
                lista1.add(1);
                lista1.add(2);
                lista1.add(3);
                lista1.add(4);
                lista1.add(5);
                
                System.out.println(lista1.first());
                

        }

    }

}
