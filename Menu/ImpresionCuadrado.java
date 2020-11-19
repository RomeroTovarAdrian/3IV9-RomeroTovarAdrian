import java.util.*;

class ImpresionCuadrado{

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        int count;
        do{
            System.out.println("Ingresa el tamaño del rectangulo (escribe 0 para salir)");

            count = entrada.nextInt();


            for(int i=1; i<=count; i++){
                System.out.println("****");
                
            }
    }   while(count!=0);
    }
} 