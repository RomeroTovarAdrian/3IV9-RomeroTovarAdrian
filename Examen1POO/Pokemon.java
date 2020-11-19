import java.util.*;

class Pokemon{

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        int modo, pokedex, pokemon, pokemone, ataque, ataquee, hp, hpe;
        String rival, tu;
        do{
                System.out.println("Bienvenido a la pokedex");
                System.out.println("ingrese el numero del pokemon que desea ver");
                System.out.println("001 Bulbasaur");
                System.out.println("004 Charmander");
                System.out.println("007 Squirtle");
                System.out.println("O ingrese 5 Para Entrar al combate");
                System.out.println("0 Salir del programa");
                pokedex=entrada.nextInt();
                switch(pokedex){
                    case 001:
                    System.out.println("001 Bulbasuar");
                    System.out.println("id 001"); 
                    System.out.println("nombre Bulbasuar"); 
                    System.out.println("fuerza 2"); 
                    System.out.println("defensa 2"); 
                    System.out.println("vida 5"); 
                    System.out.println("ataque principal tacleada"); 
                    System.out.println("ataque secundario arañaso");
                    break;

                    case 004:
                    System.out.println("004 Charmander");
                    System.out.println("id 004"); 
                    System.out.println("nombre Charmander"); 
                    System.out.println("fuerza 3"); 
                    System.out.println("defensa 1"); 
                    System.out.println("vida 5"); 
                    System.out.println("ataque principal Tacleada"); 
                    System.out.println("ataque secundario arañazo");
                    break;

                    case 007:
                    System.out.println("007 Squirtle");
                    System.out.println("id 007"); 
                    System.out.println("nombre Squirtle"); 
                    System.out.println("fuerza 1"); 
                    System.out.println("defensa 3"); 
                    System.out.println("vida 5"); 
                    System.out.println("ataque principal tacleada"); 
                    System.out.println("ataque secundario arañazo");
                    break;
                    
                    case 5:
                    hpe = 5;
                    pokemone = (int)(Math. random()*3+1);
                        switch(pokemone){
                        case 1:
                        System.out.println("Un Bulbasaur salvaje aparece");
                        rival="Bulbasaur";
                        break;
                        case 2:
                        System.out.println("Un Charmander salvaje aparece");
                        rival="Charmander";
                        break;
                        case 3:
                        System.out.println("Un Squirtle salvaje aparece");
                        rival="Squirtle"; 
                        break;
                    }
                    System.out.println("Elige tu pokemon");
                    System.out.println("1 Bulbasar");
                    System.out.println("2 Charmander");
                    System.out.println("3 Squirtle");
                    pokemon=entrada.nextInt();
                    hp = 5;
                    switch(pokemon){
                        case 1:
                        System.out.println("Bulbasaur yo te elijo");
                        tu="Bulbasaur";
                        break;
                        case 2:
                        System.out.println("Un Charmander yo te elijo");
                        tu="Charmander";
                        break;
                        case 3:
                        System.out.println("Un Squirtle yo te elijo");
                        tu="Squirtle";
                        break;
                        default:
                        System.out.println("Opcion no valida elige de nuevo");
                        break;
                        }
                    
                    
                    while(hp>=1 && hpe>=1){
                    System.out.println("Elija que ataque quiere usar");
                    System.out.println("1 Tacleada");
                    System.out.println("2 Arañaso");
                    ataque=entrada.nextInt();
                    switch(ataque){
                        case 1:System.out.println("Tu pokemon uso tacleada");
                    break;
                        case 2:System.out.println("Tu pokemon uso arañaso");
                    break;
                    default:
                        System.out.println("Opcion no valida elige de nuevo");
                        break;
                    }
                    
                    hpe = hpe-ataque;
                    System.out.println("La energia del pokemon rival es de "+hpe);
                    if(hpe>=0){
                    ataquee = (int)(Math. random()*2+1);
                    switch(ataquee){
                    case 1:System.out.println("El pokemon enemigo uso tacleada");
                    break;
                    case 2:System.out.println("El pokemon enemigo uso arañaso");
                    break;
                    }
                    hp = hp-ataquee;
                    }
                    System.out.println("La energia de tu pokemon es de "+hp);
                    }
                    if(hpe<=0){
                        System.out.println("oh el pokemon rival se ha debilitado");
                        System.out.println("oh tu pokemon ha ganado");
                    }else if(hp<=0){
                        System.out.println("oh tu pokemon se ha debilitado");
                        System.out.println("oh el pokemon rival ha ganado");
                    }
                    break;

                    case 0:
                    System.out.println("Saliendo");
                    break;

                    default:
                        System.out.println("Opcion no valida porfavor elija de nuevo");
                    break;
                }
            }while(pokedex!=0);
        }
    } 