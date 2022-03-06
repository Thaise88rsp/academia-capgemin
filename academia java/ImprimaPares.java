/* array contain em java:
https://stackoverflow.com/questions/1128723/how-do-i-determine-whether-an-array-contains-a-particular-value-in-java

*/

import java.util.Arrays;

public class ImprimaPares {
    public static void main(String args[]){

        //Integer[] lista = {1, 5, 3, 4, 2};
        Integer[] lista = {0, 1, 2, 3, 4, 5};
        Integer x = 2;   
        
        Integer contador = 0;

        for(int i=0;i<lista.length;i++) {
            int diferenca =lista[i] - x;               

            if ( Arrays.asList(lista).contains(diferenca)){
                contador++;
            }           
        }

        System.out.println(contador);




    }
    
}
