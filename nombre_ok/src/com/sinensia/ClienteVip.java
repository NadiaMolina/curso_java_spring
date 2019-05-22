package com.sinensia;

public class ClienteVip extends Cliente{
   private String beneficio;
   
   
    public ClienteVip(long id, String nombre, String email) {
        super(id, nombre, email);
    }
    
 

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

    @Override
    public void mostrar() {
        //super.mostrar(); //llama al método mostrar del padre
        System.out.println(". Beneficio VIP " + getBeneficio()); 
        System.out.println("ES VIP "); 
    }
}
