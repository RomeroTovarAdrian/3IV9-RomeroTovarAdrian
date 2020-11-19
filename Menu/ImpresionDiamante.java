import java.util.*;

class ImpresionDiamante{

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("Eliga que desea hacer");
            System.out.println("1 imprimir Diamante");
            System.out.println("0 salir");
            opcion = entrada.nextInt();


            if(opcion==1){
                System.out.println("    *    ");
                System.out.println("   ***   ");
                System.out.println("  *****  ");
                System.out.println(" ******* ");
                System.out.println("*********");
                System.out.println(" ******* ");
                System.out.println("  *****  ");
                System.out.println("   ***   ");
                System.out.println("    *    ");
            }
            
    }   while(opcion!=0);
    }
}