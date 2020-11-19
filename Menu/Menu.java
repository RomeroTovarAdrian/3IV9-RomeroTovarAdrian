import java.util.Scanner;
class Menu{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int opcion;
            do{
                System.out.println("Codigo creado por Adrian Romero Tovar uwu/");
                System.out.println("Elija una opcion y comience a disfrutar uwu");
                System.out.println("1 Tienda de abono");
                System.out.println("2 Numero decimal a binario");
                System.out.println("3 Convertidor de grados Farenheit");
                System.out.println("4 Contador de numeros positivos y negativos");
                System.out.println("5 Factura");
                System.out.println("6 Area, perimetro y volumen");
                System.out.println("7 Tabla de valores");
                System.out.println("8 Calcular factorial");
                System.out.println("9 Impresion de cuadrado");
                System.out.println("10 Impresion de cuadrado hueco");
                System.out.println("11 Impresion de patron");
                System.out.println("12 Impresion de diamante");
                System.out.println("13 Calculadora");
                System.out.println("14 Salir del programa uwu");
                    opcion = entrada.nextInt();
                switch(opcion){
                    case 1:
                    System.out.println("1 Tienda de abono uwu");
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
                        System.out.println("Gracias por venir vuelva pronto uwu");
                        break;
                    
                    case 2:
                        int numero, exp, digito, estado;
                        double binario;
                        System.out.println("2 Numero decimal a binario");
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
                    System.out.println("Gracias por venir vuelva pronto uwu");
                        break;
                
                    case 3:
                        int grados, opcionct;
                        double conversion;
                        System.out.println("3 Convertidor de grados Farenheit");
                            do{
                            System.out.println("Elija en que desea convertir los grados FAHRENHEIT");
                            System.out.println("1.- CELSIUS");
                            System.out.println("2.- KELVINE");
                            System.out.println("3.- RANKINE");
                            System.out.println("4.- SALIR");
                            
                            opcionct = entrada.nextInt();
                            
                            switch (opcionct) {
                                case 1:
                                System.out.println("Ingrese los grados que desea convertir de FAHRENHEIT");
                                grados = entrada.nextInt();
                                conversion = (grados-32)*5/9;
                                System.out.println("Tu converios en grados CELCIUS es "+conversion);
                                    break;
                                
                                case 2:
                                System.out.println("Ingrese los grados que desea convertir de FAHRENHEIT");
                                grados = entrada.nextInt();
                                conversion = (grados-32)*5/9+273.15;
                                System.out.println("Tu converios en grados KELVINE es "+conversion);
                                    break;
                                
                                case 3:
                                System.out.println("Ingrese los grados que desea convertir de FAHRENHEIT");
                                grados = entrada.nextInt();
                                conversion = grados+459.67;
                                System.out.println("Tu converios en grados RANKINE es "+conversion);
                                    break;
                                
                                case 4:
                                System.out.println("Bye vuelve pronto uwu/");
                                    break;
                                
                                default:
                                System.out.println("Tu caso no existe elige otro unu");
                                    break;
                                }
                            }while (opcionct!=4);
                        System.out.println("Gracias por venir vuelva pronto uwu");
                        System.out.println("Regresando al menu principal");
                            break;

                    case 4:
                        int num, countp, countn;
                        System.out.println("4 Contador de numeros positivos y negativos");
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
                        System.out.println("Gracias por venir vuelva pronto uwu");
                        break;
                    
                    case 5:
                        int total, producto, cafe, agua, audifonos, papas, maruchan, salida; 
                        int tcafe, tagua, taudifonos, tpapas, tmaruchan;
                        System.out.println("5 Factura");
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
                    System.out.println("Gracias por venir vuelva pronto uwu");
                        break;
                
                    case 6:
                        int altura, base, lado, opcionap;
                        double resultadoa, resultadop, resultadov, hip, ap;
                        System.out.println("6 Area, perimetro y volumen");
                        do{
                        System.out.println("Elija una de las siguientes opciones:");
                        System.out.println("1.- Calcular area y perimetro de un cuadrado");
                        System.out.println("2.- Calcular area y perimetro de un triangulo");
                        System.out.println("3.- Calcular volumen de una esfera");
                        System.out.println("4.- Calcular volumen de un cilindro");
                        System.out.println("5.- Salir");
                        opcionap = entrada.nextInt();
                        System.out.println("La opcion elegida es "+opcionap);
                        switch(opcionap){
                            case 1://aqui saca area y perimetro de un cadrado
                                System.out.println("Ingresa el valor de la base");
                                base = entrada.nextInt();
                                System.out.println("Ingresa el valor de la altura");
                                altura = entrada.nextInt();
                                resultadoa = base*altura;
                                resultadop = (base*2)+(altura*2);
                                System.out.println("El area es de: "+resultadoa);
                                System.out.println("El perimetro es de: "+resultadop);
                                //cerrar los casos
                                break;
                
                            case 2://aqui saca area y perimetro de un trinagulo
                                System.out.println("Ingresa el valor de la base");
                                base = entrada.nextInt();
                                System.out.println("Ingresa el valor de la altura");
                                altura = entrada.nextInt();
                                resultadoa = (base*altura)/2;
                                hip = Math.sqrt((Math.pow(base/2, 2))+Math.pow(altura, 2));
                                System.out.println(hip);
                                resultadop = hip+hip+base;
                                System.out.println("El area es de: "+resultadoa);
                                System.out.println("El perimetro es de: "+resultadop);
                                break;
                
                            case 3://aqui saca area y perimetro de un circulo
                                System.out.println("Ingresa el valor del radio");
                                base = entrada.nextInt();
                                resultadov = 4/3*3.1416*Math.pow(base, 2);
                                System.out.println("El Volumen es de: "+resultadov);
                                break;
                
                            case 4://aqui saca area y perimetro de un rectangulo
                                System.out.println("Ingresa el valor del radio");
                                base = entrada.nextInt();
                                System.out.println("Ingresa el valor de la altura");
                                altura = entrada.nextInt();
                                resultadov = 3.1416*Math.pow(base, 2)*altura;
                                System.out.println("El area es de: "+resultadov);
                                //cerrar los casos
                                break;
                
                                case 5:
                                System.out.println("Bye vuelve pronto uwu/");
                                    break;
                
                                default:
                                System.out.println("Tu caso no existe elige otro unu");
                                    break;
                            }
                        }while (opcionap!=5);
                        System.out.println("Gracias por venir vuelva pronto uwu");
                        break;

                    case 7:
                        int numtv, count, pv, sv, tv;
                        System.out.println("7 Tabla de valores");
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
                        System.out.println("Gracias por venir vuelva pronto uwu");
                        break;
                    
                    case 8:
                        long factorial=1;
                        int numf, salidaf;
                        System.out.println("8 Calcular factorial");
                        do{
                            System.out.println("1 Entrar al programa");
                            System.out.println("0 salir al menu principal");
                            salidaf = entrada.nextInt();
                        if(salidaf==1){
                        System.out.print("Introduce un numero: ");
                        numf = entrada.nextInt();
                        for (int i = numf; i > 0; i--) {
                            factorial = factorial * i;
                        }
                        System.out.println("El factorial de " + numf + " es: " + factorial);
                        }
                        }while(salidaf!=0);
                        System.out.println("Gracias por venir vuelva pronto uwu");
                        break;
                
                    case 9:
                        int countic;
                        System.out.println("9 Impresion de cuadrado");
                        do{
                            System.out.println("Ingresa el tamaño del rectangulo (escribe 0 para salir)");
                
                            countic = entrada.nextInt();
                
                
                            for(int i=1; i<=countic; i++){
                                System.out.println("****");
                                
                            }
                    }   while(countic!=0);
                    System.out.println("Gracias por venir vuelva pronto uwu");
                        break;

                    case 10:
                        int countch;
                        System.out.println("10 Impresion de cuadrado hueco");
                        do{
                            System.out.println("Ingresa el tamaño del rectangulo (escribe 0 para salir)");
                
                            countch = entrada.nextInt();
                            if(countch>0){
                            countch = countch-2;
                            System.out.println("*****");
                            for(int i=1; i<=countch; i++){
                                System.out.println("*   *");
                                
                            }
                            System.out.println("*****");
                            }
                    }   while(countch!=0);
                    System.out.println("Gracias por venir vuelva pronto uwu");
                        break;
                    
                    case 11:
                        int opcionp;
                        System.out.println("11 Impresion de patron");
                        do{
                            System.out.println("Eliga que desea hacer");
                            System.out.println("1 imprimir patron");
                            System.out.println("0 salir");
                            opcionp = entrada.nextInt();
                
                
                            if(opcionp==1){
                                System.out.println("********");
                                System.out.println(" ********");
                                System.out.println("********");
                                System.out.println(" ********");
                                System.out.println("********");
                                System.out.println(" ********");
                                System.out.println("********");
                                System.out.println(" ********");
                            }
                            
                    }   while(opcionp!=0);
                    System.out.println("Gracias por venir vuelva pronto uwu");
                        break;

                    case 12:
                        int opcionid;
                        System.out.println("12 Impresion de diamante");
                        do{
                            System.out.println("Eliga que desea hacer");
                            System.out.println("1 imprimir Diamante");
                            System.out.println("0 salir");
                            opcionid = entrada.nextInt();
                
                
                            if(opcionid==1){
                                System.out.println("    *    ");
                                System.out.println("   ***   ");
                                System.out.println("  *****  ");
                                System.out.println(" ******* ");
                                System.out.println("*********");
                                System.out.println(" ******* ");
                                System.out.println("  *****  ");
                                System.out.println("   ***   ");
                                System.out.println("    *    ");
                            }
                            
                    }   while(opcionid!=0);
                    System.out.println("Gracias por venir vuelva pronto uwu");
                        break;
                
                    case 13:
                    System.out.println("13 Calculadora");
                        double res = 0;
                        String operacion;
                        boolean comprobar = false;
                
                        do{
                            String numero1;
                            do {
                                System.out.println("\n Por favor, dame el primer número de la operación nwn. ");
                                numero1 = entrada.nextLine();
                            } while (!numero1.matches("[+-]?[\\d]*[.]?[\\d]+"));
                            double nume1 = Double.parseDouble(numero1);
                            double n1 = new Double(numero1);
                
                            do {
                                System.out.println("\n ¿Que operación desea hacer? (Solo coloque un signo)");
                                System.out.println("Teniendo en cuenta que: \n + = sumar \n - = restar \n"
                                        + " x = multiplicar \n / = dividir \n * = elevar primer número al segundo numero."
                                        + "\n % = residuo");
                            operacion = entrada.nextLine();
                                if (operacion.equals("+") || operacion.equals("-") || operacion.equals("x") ||
                                    operacion.equals("X") || operacion.equals("/") || operacion.equals("%") ||
                                    operacion.equals("*")) {
                                    comprobar = true;
                                }else { comprobar = false; }
                            } while (comprobar != true);
                
                            String numero2;
                            do {
                                System.out.println("\n Por favor, dame el segundo número.");
                                numero2 = entrada.nextLine();
                            } while (!numero2.matches("[+-]?[\\d]*[.]?[\\d]+"));
                            double nume2 = Double.parseDouble(numero2);
                            double n2 = new Double(numero2);
                
                            do{
                                comprobar = true;
                                switch(operacion){
                                    case "+":
                                        res = n1 + n2;
                                        break;
                                    case "-":
                                        res = n1 - n2;
                                        break;
                                    case "x":
                                    case "X":
                                        res = n1 * n2;
                                        break;
                                    case "/":
                                        while(n2 == 0){
                                                do {
                                                    System.err.println(" En el denominador se encuentra \n"
                                                            + "un cero, para evitar errores coloca otro número.");
                                                    numero2 = entrada.nextLine();
                                                }while (!numero2.matches("[+-]?[\\d]*[.]?[\\d]+"));
                                                    nume2 = Double.parseDouble(numero2);
                                                    n2 = new Double(numero2);
                                        }
                                        res = n1 / n2;
                                        break;
                                    case "*":
                                        res = Math.pow(n1, n2);
                                        break;
                                    case "%":
                                        while(n2 == 0){
                                                do {
                                                    System.err.println(" En el denominador se encuentra \n"
                                                            + "un cero, para evitar errores coloca otro número.");
                                                    numero2 = entrada.nextLine();
                                                }while (!numero2.matches("[+-]?[\\d]*[.]?[\\d]+"));
                                                    nume2 = Double.parseDouble(numero2);
                                                    n2 = new Double(numero2);
                                        }
                                        res = n1 % n2;
                                        break;
                                }
                            }while(comprobar != true);
                
                            System.out.println("(" + numero1 + ") " + operacion + " (" + numero2 + ")" + " = " + res);
                            System.out.println("\n ¿Desea hacer alguna otra operación? \n");
                            System.out.println(" [s/n]");
                            do{
                                comprobar = true;
                                operacion = entrada.nextLine();
                
                                switch (operacion) {
                                    case "s":
                                    case "S":
                                    case "n":
                                    case "N":
                                        break;
                                    default:
                                        System.err.println("\n Error, ponga un literal valido. \n");
                                        comprobar = false;
                                }
                            }while(comprobar != true);
                        }while(operacion.equals("s") || operacion.equals("S"));
                        System.out.println("Gracias por venir vuelva pronto uwu");
                        break;

                    case 14:
                    System.out.println("Gracias por venir espero hayas disfrutado uwu");
                        break;
                    
                    default:
                    System.out.println("opcion no valida ingrese otra uwu");
                        break;
                    }
            
                }    while (opcion!=14);
    }
}