//aqui es donde debemos descubrir el tipo de asociacion entre clases

import java.util.Scanner;

public class Ejercicios{

    //objeto scanner
    Scanner entrada = new Scanner(System.in);

    /*
    Vamos a crear un programa para tener una calculadora
    asi mismo que pueda realizar conversion de unidades
    creacion de cuadritos y movimiento en cuadro
    */

    //vamos a crear el menu
    public void menu(){

        char op;

        System.out.println("Bienvenidos a este programa :3");
        System.out.println("a.- Calculadora");
        System.out.println("b.- Conversion de unidades");
        System.out.println("c.- Creacion de cuadros");
        System.out.println("d.- Movimiento en cuadro");
        System.out.println("Elija la opcion deseada");
        // cuando es caracter si se ocupar charAt(posicion del caracter)
        op = entrada.next().charAt(0);

        //vamos a crear las opciones del menu anterior

        switch(op){

            case 'a':
                //vamos a crear un metodo para la calculadora
                Calculadora();
                break;

            case 'b':
                //vamos a crear un metodo para la conversion de unidades
                Conversion();
                break;

            case 'c':
                //vamos a crear un metodo para la creacion de cuadros
                CreaCuadros();
                break;

            case 'd':
                //vamos a crear un metodo para movimiento en cuadro
                MoviCuadros();
                break;
        }
    }

    //vamos a crear el metodo de la calculadora
    public void Calculadora(){

        //variables
        double numero = 0.00, suma = 0.00, multi = 1.00, div = 0.00;
        char operacion, p;

        //instrucciones
        System.out.println("Seleccione la operacion deseada");
        System.out.println("a.- Suma y Resta");
        System.out.println("b.- Multiplicacion");
        System.out.println("c.- Division");

        operacion = entrada.next().charAt(0);

        switch(operacion){
            case 'a':
                //que sume y sume y sume
                do{
                    System.out.println("Para parar la operacion presione '0'");
                    System.out.println("Ingresa el valor a sumar");
                    numero = entrada.nextDouble();

                    //operacion
                    suma += numero;
                    //sumar = suma + numero;
                }while((numero!=0));

                System.out.println("La suma de los numeros es de: " +suma);
                break;

            case 'b':
                 //que multiplique
                 do{
                    System.out.println("Para parar la operacion presione '0'");
                    System.out.println("Ingresa el valor a multiplicar");
                    numero = entrada.nextDouble();

                    //operacion
                    if(numero >=1){
                        multi *= numero;
                    }else{
                        System.out.println("Solo positivos");
                    }

                   
                }while((numero!=0));

                System.out.println("La multiplicacion de los numeros es de: " +multi);
                break;

            case 'c':
                //ahi lo terminan soy flojito (uwu)/
                do{
                    System.out.println("Para parar la operacion presione '0'");
                    System.out.println("Ingresa el valor a dividir");
                    div = entrada.nextDouble();
                    if(div < 0){
                        System.out.println("Solo positivos");
                    }
                }while(div < 0);
                do{
                    System.out.println("Para parar la operacion presione '0'");
                    System.out.println("Ingresa el valor a dividir");
                    numero = entrada.nextDouble();

                    //operacion
                    if(numero >=1){
                        div /= numero;
                    }else{
                        System.out.println("Solo positivos");
                    }

                   
                }while((numero!=0));

                System.out.println("La division de los numeros es de: " +div);
                break;
        }
    }

    public void Conversion(){
        //porque soy chiquito *w*
        /*
        quiero conversiones de:
        metros a cm
        metros a pulgadas
        kilogramos a libras
        kilogramos a onzas
        m/s a KM/s
        */ 
        double metros = 0.00, centimetros = 0.00, pulgadas = 0.00, kilogramos = 0.00, libras = 0.00, onzas = 0.00, msobres = 0.00, kmsobres = 0.00;
        char operacion;

        //instrucciones
        System.out.println("Seleccione la conversion deseada");
        System.out.println("a.- metros a centimetros");
        System.out.println("b.- metros a pulgadas");
        System.out.println("c.- kilogramos a libras");
        System.out.println("d.- kilogramos a onzas");
        System.out.println("e.- m/s a KM/s");
        
        operacion = entrada.next().charAt(0);

        switch(operacion){
        case 'a':
                System.out.println("Ingresa los metros que quieras convertir");
                metros = entrada.nextDouble();
                centimetros = metros * 100;
                System.out.println("La conversion a centimetros es de: " +centimetros);
                break;

        case 'b':
            System.out.println("Ingresa los metros que quieras convertir");
            metros = entrada.nextDouble();
            pulgadas = metros * 39.37; 
                   
            System.out.println("La conversion a pulgadas es de:" +pulgadas);
            break;

        case 'c':
            System.out.println("Ingresa los kilogramos que quieras convertir");
            kilogramos = entrada.nextDouble();
            libras = kilogramos * 2.20; 
            System.out.println("La conversion a libras es de: " +libras);
            break;

        case 'd':
            System.out.println("Ingresa los kilogramos que quieras convertir");
            kilogramos = entrada.nextDouble();
            onzas = kilogramos * 35.27; 
            System.out.println("La conversion a onzas es de: " +onzas);
            break;

        case 'e':
            System.out.println("Ingresa la velocidad en m/s para convertir");
            msobres = entrada.nextDouble();
            kmsobres = msobres / 1000; 
            System.out.println("La conversion a km/s es de: " +kmsobres);
            break;

        }
    }

    public void CreaCuadros(){
        //porque soy chiquito *w*
        //yo lo hago wiiiiiiii
    }

    public void MoviCuadros(){
        //porque soy chiquito *w*
    }
}