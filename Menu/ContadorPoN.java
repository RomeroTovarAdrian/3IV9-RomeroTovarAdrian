import java.util.Scanner;
class ContadorPoN{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int num, countp, countn;
        countn=0;
        countp=0;
        System.out.println("Ingresa tus numeros y utiliza 0 para finalizar el proceso owo");
        do{
        System.out.println("Ingresa tu numero");
        num = entrada.nextInt();
        if(num==0){
            System.out.println("Gracias por venir uwu aqui esta tu resultado");
                System.out.print("Numeros Positivos "+countp);
                System.out.print(", Numeros Negativos "+countn);

        }else{

        if(num<0){ 
                countn = countn + 1;
                
        }else if(num>0){
                countp = countp + 1;
        }
            }
        }while(num!=0);
    }
}