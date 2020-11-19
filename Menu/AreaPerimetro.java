import java.util.Scanner;
class AreaPerimetro{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int altura, base, lado, opcion;
        double resultadoa, resultadop, resultadov, hip, ap;
        do{
        System.out.println("Elija una de las siguientes opciones:");
        System.out.println("1.- Calcular area y perimetro de un cuadrado");
        System.out.println("2.- Calcular area y perimetro de un triangulo");
        System.out.println("3.- Calcular volumen de una esfera");
        System.out.println("4.- Calcular volumen de un cilindro");
        System.out.println("5.- Salir");
        opcion = entrada.nextInt();
        System.out.println("La opcion elegida es "+opcion);
        switch(opcion){
            case 1://aqui saca area y perimetro de un cadrado
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

            case 2://aqui saca area y perimetro de un trinagulo
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

            case 3://aqui saca area y perimetro de un circulo
                System.out.println("Ingresa el valor del radio");
                base = entrada.nextInt();
                resultadov = 4/3*3.1416*Math.pow(base, 2);
                System.out.println("El Volumen es de: "+resultadov);
                break;

            case 4://aqui saca area y perimetro de un rectangulo
                System.out.println("Ingresa el valor del radio");
                base = entrada.nextInt();
                System.out.println("Ingresa el valor de la altura");
                altura = entrada.nextInt();
                resultadov = 3.1416*Math.pow(base, 2)*altura;
                System.out.println("El area es de: "+resultadov);
                //cerrar los casos
                break;

                case 5:
                System.out.println("Bye vuelve pronto uwu/");
                    break;

                default:
                System.out.println("Tu caso no existe elige otro unu");
                    break;
            }
        }while (opcion!=5);
    }
}
