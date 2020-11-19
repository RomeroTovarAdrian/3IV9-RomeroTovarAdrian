import java.util.Scanner;
class Suma2numeros{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int num1; 
        int resultado=0;
        do{
            System.out.println("Ingresa el numero a sumar: ");
            num1 = entrada.nextInt();
            resultado = resultado + num1;
        }while(num1!=0);
        System.out.println("La suma de los numeros es de: "+resultado);
    }
}