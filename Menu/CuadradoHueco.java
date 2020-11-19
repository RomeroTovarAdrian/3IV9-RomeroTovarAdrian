import java.util.*;

class CuadradoHueco{

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        int count;
        do{
            System.out.println("Ingresa el tamaño del rectangulo (escribe 0 para salir)");

            count = entrada.nextInt();
            if(count>0){
            count = count-2;
            System.out.println("*****");
            for(int i=1; i<=count; i++){
                System.out.println("*   *");
                
            }
            System.out.println("*****");
            }
    }   while(count!=0);
    }
} 