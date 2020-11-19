import java.util.Scanner;

class Factorial{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        long factorial=1;
        int num, salidaf;
        do{
            System.out.println("1 Entrar al programa");
            System.out.println("0 salir al menu principal");
            salidaf = entrada.nextInt();
        if(salidaf==1){
        System.out.print("Introduce un numero: ");
        num = entrada.nextInt();
        for (int i = num; i > 0; i--) {
            factorial = factorial * i;
        }
        System.out.println("El factorial de " + num + " es: " + factorial);
        }
    }while(salidaf!=0);
    }
}