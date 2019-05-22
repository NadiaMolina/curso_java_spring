package com.sinensia.pruebas;

import com.sinensia.FechaSinMinutos;
import com.sinensia.FechaSinMinutos;
import java.util.Date;
import java.util.GregorianCalendar;

public class Fechas {
    
    
    public static void probar(){
        GregorianCalendar fecha= new GregorianCalendar();
        fecha.set(2019,6,5);
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
       
               
       //intentemos que nos reconozca mi cumple sin los segundos. problema de milisegundos
       
       FechaSinMinutos fechaSinMinutos= new FechaSinMinutos(2019,10,9);
       //fechaSinMinutos.set(); //no funciona bien, debe ser por los milisegundos
       
       FechaSinMinutos miCumpleSinMinutos;
       miCumpleSinMinutos = new FechaSinMinutos();
       miCumpleSinMinutos.set(2019,10,9); //la fecha con la hora de este momento
       //aunque luego con la funcion getTimeWithoutSeconds fijas a 0 la hora, los minutos y los segundos; pero no los milisegundos
       //no sale porque con set usan la hora actual y new.. () la hora a 0
       //comprobarlo en Wathes poniendo miCumpleSinMinutos.getTime().getTime() y fechaSinMinutos.getTime().getTime()
       //salen distintos milisegundos; habría que comparar día, mes y año usando String
       if (miCumpleSinMinutos.getTimeWithoutSeconds().after(fechaSinMinutos.getTimeWithoutSeconds())){
           System.out.println("Aun no es tu cumple");
       }
       else if (miCumpleSinMinutos.getTimeWithoutSeconds().equals(fechaSinMinutos.getTimeWithoutSeconds())){
           System.out.println("Cumpleaños feliz");
       }  //no lo reconoce porque getTime necesita segundos y minutos
       
       else if (miCumpleSinMinutos.getTimeWithoutSeconds().before(fechaSinMinutos.getTimeWithoutSeconds())){
           System.out.println("Ya cumpliste");
       }
       
       
       //con el nuevo metodo equals
       
       if (miCumple.equals(fechaSinMinutos)){
           System.out.println("Cumpleaños feliz");
       }
       else if (miCumple.after(fechaSinMinutos)){
           System.out.println("Aun no es tu cumple");
       }  //no lo reconoce porque getTime necesita segundos y minutos
       
       else if (miCumple.before(fechaSinMinutos)){
           System.out.println("Ya cumpliste");
       }
  
    
    }
    
}
