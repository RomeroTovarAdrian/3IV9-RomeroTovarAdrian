import java.util.*;
public class CalculadorProPares{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int count=5, suma=0, promedio=0, arreglo[] = new int[10];
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
}