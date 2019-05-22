package pkg02_colecciones;

public class cliente {
    
   private long id; /*todos los campos privados para evitar lios*/
   private String nombre; /*Sring es cadena de texto*/
   private String email; 
   private boolean activo;
   private char genero; /*char es una letra*/

    public cliente(long id, String nombre, String email) {
        this.id = id; /*la palabra this para refererirnos al objeto pero puede 
        confundir con el parámetro. this al campo, sin this al valor
        */
        this.nombre = nombre;
        this.email = email;
        this.activo = true; /*no está añadido como opción*/
    }
    
    /*otra opcion
        public cliente(long nid, String nom, String em) {
        id = nd;
        nombre = nom;
        email = em;
        activo = true;
    }
    */
        
    public long getId() {/* Metodo que devuelve el id. Identico campo pero empezando por mayuscula. id -->Id*/
         return id;
                 }

    public String getNombre() {
        return nombre;
    } //String es el tipo de dato que devuelve

    public String getEmail() {
        return email;
    }

    public boolean isActivo() {
        return activo;
    } //los booleanos uasn is en lugar de get

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

        
    public void setEmail(String email) {
        this.email = email;
    } //void es lo que devuelve; en este caso vacío porque es setter
    

}

