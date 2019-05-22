package pkg02_colecciones;

public class ClienteVip extends cliente{

    public ClienteVip(long id, String nombre, String email) {
        super(id, nombre, email);
    }
    
    private String beneficio;

    /**
     * Get the value of beneficio
     *
     * @return the value of beneficio
     */
    public String getBeneficio() {
        return beneficio;
    }

    /**
     * Set the value of beneficio
     *
     * @param beneficio new value of beneficio
     */
    public void setBeneficio(String beneficio) {
        this.beneficio = beneficio;
    }

    
}
