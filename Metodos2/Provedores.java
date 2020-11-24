import java.util.*;
public class Provedores{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int arreglopr[] = new int[10],  arregloex[] = new int[10], numeromayor, numeromenor;
        String arreglop[] = new String[10], nombre_cliente;
        Double Precio_Total=0.00, promedio=0.00, suma=0.00;
        System.out.println("Ingrese el nombre del provedor");
        nombre_cliente = System.console().readLine();
        for(int i = 0; i<arreglopr.length; i++){
            System.out.println("Posicion "+i);
            System.out.println("Ingrese el nombre del producto");
            arreglop[i] = System.console().readLine();
            System.out.println("Ingrese el costo producto");
            arreglopr[i] = entrada.nextInt();
            System.out.println("Ingrese su cantidad de producto");
            arregloex[i] =entrada.nextInt();
            suma+=arreglopr[i];
        }
        System.out.println("Suma de precios");
        System.out.println(suma);
        System.out.println("Precio mas alto y mas bajo");
        numeromayor=arreglopr[0];
        numeromenor=arreglopr[0];
        for(int i=0; i<arreglopr.length; i++){
            if(arreglopr[i]>numeromayor){ // 
                numeromayor = arreglopr[i];
            }
        }
        System.out.println("El precio mas alto es "+numeromayor);
        for(int i=0; i<arreglopr.length; i++){
            if(arreglopr[i]<numeromenor){ // 
                numeromenor = arreglopr[i];
            }
        }
        System.out.println(" El precio mas bajo es "+numeromenor);
        System.out.println("Promedio de los precios");
        promedio=suma/10;
        System.out.println(" "+promedio);
        System.out.println(nombre_cliente);
        for(int i = 0; i<arreglopr.length; i++){
            System.out.println("Posicion "+i);
            System.out.println("Nombre del producto "+arreglop[i]);
            System.out.println("Costo del producto "+arreglopr[i]+"$");
            System.out.println("Cantidad de producto "+arregloex[i]);
        }
    }
}