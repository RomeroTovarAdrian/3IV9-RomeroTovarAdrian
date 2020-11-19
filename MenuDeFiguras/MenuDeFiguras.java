import java.util.Scanner;

class FiguraMenuCiclico{

    public static void main(String[] args){
        //variables  y objetos
        Scanner entrada = new Scanner(System.in);
        String opcion;
        int altura, base, lado;
        int  la, lb, lc;
        double resultadoa, resultadop, hip, ap;
        int caso;
        caso=1;
        //Menu de opciones
        System.out.println("Bienvenido al programa de calculo de areas y perimetros");
        do{
            System.out.println("Elija una de las siguientes opciones:");
            System.out.println("1.- Calcular area y perimetro de un cuadrado");
            System.out.println("2.- Calcular area y perimetro de un triangulo");
            System.out.println("3.- Calcular area y perimetro de un circulo");
            System.out.println("4.- Calcular area y perimetro de un rectangulo");
            System.out.println("5.- Calcular area y perimetro de un rombo");
            System.out.println("6.- Calcular area y perimetro de un hexagono");
            System.out.println("S.- Salir");
        
            opcion = entrada.nextLine();
            System.out.println("La opcion elegida es "+opcion);
            //saber que opcion para que calculo
            switch(opcion){
                case "1"://aqui saca area y perimetro de un cadrado
                    System.out.println("Ingresa el valor de un lado");
                    base = entrada.nextInt();
                    resultadoa = base*base;
                    resultadop = base*4;
                    System.out.println("El area es de: "+resultadoa);
                    System.out.println("El perimetro es de: "+resultadop);
                    //cerrar los casos
                    break;

                case "2"://aqui saca area y perimetro de un trinagulo
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

                case "3"://aqui saca area y perimetro de un circulo
                    System.out.println("Ingresa el valor del radio");
                    base = entrada.nextInt();
                    resultadoa = 3.1416*(base*base);
                    resultadop = (2*3.1416)*base;
                    System.out.println("El area es de: "+resultadoa);
                    System.out.println("El perimetro es de: "+resultadop);
                    break;

                case "4"://aqui saca area y perimetro de un rectangulo
                    System.out.println("Ingresa el valor de la base");
                    base = entrada.nextInt();
                    System.out.println("Ingresa el valor de la altura");
                    altura = entrada.nextInt();
                    resultadoa = base*altura;
                    resultadop = (base*2)+(altura*2);
                    System.out.println("El area es de: "+resultadoa);
                    System.out.println("El perimetro es de: "+resultadop);
                    //cerrar los casos
                    break;

                case "5"://aqui saca area y perimetro de un rombo
                    System.out.println("Ingresa el valor del largo");
                    base = entrada.nextInt();
                    System.out.println("Ingresa el valor de la altura");
                    altura = entrada.nextInt();
                    resultadoa = (base*altura)/2;
                    hip = Math.sqrt(Math.pow(base/2, 2)+Math.pow(altura/2, 2));
                    resultadop = hip*4;
                    System.out.println("El area es de: "+resultadoa);
                    System.out.println("El perimetro es de: "+resultadop);
                    break;

                case "6"://aqui saca area y perimetro de un hexagono
                    System.out.println("Ingresa el valor de un lado");
                    base = entrada.nextInt();
                    resultadop = base*6;
                    ap = Math.sqrt((Math.pow(base, 2)-Math.pow(base, 2)/2));
                    resultadoa = (resultadop*ap)/2;
                    System.out.println("El area es de: "+resultadoa);
                    System.out.println("El perimetro es de: "+resultadop);
                    break;

                case "S":
                case "s":
                    System.out.println("Gracias por venir.");
                    caso=0;
                    break;

                default:
                System.out.println("Error opcion no valida");
                    break;
                }
        } while (caso==1);
    }
}