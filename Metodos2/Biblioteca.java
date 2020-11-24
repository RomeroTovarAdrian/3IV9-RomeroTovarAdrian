import java.util.*;
public class Biblioteca{

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String arreglonom[] = new String[5], arregloau[] = new String[5];
        int arregloex[] = new int[5], arreglomax[] = new int[5], salida, op;
        System.out.println("Biblioteca");
        for(int i = 0; i<arregloex.length; i++){
            System.out.println("Posicion "+i);
            System.out.println("Ingrese el nombre del libro");
            arreglonom[i] = System.console().readLine();
            System.out.println("Ingrese el autor del libro");
            arregloau[i] = System.console().readLine();
            System.out.println("Ingrese su cantidad de libros");
            arregloex[i] =entrada.nextInt();
            arreglomax[i] = arregloex[i];
        }
        do{
            System.out.println("Que quiere hacer?");
            System.out.println("1.Entrar a la biblioteca");
            System.out.println("2.Salir al menu");
            salida = entrada.nextInt();
            if(salida==1){
            System.out.println("Elija el libro que desea ver");
            for(int i = 0; i<arregloex.length; i++){
                System.out.println("Opcion "+i);
                System.out.print("Nombre del libro: "+arreglonom[i]);
                System.out.print("| Autor: "+arregloau[i]);
                System.out.println("| Cantidad disponible: "+arregloex[i]);
            }
            int i = 0;
            i = entrada.nextInt();
            System.out.println("Que desea realizar?");
            System.out.println("1.Devolucion");
            System.out.println("2.Prestamo");
            op = entrada.nextInt();
            if(op==1){
                if(arregloex[i]<arreglomax[i]){
                arregloex[i]+=1;
                }else{
                    System.out.println("No Se pueden devolver libros que no han sido prestados");
                }
            }else{
                if(arregloex[i]!=0){
                    arregloex[i]-=1;
                }else{
                    System.out.println("No hay libros disponibles");
                }
            }
            }
        }while(salida!=2);
    }
}