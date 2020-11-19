import java.util.Scanner;
class ConvertidorTemperaturas{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int grados, opcion;
            double conversion;
                do{
                System.out.println("Elija en que desea convertir los grados FAHRENHEIT");
                System.out.println("1.- CELSIUS");
                System.out.println("2.- KELVINE");
                System.out.println("3.- RANKINE");
                System.out.println("4.- SALIR");
                
                opcion = entrada.nextInt();
                
                switch (opcion) {
                    case 1:
                    System.out.println("Ingrese los grados que desea convertir de FAHRENHEIT");
                    grados = entrada.nextInt();
                    conversion = (grados-32)*5/9;
                    System.out.println("Tu converios en grados CELCIUS es "+conversion);
                        break;
                    
                    case 2:
                    System.out.println("Ingrese los grados que desea convertir de FAHRENHEIT");
                    grados = entrada.nextInt();
                    conversion = (grados-32)*5/9+273.15;
                    System.out.println("Tu converios en grados KELVINE es "+conversion);
                        break;
                    
                    case 3:
                    System.out.println("Ingrese los grados que desea convertir de FAHRENHEIT");
                    grados = entrada.nextInt();
                    conversion = grados+459.67;
                    System.out.println("Tu converios en grados RANKINE es "+conversion);
                        break;
                    
                    case 4:
                    System.out.println("Bye vuelve pronto uwu/");
                        break;
                    
                    default:
                    System.out.println("Tu caso no existe elige otro unu");
                        break;
                    }
                }while (opcion!=4);
            System.out.println("Regresando al menu principal");
        }
        
    }