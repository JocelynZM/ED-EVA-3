/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_1_ordenamientos;

/**
 *
 * @author jozza
 */
public class EVA3_1_ORDENAMIENTOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        
        int[] original, selection, bubble,insertion,quick,merge;
        
        
        original = new int[10];
        double ini,fin,tiempo;
        /////////ARREGLO ORIGINAL/////////
        llenar(original);
        System.out.println("/////ARREGLO ORIGINAL//");
        imprimir(original);
        //SELECTION SORT
        System.out.println("///////SELECTION SORT/////////");
        
        selection = copiar(original);
        
        ini = System.nanoTime();
        selectionSort(selection);
        
        fin = System.nanoTime();
        
        tiempo = fin - ini;
        
        imprimir(selection);
        System.out.println("SELECTION SORT = "+ tiempo);
        //INSERTION SORT
        System.out.println("///////INSERTION SORT/////////");
        
        insertion = copiar(original);
        
        ini = System.nanoTime();
        InsertionSort(insertion);
        
        fin = System.nanoTime();
        
        tiempo = fin - ini;
        
        imprimir(insertion);
        System.out.println("INSERTION SORT = "+ tiempo);
        //BUBBLE SORT
        System.out.println("///////BUBBLE SORT/////////");
        
        bubble = copiar(original);
        
        ini = System.nanoTime();
        bubbleSort(bubble);
        
        fin = System.nanoTime();
        
        tiempo = fin - ini;
        
        imprimir(bubble);
        System.out.println("BUBBLE SORT = "+ tiempo);
       
        //QUICK SORT
        System.out.println("///////QUICK SORT/////////");
        
        quick = copiar(original);
        
        ini = System.nanoTime();
        quickSort(quick);
        
        fin = System.nanoTime();
        
        tiempo = fin - ini;
        
        imprimir(quick);
        System.out.println("QUICK SORT = "+ tiempo);
        
                //MERGE SORT
        System.out.println("///////MERGE SORT/////////");

        merge = copiar(original);

        ini = System.nanoTime();
        mergeSort(merge);

        fin = System.nanoTime();

        tiempo = fin - ini;

        imprimir(merge);
        System.out.println("MERGE SORT = " + tiempo);
       
}
    
    public static void llenar(int[] arreglo){
        
         for(int i = 0; i< arreglo.length; i++){
            
           arreglo[i] = (int)(Math.random()*100);
        }
        
        
        
    }
    
    
    
  
    public static void imprimir(int[] arreglo){
        
        for(int i = 0; i< arreglo.length; i++){
            
            System.out.print("[" + arreglo[i]+ "] ");
        }
        
        System.out.println("");
    }
    
    
    
    public static int[] copiar(int[] arreglo){
     
        int resu[]= new int[arreglo.length];
        
         for(int i = 0; i< arreglo.length; i++){
            
            resu[i] = arreglo[i];
            
            
        }
        return resu;
        
    }
    
    //METODOS DE ORDENAMIENTO
    //O(N2) COMPARA MAS
    //O(N) INTERCAMBIA MENOS
    public static void selectionSort(int[] arreglo){
        
        for(int i=0;i<arreglo.length;i++){//CONTROLA LAS PASADAS
            
            int min = i;//CUANDO EMPIEZO, EL MAS PEQUEÑO ES EL PRIMER ELEMENTO
            
            for(int j=i+1;j<arreglo.length;j++){//BUSCA EL VALOR MAS PEQUEÑO
                
                if(arreglo[min] > arreglo[j])//NUEVO MINIMO
                
                    min=j; //GUARDAR NUEVA POSICION
                
            }
             //INTERCAMBIO O SWAP
             
             int temp = arreglo[min];
             arreglo[min] = arreglo[i];
            arreglo[i] = temp;
                
            }
        }
    
    
    public static void InsertionSort(int[] arreglo){
        
       for(int i=1; i<arreglo.length; i++){

        for(int j=i; j>0; j--){

            if(arreglo[j] < arreglo[j-1]){

                //INTERCAMBIO O SWAP
                int temp = arreglo[j];
                arreglo[j] = arreglo[j-1];
                arreglo[j-1] = temp;

            }else{
                break;
            }
                
                
            }
                          
             
            }
            
        
    }
    
    
    //EL PEOR DE TODOS 
    //O(N2)
    //TIENE LOS PEORES ATRIBUTOS DE LOS ALGORITOMOS ANTERIORES:
    //COMPARA MUCHO
    //INTERCAMBIA MUCHO
    //TENTADOR: ES MAS SENCILLO
   public static void bubbleSort(int[] arreglo){
       
       for(int i = 0; i< arreglo.length; i++){
           for(int j = 0; j<arreglo.length -1;j++){
               
               //INTECAMBIO 
               if(arreglo[j]> arreglo[j+1]){
                   int temp = arreglo[j];
                arreglo[j] = arreglo[j+1];
                arreglo[j+1] = temp;

                   
               }
           }
           
       }
       
       
   }
   
   
   public static void quickSort(int[] arreglo){
       
       quickSortRec(arreglo, 0, arreglo.length-1);
       
       
   }
   
   
   private  static void quickSortRec(int[] arreglo, int ini, int fin){
       
       //CONDICION PARA EVITAR RECURSIVIDAD
       //SELECCIONAR PIVOTE --> CUALQUIERA, NOSOTROS EL 1ER ELEMENTO
       //UN CICLO QIE SE REPITE MIENTRAS LOS INDICES NO SE CRUCEN
       //UN CICLO QUE BUSQUE LOS MAS PEQUEÑOS
       //SI NO SE HAN CRUZADO, PERO SE DETUVIERON..
           //INTERCAMBIAR
       //SI SE CRUZAN:
           //INTERCAMBIAR SMALL CON PIVOTE --> SMALL ES NUEVO PIVOTE
           //TERMINAR CICLO PRINCIPAL 
       //LLAMADAS (2 IZQ Y DER DE PIVOTE9 RECURSIVAS).
       
       // CONDICION PARA EVITAR RECURSIVIDAD
    if (ini < fin) {

        // SELECCIONAR PIVOTE
        int pivote = arreglo[fin];

        // VARIABLE PARA LOS NUMEROS MENORES
        int menor = ini;

        // RECORRER EL ARREGLO
        for (int i = ini; i < fin; i++) {

            if (arreglo[i] <= pivote) {

                // INTERCAMBIO O SWAP
                int temp = arreglo[i];
                arreglo[i] = arreglo[menor];
                arreglo[menor] = temp;

                menor++;
            }
        }

        // COLOCAR EL PIVOTE EN SU POSICION
        int temp = arreglo[menor];
        arreglo[menor] = arreglo[fin];
        arreglo[fin] = temp;

        // LLAMADAS RECURSIVAS
        quickSortRec(arreglo, ini, menor - 1);
        quickSortRec(arreglo, menor + 1, fin);

    }
               
               
           }
      //MERGE SORT
   public static void mergeSort(int[] arreglo){

       if(arreglo.length < 2){
           return;
       }

       int mitad = arreglo.length / 2;

       int[] izquierda = new int[mitad];
       int[] derecha = new int[arreglo.length - mitad];

       //COPIAR LOS ELEMENTOS A LA IZQUIERDA
       for(int i = 0; i < mitad; i++){
           izquierda[i] = arreglo[i];
       }

       //COPIAR LOS ELEMENTOS A LA DERECHA
       for(int i = mitad; i < arreglo.length; i++){
           derecha[i - mitad] = arreglo[i];
       }

       //ORDENAR LAS DOS MITADES
       mergeSort(izquierda);
       mergeSort(derecha);

       //JUNTAR LOS ARREGLOS
       merge(arreglo, izquierda, derecha);
   }


   public static void merge(int[] arreglo, int[] izquierda, int[] derecha){

       int i = 0;
       int j = 0;
       int k = 0;

       //COMPARAR LOS ELEMENTOS
       while(i < izquierda.length && j < derecha.length){

           if(izquierda[i] < derecha[j]){
               arreglo[k] = izquierda[i];
               i++;
           }else{
               arreglo[k] = derecha[j];
               j++;
           }

           k++;
       }

       //COPIAR LOS ELEMENTOS RESTANTES DE LA IZQUIERDA
       while(i < izquierda.length){
           arreglo[k] = izquierda[i];
           i++;
           k++;
       }

       //COPIAR LOS ELEMENTOS RESTANTES DE LA DERECHA
       while(j < derecha.length){
           arreglo[k] = derecha[j];
           j++;
           k++;
       }
   }
}       

           
           
           
           
           
           
       
               
               
           
           
             
      
       
   
    
    
   

