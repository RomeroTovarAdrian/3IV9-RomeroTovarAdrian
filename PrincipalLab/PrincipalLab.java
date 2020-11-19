/*
Esta va a ser nuestra clase principal para el ejemplo de
separacion de clases
*/ 

public class PrincipalLab{
    //metodo principal
    public static void main(String[] args){
        Ejercicios obj = new Ejercicios();
        char opcion;
        //y ahorita no le pondremos nada de nada
        /*
        Para poder hacer uso de los metodos de la segunda clase
        es necesario primero el crear un objeto para invocacion
        de sus metodos u operaciones, y asi
        poder acceder a sus atributos 
        
        */
        System.out.println("Bienvenido al programa elija que desea ejecutar");
        System.out.println("a. Calculadora");
        System.out.println("b. conversion");
        System.out.println("");
        System.out.println("");
        opcion = System.console().readLine().charAt(0);
        switch(opcion){
        case 'a':
            //invocacion
            obj.menu();
            break;

        case 'b':    
            //invocacion
            obj.Conversion();
            break;

        case 'c':    
        //invocacion
        obj.menu();
        break;

        case 'd':
        //invocacion
        obj.menu();
        break;
        }
    }
}