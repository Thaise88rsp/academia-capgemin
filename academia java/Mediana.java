import java.util.Arrays;

/* 
como fazer o hello word em java:
https://www.programiz.com/java-programming/hello-world

como declarar um array em java:https://www.devmedia.com.br/vetores-em-java/21449

como ordenar um array no java:
https://www.alura.com.br/artigos/ordenando-numeros-em-java?gclid=CjwKCAiA1JGRBhBSEiwAxXblwRXQHx1_8PC8hyM2Bzz8ytLLy7rxcF7r9-Mh3wLGoocUR1E3UVygGhoCJbQQAvD_BwE

*/

public class Mediana {
    public static void main(String args[]) {
        Integer[] lista = {92, 27, 12, 41, 31, 7, 33, 0, 3, 11, 14};

        Arrays.sort(lista);  
        
        Integer mediana = lista.length  / 2;
        System.out.println(lista[mediana]);

                                          
    }
}