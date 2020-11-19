import java.util.*;
public class LectorDiesNumeros{
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