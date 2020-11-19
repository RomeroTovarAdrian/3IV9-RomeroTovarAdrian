import java.util.*;
public class Llamadas {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcionCR, opcionl, opcions, numva=0, recarga;
        float  saldo=0;
        long  numero, limitea, limiteb;
        do{
        System.out.println("Elija que desea hacer");
        System.out.println("1.- Hacer una llamada");
        System.out.println("2.- Consultar o recargar saldo");
        System.out.println("3.- Finalizar programa");
        opcionl = entrada.nextInt();
        switch (opcionl) {
            case 1:
            System.out.println("Bienvenido al sistema de llamadas porfavor ingrese el numero");
                do{
                    numero = entrada.nextLong();
                    limitea=1000000000000L;
                    if (numero<1000000000 || numero>limitea) {
                        System.out.println("El numero no es valido ingrese otro");
                        //Los numeros validos en mexico son de 10 digitos
                    }else{
                        numva = 1;
                    }
                }while(numva==0);
                limitea=9999999999L;
                if(numero<limitea && saldo>0.5){//local
                    //un numero de 10 digitos es un numero local
                    System.out.println("Es un numero Local");
                    saldo-=0.5;
                }else{
                    limitea=440000000000L;
                    limiteb=450000000000L;
                    if(numero>=limitea && numero<limiteb && saldo>0.2){//celular
                        //Es un numero celular porque empieza con 44
                        System.out.println("Es un numero celular");
                        saldo-=0.2;
                    }else{
                        limitea=999999999999L;
                        if(saldo>0.6){//internacional
                            //es el numero internacional valido porque tiene 12 digitos
                            System.out.println("Es un numero internacional");
                            saldo-=0.6;
                        }else{
                            System.out.println("Su saldo no es suficiente realiza una recarga");
                        }
                    }
                }
                break;

            case 2:
                do{
                    System.out.println("1.- Consultar saldo");
                    System.out.println("2.- Recargar saldo");
                    System.out.println("3.- Regresar al menu");
                    opcions = entrada.nextInt();
                    switch (opcions) {
                    case 1:
                        System.out.println("Su saldo es de "+saldo);
                        break;
                
                    case 2:
                        System.out.println("Ingrese la cantidad que desea recargar");
                        recarga=entrada.nextInt();
                        saldo+=recarga;
                        break;

                    case 3:
                        System.out.println("");
                        break;

                    default:
                        System.out.println("La opcion no es valida intente de nuevo");  
                        break;

                    }
                }while(opcions!=3);
                break;

            case 3:
                System.out.println("Saliendo");
                break;

            default:
            System.out.println("Opcion no valida intente de nuevo");
            break;
        }
    }while(opcionl!=3);
    }
}
