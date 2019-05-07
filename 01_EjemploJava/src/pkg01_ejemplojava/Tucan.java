
package pkg01_ejemplojava;

public class Tucan {
    
    String[] colores;
    float longitud;
    int edad;
    
    public Tucan(){//constructor
        this.edad = 0;
        this.longitud = 5f;
        colores = new String[] {
            "blanco", "marrón"
        };
    }
    public void piar(){
        System.out.println("Pio pio  "
        + edad + " años");
    }
    
}
