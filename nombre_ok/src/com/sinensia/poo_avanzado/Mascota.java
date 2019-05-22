package com.sinensia.poo_avanzado;

import com.sinensia.Cliente;

public abstract class Mascota extends Animal { //las mascotas tambien son clase abstracta; son un tipo de animal pero general
    
    protected Cliente propietario; //las mascotas también se caracterizan por tener propietarios
    
    public Mascota(int patas, boolean aerobico, boolean acuatico, String nombre, float tamanho) {
        super(patas, aerobico, acuatico, nombre, tamanho);
    }

    public void pedirComida(){ //metodo concreto porque es lo mismo en todas las mascotas
        System.out.println("ALIMENTAME !!");
    }
    
    public abstract void saludarPropietario(); //abstracta porque cada mascota saluda al propietario de una forma
   
    
    public Cliente getPropietario() {
        return propietario;
    }

    public void setPropietario(Cliente propietario) {
        this.propietario = propietario;
    }
    
    
    
    
}
