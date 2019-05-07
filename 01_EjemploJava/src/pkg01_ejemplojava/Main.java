
package pkg01_ejemplojava;

public class Main {


    public static void main(String[] args) {
   String formateado = nombreApell ("Nadia", "Molina Gil");
   System.out.println(formateado);
   
   Tucan miPajaro= new Tucan();// asignación, apunta a objeto a la dirección que ha reservado new. New reserva y devuelve la dirección
   miPajaro.longitud = 20.5f;
        System.out.println("Longitud tucán: "
         + miPajaro.longitud);
   Tucan otroPajaro= new Tucan();
   otroPajaro.longitud = 25.7f;
        System.out.println("Longitud otro tucán: "
         + otroPajaro.longitud);   
        otroPajaro= miPajaro;
        System.out.println("Otro tucán: "
         + otroPajaro.longitud);
   miPajaro.longitud = 30.4f;
        System.out.println("Longitud tucán: "
         + otroPajaro.longitud);
        otroPajaro.edad = 11;
        System.out.println("Edad: "
        + miPajaro.edad);
        otroPajaro.piar();
        miPajaro.piar();
        
        Tucan nuevoTuc = new  Tucan();
        System.out.println("Nuevo tucan:"
                + nuevoTuc.longitud);
        
}
    
    
   static String nombreApell(String nombre, String apellidos){
           return apellidos + "," +nombre;

}
}