/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.pruebas;

import com.sinensia.ClienteInvitado;
import com.sinensia.Cliente;
import com.sinensia.ClienteVip;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Polimorfismo {
    
    public static ArrayList<Cliente> listaClientes; //hace a la variable "global" a todo el documento
  
    public static void polimorfeando(){
        //en Clase ClienteInvitado existe el método setDuracion
        ClienteInvitado invitado = new ClienteInvitado (10,"", null); //siempre es cliente invitado; pero podemos cambiarle la forma
        invitado.setDuracionMax(10);
        invitado.mostrar();
        //  System.out.println("Cliente: " + invitado.getNombre()+ " Duracion: " + invitado.getDuracionMax());
        //en la forma Cliente no existe el método duración, solo getNombre y getEmail
         Cliente clienteNormal = invitado; //clienteNormal es de tipo ClienteInvitado con la forma de Cliente
         //conversión implicita del Hijo (ClienteInvitado) al Padre (Cliente)
         //System.out.println("Nombre: " + clienteNormal.getNombre());
         //System.out.println("Duracion: " + invitado.getDuracionMax());
         
         clienteNormal.mostrar(); //sale el mostrar del hijo (invitado) tenga la forma del padre o del hijo; porque está sobreescrito.
         
         
         //un objeto hijo puede tener la forma del padre
         //un padre (Cliente) no puede tener la del hijo (ClienteInvitado)
         // ClienteInvitado elMismoInv = clienteNormal; da error porque no puedes cambiar la forma del Padre (Cliente) al Hijo (ClienteInvitado)
         //Para hacer conversión explícita necesitas usar el cast
         ClienteInvitado elMismoInv = (ClienteInvitado) clienteNormal; //hacer el cast: cambiando la forma de clienteNormal a la forma de ClienteInvitado
         //System.out.println("Nombre del MismoInv: " + elMismoInv.getNombre());
         //System.out.println("Duracion del MismoInv: " + elMismoInv.getDuracionMax());
          
          Cliente normal = new Cliente (0,"Tu", null);
          normal.mostrar(); 
          //provoca una excepción de error de casting
          //ClienteInvitado clienteInvitado = normal; //de tipo Cliente con la forma de ClienteInvitado. error, el padre no puede adquirir la forma del hijo
         // ClienteInvitado otroInv = (ClienteInvitado) normal;  lo mismo no puedes hacer cast de padre(tipo Cliente) a hijo (tipo ClienteInvitado)

          
          ClienteVip vip =new ClienteVip(1,"yo", null);
          vip.mostrar();
   
    }
     
    public static void arrayclientes(){
       listaClientes = new ArrayList<Cliente>();
           
       Cliente ananormal = new Cliente(1,"Normal Ana","ana@gmail.com");
       ClienteInvitado luisinvitado = new ClienteInvitado(2,"Invitado Luis","luis@gmail.com");
       ClienteVip beavip = new ClienteVip(3,"Vip Bea",null);
           
       listaClientes.add(ananormal);
       listaClientes.add(luisinvitado);
       listaClientes.add(beavip);
       
       beavip.setBeneficio("positivo");
       //ananormal.mostrar();
       //luisinvitado.mostrar();
       //beavip.mostrar();
      System.out.println("RESPUESTA DEL LIST ");
       for (int i = 0; i<listaClientes.size(); i++){
             listaClientes.get(i).mostrar();          
        }
       
        System.out.println("IGUAL CREANDO UNA VARIABLE INTERMEDIA ");
        for (int i = 0; i<listaClientes.size(); i++){
            Cliente listaCliente = listaClientes.get(i);
             listaCliente.mostrar();          
        }
    
       //de la otra forma que vimos que es equivalente a ir elemento a elemento
      System.out.println("IGUAL DE OTRA FORMA");
       for (Cliente listaCliente : listaClientes){
           listaCliente.mostrar();
       }
       
      
       //modificamos elmentos
       Cliente clienteAna = listaClientes.get(0);
       clienteAna.setEmail("ananuevo@gmail.com");
       System.out.println(clienteAna.getEmail());    
       
       ClienteInvitado clienteinvLuis = (ClienteInvitado) listaClientes.get(1);
       clienteinvLuis.setDuracionMax(4);
       System.out.println(clienteinvLuis.getDuracionMax());
       
       ClienteVip clientevipBea = (ClienteVip) listaClientes.get(2);
       clientevipBea.setBeneficio("mucho");
       System.out.println(clientevipBea.getBeneficio());
       
    System.out.println("prueba"+ listaClientes.get(1));   
    }
    
    public static void hashmapclientes(){

       
       HashMap<String,Cliente> mapaClientes;
       mapaClientes = new HashMap<String,Cliente>();
           
       /*Cliente ananormal = new Cliente(1,"Normal Ana","ana@gmail.com");
       ClienteInvitado luisinvitado = new ClienteInvitado(2,"Invitado Luis","luis@gmail.com");
       ClienteVip beavip = new ClienteVip(3,"Vip Bea",null);
      
       mapaClientes.put("normal " + "-" + ananormal.getId(),ananormal);
       mapaClientes.put("invitado " + "-" + luisinvitado.getId(),luisinvitado);
       mapaClientes.put("vip" + "-" + beavip.getId(),beavip);*/
       
       //otra manera de poner los clientes en hashmaps; pero dento del mismo método porque no tiene guardada la lista del método arrayclientes.
       //se podría añadir el listaClientes como variable estáticas --> variables accesibles a toda la aplicación
       //System.out.println("RESPUESTA DEL HASHMAP ");
       
        System.out.println("prueba aqui"+ listaClientes.get(1));
        
        for (Cliente cli : listaClientes){
           mapaClientes.put(cli.getNombre(), cli);
        }
        
        
               
          
       
       
      //  ananormal.mostrar();
      // luisinvitado.mostrar();
      // beavip.mostrar();
      
      
      System.out.println("RESPUESTA DEL HASHMAP ");
      for (Map.Entry<String,Cliente> entradaClientes : mapaClientes.entrySet()){
        Cliente valor  = entradaClientes.getValue();
        valor.mostrar();
        String clave = entradaClientes.getKey();
        System.out.println("Clave "+ clave);
      }
      
      //Modifiquemos elementos del mapa
      Cliente clienteAna = mapaClientes.get("Normal Ana");
      clienteAna.setEmail("ananuevo@gmail.com");
      System.out.println(clienteAna.getEmail());
      
      ClienteInvitado clienteinvLuis = (ClienteInvitado) mapaClientes.get("Invitado Luis"); //me pide hacer un cast porque mapaClientes tiene la forma de Cliente
      //y necesito cambiar a forma de invitado SIEMPRE Y CUANDO SEPAMOS QUE ES DE TIPO CLIENTE INVITADO
      clienteinvLuis.setDuracionMax(clienteinvLuis.getDuracionMax());
      System.out.println(clienteinvLuis.getDuracionMax()+10);
      
      ClienteVip clientevipBea = (ClienteVip) mapaClientes.get("Vip Bea");
      clientevipBea.setBeneficio("CERO");
      System.out.println(clientevipBea.getBeneficio());
      
      System.out.println("viendo la modificacion del bucle");
      
      for (Map.Entry<String,Cliente> entradaClientes : mapaClientes.entrySet()){ //no los recorre en orden!
        Cliente valor  = entradaClientes.getValue();
           
        if (valor instanceof ClienteInvitado){ //instancia es objeto de una clase. si valor es objecto de clase ClienteInvitado
            ClienteInvitado cliInv = (ClienteInvitado) valor;
            cliInv.setDuracionMax(cliInv.getDuracionMax() + 900000000);
            cliInv.mostrar();
        } else if (valor instanceof ClienteVip){
            ClienteVip cliVip = (ClienteVip) valor;
            cliVip.setBeneficio(cliVip.getBeneficio() + " nada de nadaaaaaaaaaaaaaa");
            cliVip.mostrar();
        } else {
            valor.mostrar();
        }
         
      }
           
    

     
    
      
    
        
        
    

    }
    
}