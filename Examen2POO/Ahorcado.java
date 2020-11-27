import java.util.*;
public class Ahorcado{
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        String palabra, letra;
        int vidas, negativo, contador; 
        System.out.println("Ingrese la palabra");
        palabra = entrada.nextLine();
        Integer l=palabra.length();
        System.out.println(l);
        String letras[] = new String[l];
        int mostrador[] = new int[l];
        for(int i = 0; i<letras.length; i++){
            letras[i]=palabra.substring(i,i+1);
        }
        for(int i = 0; i<letras.length; i++){
            System.out.println(letras[i]);
        }
        vidas=7;
        contador=l;
        do{
            System.out.println("Ingrese la letra que crea que esta en la palabra");
            letra = entrada.nextLine();
            negativo=0;
            for(int i = 0; i<letras.length; i++){
                System.out.println(letras[i]);
                System.out.println(letra);
                if(letra.equals(letras[i])){
                    mostrador[i]=1;
                    contador-=1;
                    System.out.println(contador);
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
    }
}
