import java.util.*;
public class AreYLength{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int base;
        Double resultadoa, resultadop;
            System.out.println("Ingresa el valor del radio");
            base = entrada.nextInt();
            resultadoa = 3.1416*(base*base);
            resultadop = (2*3.1416)*base;
            System.out.println("El area es de: "+resultadoa);
            System.out.println("La longitud es de: "+resultadop);
    }
}