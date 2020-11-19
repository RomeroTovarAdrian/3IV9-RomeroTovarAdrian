import java.util.Scanner;

class DecimalBinario{
    public static void main(String[] args) {

        int numero, exp, digito, estado;
        double binario;
        Scanner entrada = new Scanner(System.in);
do{
    System.out.println("1 Entrar al convertidor de decimal a binario");
    System.out.println("0 Salir al menu");
    estado = entrada.nextInt();
    if(estado==1){
        do{ 
            System.out.print("Introduce un numero entero mayor o igual a 0: ");                                                
            numero = entrada.nextInt();
        }while(numero < 0);

        exp=0;
        binario=0;
        while(numero!=0){
                digito = numero % 2;           
                binario = binario + digito * Math.pow(10, exp);                                                   
                exp++;
                numero = numero/2;
        }
        System.out.printf("Binario: %.0f %n", binario);
    }
    }while(estado!=0);
}
}