import java.util.*;
public class Ahorcado{
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        String palabra, letra;
        int vidas, negativo, contador, salida; 
        do{
            System.out.println("Ingrese la palabra");
            palabra = System.console().readLine();
            Integer l=palabra.length();
            String letras[] = new String[l];
            int mostrador[] = new int[l];
            for(int i = 0; i<letras.length; i++){
                letras[i]=palabra.substring(i,i+1);
            }
            vidas=7;
            contador=l;
            do{
                System.out.println("Ingrese la letra que crea que esta en la palabra");
                letra = System.console().readLine();
                negativo=0;
                for(int i = 0; i<letras.length; i++){
                    if(letra.equals(letras[i])){
                        mostrador[i]=1;
                        contador-=1;
                    }else{
                        negativo+=1;
                    }
                }
                System.out.println();
                for(int i = 0; i<letras.length; i++){
                    if(mostrador[i]==1){
                        System.out.print(letras[i]+" ");
                    }else{
                        System.out.print("_ ");
                    }
                }
                System.out.println();
                if(negativo==l){
                    vidas-=1;
                }
                System.out.println("vidas restantes "+vidas);
            }while(vidas!=0 && contador!=0);
            if(vidas==0){
                System.out.println("Perdiste");
            }else if(contador==0){
                System.out.println("Ganaste");
            }
            System.out.println("Que quiere hacer?");
            System.out.println("1. para jugar de nuevo");
            System.out.println("0. Para cerrar el programa");
            salida = entrada.nextInt();
        }while(salida!=0);
    }
}
