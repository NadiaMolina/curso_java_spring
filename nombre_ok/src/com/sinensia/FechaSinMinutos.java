//vamos a modificar la clase getTime para que no tenga en cuenta los segundos (solo dias)
package com.sinensia;

import java.util.Date;
import java.util.GregorianCalendar;

public class FechaSinMinutos extends GregorianCalendar {

//constructor con argumentos
    public FechaSinMinutos(int year, int month, int dayOfMonth) {
        super(year, month, dayOfMonth);
    }

//constructor sin argumentos
    public FechaSinMinutos() {
        super();
    }
    
    public Date getTimeWithoutSeconds(){
        Date fecha = new Date(getTimeInMillis());
        fecha.setHours(0); //obsoleta
        fecha.setMinutes(0);
        fecha.setSeconds(0);
        return fecha;
                
        
    }
    
    //vamos a comparar las fechas
    //sobreescribir método. insert code --> override method --> equals
    //equals devuelve un boolean true or false
    @Override //para modificar un metodo es conveniente añadir este override
    public boolean equals(Object obj) {
       // return super.equals(obj); //super llama al padre. To change body of generated methods, choose Tools | Templates.
       //si el objeto es instancia de FechaSinMinutos ("forma de FechasSinMinutos") hay que hacer un casting para poder acceder a los métodos de FecahsSinMinutos
       //si no solo tendrías los métodos de object
       //un objeto puede tener su forma y la de sus padres
       //cualquier objeto de tipo FechaSinMinuto puede tener la forma de FechaSinMinuto, de GregorianCalendar, de object...
       
       if (obj instanceof FechaSinMinutos){
           //Casting = Conversion de tipos
          FechaSinMinutos objFecha = (FechaSinMinutos) obj;
          if (this.get(YEAR) == objFecha.get(YEAR) 
                  && this.get(MONTH) == objFecha.get(MONTH)
                  && this.get(DAY_OF_MONTH) == objFecha.get(DAY_OF_MONTH))
              
            return true;
           
       }
    return false;
    }

}
