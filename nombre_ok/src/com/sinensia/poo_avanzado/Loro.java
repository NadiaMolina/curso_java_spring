package com.sinensia.poo_avanzado;

public class Loro extends Mascota {

    public Loro(String nombre, float tamanho) {
        super(2, true, false, nombre, tamanho);
    }
    
    
    @Override
    public void mover() {
        System.out.println(nombre + " me muevo a veces");
    }

    @Override
    public void comer() {
        System.out.println(nombre + " como lo que me pone mi dueño");
    }

    @Override
    public void volar() {
       System.out.println(nombre + " vuelo poco");
    }

    @Override
    public void saludarPropietario() {
        System.out.println(nombre + " pico para " + propietario.getNombre());
    }
    
}
