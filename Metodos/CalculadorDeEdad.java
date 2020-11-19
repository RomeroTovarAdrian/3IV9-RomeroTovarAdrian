import java.util.*;
public class CalculadorDeEdad {

    public static void main(String[] args) {
        int day=0, month=0, yearr=0;
        int edadd, edadm, edada;
        Scanner entrada = new Scanner(System.in);
        Calendar fecha = new GregorianCalendar();
                                                      
        int year = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH);
        int dia = fecha.get(Calendar.DAY_OF_MONTH);

        System.out.println("Introduce tu año de nacimiento");
        yearr=entrada.nextInt();
        System.out.println("Introduce tu mes de nacimiento");
        month=entrada.nextInt();
        System.out.println("Introduce tu dia de nacimiento");
        day=entrada.nextInt();

        System.out.println("Fecha Actual: " + dia + "/" + (mes+1) + "/" + year);
        System.out.println("Fecha de nacimiento: " + day + "/" + month + "/" + yearr);
        
        edadd=dia-day;
        edadm=mes-month;
        edada=year-yearr;

        if(edadd<0){
            edadd+=30;
            edadm-=1;
        }

        if(edadm<0){
            edadm+=12;
            edada-=1;
        }

        System.out.println("tu edad: " + edadd + " dias /" + (edadm+1) + " meses /" + edada + " años");
    }
}