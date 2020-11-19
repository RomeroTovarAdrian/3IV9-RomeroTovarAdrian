import java.util.*;

class forkawaii{

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        int num;

        System.out.println("Ingresa el valor para el contador");

        num = entrada.nextInt();

        System.out.println("Ejemplo de un for");
        for(int i=0; i<=num; i++){
            //vamos a tener un cuerpo del problema o de la sentencia
            //instrucciones operaciones 

            System.out.println();
            System.out.println(" -- "+i+" -- ");
            System.out.println();
            for(int j=0; j<=3; j++){

                System.out.print(" // "+j+" // ");
                //System.out.println();
                for(int k=0; k<=2; k++){
                    //System.out.print(" ** "+k+" * ");

                }
            }
        }
    }
} 