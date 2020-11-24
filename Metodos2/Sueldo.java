import java.util.*;
public class Sueldo{

    public static void main(String[] args){
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
    }
    