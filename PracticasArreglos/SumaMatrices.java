import java.util.*;
public class SumaMatrices{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int count=5, suma=0, promedio=0, matrizA[][] = new int[3][3], matrizB[][] = new int[3][3], matrizS[][] = new int[3][3];
        System.out.println("Matriz A");
        System.out.println("ingrese 1 numero en cada pocision");
        for(int i = 0; i<matrizA.length; i++){
            //columnas
            for(int j = 0; j<matrizA.length; j++){
                //vamos a llenar nuestra matriz
                System.out.println("Ingresa el valor de la fila: "+ i + " y la columna : "+ j + " ");
                //tenemos que entregar la posicion
                matrizA[i][j]=entrada.nextInt();
            }
        }
        System.out.println("Matriz B");
        System.out.println("ingrese 1 numero en cada pocision");
        for(int i = 0; i<matrizB.length; i++){
            //columnas
            for(int j = 0; j<matrizB.length; j++){
                //vamos a llenar nuestra matriz
                System.out.println("Ingresa el valor de la fila: "+ i + " y la columna : "+ j + " ");
                //tenemos que entregar la posicion
                matrizB[i][j]=entrada.nextInt();
            }
        }
        for(int i = 0; i<matrizS.length; i++){
            //columnas
            for(int j = 0; j<matrizS.length; j++){
                //vamos a llenar nuestra matriz
                System.out.println("El valor de la fila: "+ i + " y la columna : "+ j + " es");
                //tenemos que entregar la posicion
                matrizS[i][j]=matrizB[i][j]+matrizA[i][j];
                System.out.println(matrizS[i][j]);
            }
        }
    }
}