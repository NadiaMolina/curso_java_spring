package com.sinensia.poo_avanzado;

public class Perezoso extends AnimalSalvaje implements Depredador, Mamifero{

    public Perezoso(String nombre, float tamanho) {
        super(2,true,false, nombre, tamanho);
    }

    @Override
    public void mover() {
        System.out.println(nombre + " no me gusta moverme porque soy perezoso");
    }

    @Override
    public void comer() {
        System.out.println(nombre + " no sé qué cómo");
    }

    @Override
    public void volar() {
        System.out.println(nombre + " no puedo volar");
    }

    @Override
    public void cazar(String presa) {
        System.out.println(nombre + " caza a las presas despistándolas " + presa);
    }

    @Override
    public void mamar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String mamar2(TortugaNinja mama) {
        String mensaje = " mama de ";
        
        System.out.println(nombre + mensaje + mama.getNombre());
        return mensaje;
    }

    @Override
    public String mamar3(Mamifero madre) {
        
       if (madre instanceof Animal){
            System.out.println(nombre + " mama de " +((Animal) madre).getNombre());
            System.out.println(nombre + " mama de " + madre.toString());
            System.out.println(nombre + " mama de " + madre.nombrar());
            
            return "";
        } else {
            return "";
        }
      
    }

    @Override
    public String toString() {
        return "Perezoso " + nombre; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String nombrar() {
        return nombre;
    }

    
  
}
