package pkg02_colecciones;

//para decir que una clase hereda de otra se usa extends
public class ClienteInvitado extends cliente{
    
    /*nos da error y nos sugiere esto de abajo. al heredar de otra clase 
    necesita el constructor. necesitamos un constructor que llame del padre 
    con la palabra super.
    
    */
    public ClienteInvitado(long id, String nombre, String email) {
        super(id, nombre, email);
    }
    
    
   //añadir propiedad. boton derecho, insert code, add property
    
    private int duracionMax;

    /**
     * Get the value of duracionMax
     *
     * @return the value of duracionMax
     */
    public int getDuracionMax() {
        return duracionMax;
    }

    /**
     * Set the value of duracionMax
     *
     * @param duracionMax new value of duracionMax
     */
    public void setDuracionMax(int duracionMax) {
        this.duracionMax = duracionMax;
    }

}
