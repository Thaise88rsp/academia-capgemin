/* substituindo caracteres de um array:
https://www.alura.com.br/artigos/trocando-caracteres-de-uma-string-no-java

raiz quadrada em java:
https://www.guj.com.br/t/funcao-da-raiz-quadrada-em-java/83506


*/
public class Senha {
    public static void main(String args[]) {
        String frase = "tenha um bom dia";
        frase = frase.replaceAll(" ", "");
        Integer contando = frase.length();
        Integer raiz =  (int) Math.sqrt(contando);

        
        int row = raiz +1;
        int col = raiz +1;
        
        char[][] matriz = new char [row][col];

        int index = 0;
        for ( int r = 0; r < row; r++){
            for ( int c = 0; c < col; c++ ){
                if( index < contando) {
                    matriz[r][c] = frase.charAt(index);
                }
                index++;
            }
        }
        String resultado = "";

        for ( int r = 0; r < row; r++){
            for ( int c = 0; c < col; c++ ){
                resultado = resultado + matriz[r][c];                              
            }
            System.out.println(resultado);
            resultado = "";
        }

        
    }

    
}
