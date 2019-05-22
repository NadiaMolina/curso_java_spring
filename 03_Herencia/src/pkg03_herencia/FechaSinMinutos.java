//vamos a modificar la clase getTime para que no tenga en cuenta los segundos (solo dias)
package pkg03_herencia;

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

}
