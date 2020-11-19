import java.util.Scanner;
class TablaDeValores{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int numtv, count, pv, sv, tv;
    do{
        System.out.println("De que tamaño quiere la tabla de valores? (escriba 0 para salir uwu)");
        numtv = entrada.nextInt();
        count=1;
        do{
            pv = count*10;
            sv = count*100;
            tv = count*1000;
            System.out.print(" "+count);
            System.out.print(" "+pv);
            System.out.print(" "+sv);
            System.out.println(" "+tv);
            count++;
        }while(count<=numtv);
    }while(numtv!=0);
    }
}