/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_2_ordenar_collections;

import java.util.Comparator;
import java.util.LinkedList;

/**
 *
 * @author jozza
 */
public class EVA3_2_ORDENAR_COLLECTIONS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        LinkedList<Integer> lista = new LinkedList<>();
        
        lista.add(300);
        lista.add(500);
        lista.add(200);
        lista.add(400);
        lista.add(100);
        lista.add(600);
        
        //CREAMOS UN COMPAEATOR
        
        Comparator comparador = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                
                int val1 = (int)o1;
                int val2 = (int)o2;
                
                //EL COMPARE REGRESA UN VALOR ENTERO, QUE SIGNIFICA:
                //POSITIVO + : O1 ES MAYOR 
                //CREO 0 : O1 Y O2 SON IGUALES
                //NEGATIVO - : O2 ES MAYOR
                
                return val1-val2;
                //return val2-val1;
            }
        };
        
        lista.sort(comparador);

        System.out.println(lista);
        
        LinkedList<String> datos = new LinkedList<>();
        datos.add("holaa");
        datos.add(" ");
        datos.add("mundo");
        datos.add("!!");
        
        Comparator comparador2 = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                
                String cade1 = (String) o1;
                String cade2 = (String) o2;
                
              return  cade1.compareTo(cade2);
              //return  cade2.compareTo(cade3);
                
                
            }
            
            
        };//SE CREA UN OBJETO
        
        datos.sort(comparador2);
        System.out.println(datos);
        
        
    }
    
}
