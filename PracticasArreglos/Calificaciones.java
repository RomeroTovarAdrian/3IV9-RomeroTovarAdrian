import java.util.*;
public class Calificaciones{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numeromayor, numeromenor, promedio=0.00, arreglo[] = new double[10], suma=0.00;
        int count=10, repro=0, apro=0;
        System.out.println("ingrese 1 calificacion en cada pocision");
        for(int i = 0; i<arreglo.length; i++){
            System.out.println("Posicion "+i);
            do{
            arreglo[i] = entrada.nextInt();
            if(arreglo[i]<0 || arreglo[i]>10){
                System.out.println("Mete una opcion valida >:c");
            }
            }while(arreglo[i]<0 || arreglo[i]>10);
            suma += arreglo[i];
        }
        System.out.println("Resultados");
        System.out.println("a. Imprimir todas las calificaciones");
        for(int i = 0; i<arreglo.length; i++){
            System.out.print(" "+arreglo[i]);
        }
        System.out.println();
        System.out.println("b. Promedio de las calificaciones");
        promedio=suma/count;
        System.out.println(" "+promedio);
        System.out.println("c. Calificacon mas alta y mas baja");
        numeromayor=arreglo[0];
        numeromenor=arreglo[0];
        for(int i=0; i<arreglo.length; i++){
            if(arreglo[i]>numeromayor){ // 
                numeromayor = arreglo[i];
            }
        }
        System.out.print(" La calificacion mas alta es "+numeromayor);
        for(int i=0; i<arreglo.length; i++){
            if(arreglo[i]<numeromenor){ // 
                numeromenor = arreglo[i];
            }
        }
        System.out.print(" La calificacion mas baja es "+numeromenor);
        System.out.println();
        System.out.println("d. Calificaciones superiores al promedio");
        for(int i = 0; i<arreglo.length; i++){
            if(arreglo[i]>promedio){
                System.out.print(" "+arreglo[i]);
        }
        }
        System.out.println();
        System.out.println("e. Cantidad de alumnos reprobados y aprovados");
        for(int i = 0; i<arreglo.length; i++){
            if(arreglo[i]>=6){
                apro+=1;    
            }else{
                repro+=1;
            }
        }
        System.out.print(" Reprobados "+repro+" Aprovados "+apro);
        System.out.println("");
        System.out.println("uwu");
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int countn=0, countp=0, suman=0, sumap=0, promediop=0, promedion=0, arreglo[] = new int[10];
        System.out.println("ingrese 1 numero en cada pocision");
        for(int i = 0; i<arreglo.length; i++){
            System.out.println("Posicion "+i);
            arreglo[i] = entrada.nextInt();
            if(arreglo[i]>0){
                countp += 1;
                sumap += arreglo[i];

            }else{
                countn += 1;
                suman += arreglo[i];

            }
        }
        promediop= sumap/countp;
        promedion= suman/countn;
        System.out.println("Numeros positivos "+countp);
        System.out.println("El promedio de los numeros positivos es "+promediop);
        System.out.println("Numeros negativos "+countn);
        System.out.println("El promedio de los numeros negativos es "+promedion);
    }
}