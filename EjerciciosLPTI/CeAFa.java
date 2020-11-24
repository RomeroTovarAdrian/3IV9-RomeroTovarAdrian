import java.util.*;
public class CeAFa{

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int C, F;

        System.out.println("Ingresela cantidad que desea convertir");
        C = entrada.nextInt();
        F = 32 + ( 9 * C / 5);
        System.out.println("Grados farenheit"+F);
        }
    }
    