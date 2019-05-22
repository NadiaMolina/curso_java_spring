package com.sinensia.poo_avanzado;


public class Dragon extends Mascota implements Depredador{ //implementa la interfaz Depredador

    public Dragon(int patas,String nombre, float tamanho) {
        super(patas,true,true, nombre, tamanho);
    }

    @Override
    public void mover() {
        System.out.println(nombre + " con grandes pasos");
    }

    @Override
    public void volar() {
        System.out.println(nombre + " vuela bajo");
    }

    @Override
    public void comer() {
        System.out.println(nombre + " te va a comer");
    }

    @Override
    public void saludarPropietario() {
        System.out.println(nombre + " una llamarada para " + propietario.getNombre());
    }

    @Override
    public void cazar(String presa) {
        System.out.println(nombre + "quema, vuela y caza a " + presa);
    }
    
}
