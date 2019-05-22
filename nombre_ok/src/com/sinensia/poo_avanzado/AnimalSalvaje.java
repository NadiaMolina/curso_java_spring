package com.sinensia.poo_avanzado;

public abstract class AnimalSalvaje extends Animal {

    
    public AnimalSalvaje(String nombre, float tamanho) {
        super(nombre, tamanho);
    }
    
    public AnimalSalvaje(int patas, boolean aerobico, boolean acuatico, String nombre, float tamanho) {
        super(patas, aerobico, acuatico, nombre, tamanho);
    }
    
    
}
