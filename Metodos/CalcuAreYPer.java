import java.util.*;
public class CalcuAreYPer{

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int opcionayp;
        int altura, base, lado;
        int  la, lb, lc;
        double resultadoa, resultadop, hip;
            System.out.println("Elija una de las siguientes opciones:");
            System.out.println("1.- Calcular area y perimetro de un circulo");
            System.out.println("2.- Calcular area y perimetro de un rectangulo");
            System.out.println("3.- Calcular area y perimetro de un cuadrado");
            System.out.println("4.- Calcular area y perimetro de un triangulo");
            opcionayp = entrada.nextInt();
        switch (opcionayp) {
            case 1:
                System.out.println("Area y perimetro del circulo");
                System.out.println("Ingresa el valor del radio");
                    base = entrada.nextInt();
                    resultadoa = 3.1416*(base*base);
                    resultadop = (2*3.1416)*base;
                    System.out.println("El area es de: "+resultadoa);
                    System.out.println("El perimetro es de: "+resultadop);
                break;

            case 2:
                System.out.println("Area y perimetro del rectangulo");
                System.out.println("Ingresa el valor de la base");
                    base = entrada.nextInt();
                    System.out.println("Ingresa el valor de la altura");
                    altura = entrada.nextInt();
                    resultadoa = (base*altura)/2;
                    hip = Math.sqrt((Math.pow(base/2, 2))+Math.pow(altura, 2));
                    System.out.println(hip);
                    resultadop = hip+hip+base;
                    System.out.println("El area es de: "+resultadoa);
                    System.out.println("El perimetro es de: "+resultadop);
                break;
        
            case 3:
                System.out.println("Area y perimetro del cuadrado");
                System.out.println("Ingresa el valor de un lado");
                    base = entrada.nextInt();
                    resultadoa = base*base;
                    resultadop = base*4;
                    System.out.println("El area es de: "+resultadoa);
                    System.out.println("El perimetro es de: "+resultadop);
                break;

            case 4:
                System.out.println("Area y perimetro del triangulo");
                System.out.println("Ingresa el valor de la base");
                    base = entrada.nextInt();
                    System.out.println("Ingresa el valor de la altura");
                    altura = entrada.nextInt();
                    resultadoa = (base*altura)/2;
                    hip = Math.sqrt((Math.pow(base/2, 2))+Math.pow(altura, 2));
                    System.out.println(hip);
                    resultadop = hip+hip+base;
                    System.out.println("El area es de: "+resultadoa);
                    System.out.println("El perimetro es de: "+resultadop);
                break;

                default:
                System.out.println("Opcion no valida ingrese otra");
                break;
        }
    }
}