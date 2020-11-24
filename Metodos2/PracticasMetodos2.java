import java.util.*;
 public class PracticasMetodos2{
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in); 
        int programa, salida;
        PracticasMetodos2 opcion = new PracticasMetodos2();
        do{
        System.out.println("Seleccione que quiere hacer");
        System.out.println("1.- Programa de Sueldos");
        System.out.println("2.- Programa de Provedores");
        System.out.println("3.- Programa de biblioteca");
        System.out.println("4.- Salir del rpograma");
        programa=entrada.nextInt();
        switch (programa) {
            case 1:
                do{
                System.out.println("Leer 10 numeros y sacar el promedio de los negativos y los positivos");
                opcion.Sueldo();
                System.out.println("1 para repetir, 0 para salir");
                salida = entrada.nextInt();
                }while(salida!=0);
                break;

            case 2:
                do{
                System.out.println("Calculador promedio de pocisiones pares");
                opcion.Provedores();
                System.out.println("1 para repetir, 0 para salir");
                salida = entrada.nextInt();
                }while(salida!=0);
                break;

            case 3:
            do{
                System.out.println("Calificaciones");
                opcion.Biblioteca();
                System.out.println("1 para repetir, 0 para salir");
                salida = entrada.nextInt();
                }while(salida!=0);
                break;

            case 4:
                System.out.println("Gashash pol venil");
                break;

            default:
            System.out.println("Opcion no valida ingrese otra");
            break;
        }
        }while(programa!=4);
    }
    public void Sueldo(){
        Scanner entrada = new Scanner(System.in);
        int id, mult, puesto;
        Double sueldo_total, sueldo_quincenal=0.00;
        String nombre, p;
        System.out.println("Ingrese la id");
        id = entrada.nextInt();
        System.out.println("Ingrese el nombre");
        nombre = System.console().readLine();
        System.out.println("Ingrese el puesto");
        System.out.println("1.Empleado");
        System.out.println("2.Supervisor");
        puesto = entrada.nextInt();
        if(puesto==1){
            sueldo_quincenal += 5000;
            System.out.println("Cuantas horas extra diurnas trabajo?");
            mult = entrada.nextInt();
            sueldo_total = sueldo_quincenal + (mult*50);
            System.out.println("Cuantas horas extra nocturnas trabajo?");
            mult = entrada.nextInt();
            sueldo_total += (mult*60);
            p = "Empleado";
        }else{
            sueldo_quincenal += 8000;
            System.out.println("Aplicando impuestos");
            sueldo_total = sueldo_quincenal-1600-800-1280;
            p = "Supervisor";
        }
        System.out.println("Su ID es "+id);
        System.out.println("Su Nombre es "+nombre);
        System.out.println("Su Puesto es "+p);
        System.out.println("Su Sueldo es de "+sueldo_total+"$");
    }
    public void Provedores(){
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
    public void Biblioteca(){
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