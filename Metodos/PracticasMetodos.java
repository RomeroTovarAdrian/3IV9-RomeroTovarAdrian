import java.util.*;

public class PracticasMetodos{
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in); 
        int programa, salida;
        PracticasMetodos opcion = new PracticasMetodos();
        do{
        System.out.println("Seleccione que quiere hacer");
        System.out.println("1.- Calculador de edad");
        System.out.println("2.- Calculador area y perimetros de figuras");
        System.out.println("3.- Sistema de llamadas");
        System.out.println("4.- Salir del rpograma");
        programa=entrada.nextInt();
        switch (programa) {
            case 1:
                do{
                System.out.println("Leer 10 numeros y sacar el promedio de los negativos y los positivos");
                opcion.CalculadorDeEdad();
                System.out.println("1 para repetir, 0 para salir");
                salida = entrada.nextInt();
                }while(salida!=0);
                break;

            case 2:
                do{
                System.out.println("Calculador promedio de pocisiones pares");
                opcion.CalcuAreYPer();
                System.out.println("1 para repetir, 0 para salir");
                salida = entrada.nextInt();
                }while(salida!=0);
                break;

            case 3:
            do{
                System.out.println("Calificaciones");
                opcion.Llamadas();
                System.out.println("1 para repetir, 0 para salir");
                salida = entrada.nextInt();
                }while(salida!=0);
                break;

            case 4:
                System.out.println("Gashash pol venil");
                break;

            default:
            System.out.println("Opcion no valida ingrese otra");
            break;
        }
        }while(programa!=4);
    }
    public void CalculadorDeEdad(){
        int day=0, month=0, yearr=0;
        int edadd, edadm, edada;
        Scanner entrada = new Scanner(System.in);
        Calendar fecha = new GregorianCalendar();
                                                      
        int year = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH);
        int dia = fecha.get(Calendar.DAY_OF_MONTH);

        System.out.println("Introduce tu año de nacimiento");
        yearr=entrada.nextInt();
        System.out.println("Introduce tu mes de nacimiento");
        month=entrada.nextInt();
        System.out.println("Introduce tu dia de nacimiento");
        day=entrada.nextInt();

        System.out.println("Fecha Actual: " + dia + "/" + (mes+1) + "/" + year);
        System.out.println("Fecha de nacimiento: " + day + "/" + month + "/" + yearr);
        
        edadd=dia-day;
        edadm=mes-month;
        edada=year-yearr;

        if(edadd<0){
            edadd+=30;
            edadm-=1;
        }

        if(edadm<0){
            edadm+=12;
            edada-=1;
        }

        System.out.println("tu edad: " + edadd + " dias /" + (edadm+1) + " meses /" + edada + " años");
    }
    public void CalcuAreYPer(){
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
    
    public void Llamadas(){
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
                        System.out.println("La llamada fue realizada a un numero Local");
                        saldo-=0.5;
                    }else{
                        limitea=440000000000L;
                        limiteb=450000000000L;
                        if(numero>=limitea && numero<limiteb && saldo>0.2){//celular
                            //Es un numero celular porque empieza con 44
                            System.out.println("La llamada fue realizada a un numero celular");
                            saldo-=0.2;
                        }else{
                            limitea=999999999999L;
                            if(saldo>0.6){//internacional
                                //es el numero internacional valido porque tiene 12 digitos
                                System.out.println("La llamada fue realizada a un numero internacional");
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
            
