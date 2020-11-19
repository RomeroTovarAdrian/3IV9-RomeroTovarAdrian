import java.util.Scanner;
class Factura{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int total, producto, cafe, agua, audifonos, papas, maruchan, salida; 
        int tcafe, tagua, taudifonos, tpapas, tmaruchan;
        do{
        cafe=0;
        agua=0;
        audifonos=0;
        papas=0;
        maruchan=0;
        tcafe=0;
        tagua=0;
        taudifonos=0;
        tpapas=0;
        tmaruchan=0;
            System.out.println("1 Entrar a la caja");
            System.out.println("0 Salir de la caja");
            salida = entrada.nextInt();
        if(salida == 1){    
        do{
        System.out.println("Elija un producto");
        System.out.println("1 Cafe 30$");
        System.out.println("2 Agua 10$");
        System.out.println("3 Audifonos 15$");
        System.out.println("4 Papas fritas 12$");
        System.out.println("5 Maruchan 15$");
        System.out.println("6 Imprimir ticket");
        producto = entrada.nextInt();
        switch(producto){
        case 1:
        System.out.println("Cantidad que desea comprar");
        cafe = entrada.nextInt();
        tcafe = cafe*30;
        break;

        case 2:
        System.out.println("Cantidad que desea comprar");
        agua = entrada.nextInt();
        tagua = agua*10;
        break;

        case 3:
        System.out.println("Cantidad que desea comprar");
        audifonos = entrada.nextInt();
        taudifonos = audifonos*15;
        break;

        case 4:
        System.out.println("Cantidad que desea comprar");
        papas = entrada.nextInt();
        tpapas = papas*12;
        break;

        case 5:
        System.out.println("Cantidad que desea comprar");
        maruchan = entrada.nextInt();
        tmaruchan = maruchan*15;
        break;

        case 6:
        System.out.println("Procedemos a la impresion de su ticket");
        break;
        }
    }while(producto!=6);
        total = tagua+taudifonos+tcafe+tmaruchan+tpapas;
        System.out.println("Su ticket de compra");
        System.out.println(cafe+" Cafes $"+tcafe);
        System.out.println(agua+" Aguas $"+tagua);
        System.out.println(audifonos+" Audifonos $"+taudifonos);
        System.out.println(papas+" Papas fritas $"+tpapas);
        System.out.println(maruchan+" Maruchans $"+tmaruchan);
        System.out.println("Total       $"+total);
        }
    }while(salida!=0);
}
}