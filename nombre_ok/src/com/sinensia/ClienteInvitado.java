package com.sinensia;

//para decir que una clase hereda de otra se usa extends
public class ClienteInvitado extends Cliente{
    
    /*nos da error y nos sugiere esto de abajo. al heredar de otra clase 
    necesita el constructor. necesitamos un constructor que llame del padre 
    con la palabra super.
    
    */
    public ClienteInvitado(long id, String nombre, String email) {
        super(id, nombre, email);
    }
    
    
   //añadir propiedad. boton derecho, insert code, add property
    
    private int duracionMax;

 
    public int getDuracionMax() {
        return duracionMax;
    }

     public void setDuracionMax(int duracionMax) {
        this.duracionMax = duracionMax;
    }
    //Sobreescritura del mostrar del padre (Cliente). los tipos hijos (independientemente de la forma del padre o hijo) se queda con el mostrar del hijo
    @Override
    public void mostrar() {
        System.out.println("MOSTRAR CLIENTE INVITADO ");
        System.out.println(". Cliente Invitado " + nombre);//aunque sea privado, al estar en la misma clase podemos acceder; pero el fichero principal no puede acceder
        System.out.println(". Id Invitado " + this.id);//se puede poner el this o no; es igual
        System.out.println(". Email Invitado " + this.getEmail());//getEmail es publico asi que puede acceder el fichero principal
        System.out.println(". Duracion Invitado " + this.getDuracionMax());
       // super.mostrar(); //llamamos al mostrar del padre. es una forma de ejecutar el metodo del padre
    }

}
