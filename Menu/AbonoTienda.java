import java.util.Scanner;
class AbonoTienda{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int edad, respuesta;
        do{
                System.out.println("Bienvenido a la tienda de abonos uwu cual es su edad? (para salir introdusca 0)");
                edad = entrada.nextInt();
                if(edad>=65){
                        System.out.println("Su descuento es de 40%");
                }else{
                        if(edad<21 && edad>0){
                                System.out.println("Sus padres son socios? owo?");
                                System.out.println("1 Si");
                                System.out.println("2 No");
                                respuesta = entrada.nextInt();
                                if(respuesta==1){
                                        System.out.println("Su descuento es de 45%");
                                }else{
                                        System.out.println("No tiene descuento uwu");
                                }
                        }else{
                                System.out.println("No tiene descuento uwu");
                        }
                }
        }while (edad!=0);
}
}