import java.util.Scanner;

public class PracticasArreglo{
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in); 
        int programa, salida;
        PracticasArreglo opcion = new PracticasArreglo();
        do{
        System.out.println("Seleccione que quiere hacer");
        System.out.println("1.- Leer 10 numeros y sacar el promedio de los negativos y los positivos");
        System.out.println("2.- Calculador promedio de pocisiones pares");
        System.out.println("3.- Calificaciones");
        System.out.println("4.- Suma de matrices ");
        System.out.println("5.- Salir del rpograma");
        programa=entrada.nextInt();
        switch (programa) {
            case 1:
                do{
                System.out.println("Leer 10 numeros y sacar el promedio de los negativos y los positivos");
                opcion.LectorDiesNumeros();
                System.out.println("1 para repetir, 0 para salir");
                salida = entrada.nextInt();
                }while(salida!=0);
                break;

            case 2:
                do{
                System.out.println("Calculador promedio de pocisiones pares");
                opcion.CalculadorProPares();
                System.out.println("1 para repetir, 0 para salir");
                salida = entrada.nextInt();
                }while(salida!=0);
                break;

            case 3:
            do{
                System.out.println("Calificaciones");
                opcion.Calificaciones();
                System.out.println("1 para repetir, 0 para salir");
                salida = entrada.nextInt();
                }while(salida!=0);
                break;

            case 4:
            do{
                System.out.println("Suma de matrices");
                opcion.SumaMatrices();
                System.out.println("1 para repetir, 0 para salir");
                salida = entrada.nextInt();
                }while(salida!=0);
                break;

            case 5:
                System.out.println("Gashash pol venil");
                break;
        }
        }while(programa!=5);
    
    }
    public void CalculadorProPares(){
        Scanner entrada = new Scanner(System.in);
        int count=5, suma=0, arreglo[] = new int[10];
        double promedio=0;
        System.out.println("ingrese 1 numero en cada pocision");
        for(int i = 0; i<arreglo.length; i++){
            System.out.println("Posicion "+i);
            arreglo[i] = entrada.nextInt();
            if(i%2==0){
                suma+=arreglo[i];
            }
        }
        promedio=suma/count;
        System.out.println("El promedio de los numeros en pocisiones pares es "+promedio);
    }
    public void Calificaciones(){
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
    }
    public void LectorDiesNumeros() {
        Scanner entrada = new Scanner(System.in);
        int countn=0, countp=0, suman=0, sumap=0, arreglo[] = new int[10];
        double  promediop=0, promedion=0;
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
    public void SumaMatrices(){
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