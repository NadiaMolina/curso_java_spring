package com.sinensia.poo_avanzado;


public class TortugaNinja extends Mascota implements Mamifero{

    public TortugaNinja(String nombre, float tamanho) {
        super(4, true, true, nombre, tamanho);
    }

    @Override
    public void mover() {
        System.out.println(nombre + " salto mortal de edificio");
    }

    @Override
    public void comer() {
        System.out.println(nombre + " como más de lo que crees");
    }

    @Override //probando para que pare el programa porque no puede volar la tortuga. otra opción sería dejarlo vacío
    public void volar() {
       throw new UnsupportedOperationException("No puede volar"); //No puede volar
    }

    @Override
    public void saludarPropietario() {
        System.out.println(nombre + " hola papá");
    }

    @Override
    public void mamar() {
        System.out.println(nombre + " mamaba de pequeño");
    }

    @Override
    public String mamar2(TortugaNinja mama) {
        String mensaje = " mama de ";
        
        System.out.println(nombre + mensaje + mama.getNombre());
        return mensaje;
    }

    @Override
    public String mamar3(Mamifero madre) {
       System.out.println(nombre + " mama de " +((Animal) madre).getNombre());
       System.out.println(nombre + " mama de " + madre.toString());
       System.out.println(nombre + " mama de " + madre.nombrar());
       return "";
        
    }
    
    
    @Override
    public String toString() {
        return "Tortuga " + nombre; 
    }

    @Override
    public String nombrar() {
        return nombre;
    }




 
    
}
