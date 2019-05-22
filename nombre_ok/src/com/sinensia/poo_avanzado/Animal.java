
package com.sinensia.poo_avanzado;

import com.sinensia.Cliente;


public abstract class Animal {
    protected int patas;
    protected boolean aerobico; //que respira con pulmones
    protected boolean acuatico;
    protected String nombre;
    protected float tamanho;
    
    //constructor con solo dos campos
    public Animal(String nombre, float tamanho) {
        this.nombre = nombre;
        this.tamanho = tamanho;
        this.aerobico = false; //redundante pero es conveniente
        this.acuatico = false; //redundante pero es conveniente
        this.patas = 0; //redundante pero es conveniente
    } //no podemos instanciarlo porque la clase es abstracta; pero sus hijas sí pueden usarlo
    
    
    //constructor con todos los campos
    public Animal(int patas, boolean aerobico, boolean acuatico, String nombre, float tamanho) {
        this.patas = patas;
        this.aerobico = aerobico;
        this.acuatico = acuatico;
        this.nombre = nombre;
        this.tamanho = tamanho;
    } 

    public abstract void mover(); //pero no sabemos cómo se va a mover; no podemos programarlo, así que usamos un método abstracto
    //al tener un método abstracto, la clase tiene que ser obligatoriamente abstracta
   
    public abstract void volar();
    
    public abstract void comer();
    
  
    
    

    
    
    public boolean isAnfibio() {
        return aerobico && acuatico;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public boolean isAerobico() {
        return aerobico;
    }

    public void setAerobico(boolean aerobico) {
        this.aerobico = aerobico;
    }

    public boolean isAcuatico() {
        return acuatico;
    }

    public void setAcuatico(boolean acuatico) {
        this.acuatico = acuatico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getTamanho() {
        return tamanho;
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }

    void setPropietario(Cliente yo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
