package pkg02_colecciones;

import java.util.Date;
import java.util.GregorianCalendar;

public class ProbandoFechas {
    
    
    public static void probar(){
        GregorianCalendar fecha= new GregorianCalendar();
        fecha.set(2019,5,8);
        System.out.println("Fecha: " + fecha.toString()); //mostrar fecha en formato cadena
        Date fechaDate = fecha.getTime();
        System.out.println("Fecha: " + fechaDate.toString());
        int weekyear = fecha.getWeeksInWeekYear();
        System.out.println("Semanas: " + weekyear);
        
        
        GregorianCalendar miCumple;
        miCumple = new GregorianCalendar(2019, 6, 5); //los meses son un array, empiezan en 0
    
       if (miCumple.after(fecha)){
           System.out.println("Aun no es tu cumple");
       }
       else if (miCumple.equals(fecha)){
           System.out.println("Cumpleaños feliz");
       }  //no lo reconoce porque getTime necesita segundos y minutos
       
       else if (miCumple.before(fecha)){
           System.out.println("Ya cumpliste");
       }
       
               
       //intentemos que nos reconozca mi cumple sin los segundos
       
       FechaSinMinutos fechaSinMinutos= new FechaSinMinutos(2019,5,8);
      // fecha.set(2019,5,8);
       
       FechaSinMinutos miCumpleSinMinutos;
       miCumpleSinMinutos = new FechaSinMinutos(2019,5,8);
      
       
       if (miCumpleSinMinutos.getTimeWithoutSeconds().after(fechaSinMinutos.getTimeWithoutSeconds())){
           System.out.println("Aun no es tu cumple");
       }
       else if (miCumpleSinMinutos.getTimeWithoutSeconds().equals(fechaSinMinutos.getTimeWithoutSeconds())){
           System.out.println("Cumpleaños feliz");
       }  //no lo reconoce porque getTime necesita segundos y minutos
       
       else if (miCumpleSinMinutos.getTimeWithoutSeconds().before(fechaSinMinutos.getTimeWithoutSeconds())){
           System.out.println("Ya cumpliste");
       }
    }
    
}
