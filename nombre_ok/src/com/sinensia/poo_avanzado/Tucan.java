package com.sinensia.poo_avanzado;

public class Tucan extends AnimalSalvaje {
    
    public Tucan (String nombre, float tamanho){
        super(2, true, false, nombre, tamanho);//llamamos al constructor del padre   
    }
    
    //crea automáticamente la implementación de todos los métodos abstractos
    @Override
    public void mover() {
        System.out.println(nombre + " volando voy");
    }

    @Override
    public void comer() {
        System.out.println(nombre + " me gusta el alpiste");
    }

    @Override
    public void volar() {
        System.out.println(nombre + " aleteo todo el día");
    }



    
}
