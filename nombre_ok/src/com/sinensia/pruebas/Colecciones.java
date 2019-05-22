package com.sinensia.pruebas;

import com.sinensia.Cliente;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class Colecciones {
    
    public static void ejemploHashMap (){
      HashMap<String,Cliente> diccClientes;/*los hashmap funciona por clave y valor
      en este caso la clave es String*/
      
      diccClientes = new HashMap<String,Cliente>();
      
      Cliente ana = new Cliente(1,"Ana",null);
      Cliente luis = new Cliente(2,"Luis",null);
      Cliente bea = new Cliente(3,"Bea",null);
      
     diccClientes.put("a1", ana);
     diccClientes.put("b2", luis);
     diccClientes.put("c3", bea); //podemos acceder a los elementos mediante su clave
     
      System.out.println("Bea? " + diccClientes.get("c3").getNombre());
      /*los busca por clave no por posicion*/
      
           
      if (!diccClientes.containsKey("c3")){
           diccClientes.put("c3", new Cliente(4, "Pedro",null));
      }
      
      System.out.println("Bea? " + diccClientes.get("c3").getNombre());
     
      diccClientes.put("c3", new Cliente(4, "Pedro",null)); //perdemos el valor por error
      
      System.out.println("Bea? " + diccClientes.get("c3").getNombre());
      
     //cómo recorrer en un hashmap; pero no tenemos un índice, solo claves
     //los elementos son un parclavevalor
     
     for (Map.Entry<String,Cliente> parClaveValor : diccClientes.entrySet()){
      
      System.out.println("Clave del cliente " + parClaveValor.getKey());
      Cliente Clientevalue = parClaveValor.getValue();
      System.out.println("Nombre del cliente " + Clientevalue.getNombre());
      
  }
      
      
  }
    public static void ejemploListas() {
 
        ArrayList<Cliente> listaClientes; /*array es un tipo de objeto, que
        está formado por distintos elementos. funciona por indice y valor*/
        listaClientes = new ArrayList<Cliente>();
                
       Cliente ana = new Cliente(1,"Ana","ana@gmail.com");
       Cliente luis = new Cliente(2,"Luis","luis@gmail.com");
       Cliente bea1 = new Cliente(3,"Bea",null);
        
        listaClientes.add(ana);
        listaClientes.add(luis);
        listaClientes.add(bea1);
        listaClientes.add(bea1);//las listas permiten duplicar elementos
    
        
        
        for (int i = 0; i<listaClientes.size(); i++){
            System.out.println("Cliente " + listaClientes.get(i).getId()
                    + ": " + listaClientes.get(i).getNombre());      
        }
        
        listaClientes.remove(1);//elimina el elemento 1
        
        Cliente bea = listaClientes.get(1); //porque se ha borrado es el nuevo 1. listaClientes solo tiene 2 elementos
        bea.setEmail("bea@gmail.com");
        System.out.println("prueba " + listaClientes.get(1).getEmail());
                
                
       //bucle que recorre la lista
        for (int i = 0; i<listaClientes.size(); i++){
            System.out.println("Cliente " + listaClientes.get(i).getId()
                    + ": " + listaClientes.get(i).getNombre() + ", "
                    + listaClientes.get(i).getEmail());      
        }
        
        //equivalente creando una variable intermedia
         for (int i = 0; i<listaClientes.size(); i++){
           Cliente Cliente =  listaClientes.get(i);
           System.out.println("Cliente " + listaClientes.get(i).getId()
                    + ": " + Cliente.getNombre() + ", "
                    + Cliente.getEmail());      
        }
        
        //veamos cómo hacerlo de otra forma
        for (Cliente Cliente: listaClientes){
            System.out.println("Cliente: " +  Cliente.getNombre());    
        }
        
    }
    
    public static void ejemploSet(){
        //Conjunto de elementos unicos
        HashSet <Cliente> conjuntoClientes = new HashSet();
        conjuntoClientes.add(new Cliente(1,"juan",null));
        conjuntoClientes.add(new Cliente(2,"ana",null));
        Cliente clientePepe = new Cliente(3,"pepe", null);
        conjuntoClientes.add(clientePepe);
        conjuntoClientes.add(clientePepe);//no se duplican elementos y no garantiza el orden. el SortedSet sí ordena los elementos
        
        for (Cliente cli:conjuntoClientes){
            cli.mostrar();
        }
        
        
       
        /*
        //otra manera de recorrer el conjunto
        
        //patrón de diseño iterator
        
        Iterator<Cliente> iter = conjuntoClientes.iterator();
        while (iter.hasNext()){
           Cliente cli = iter.next();
           cli.mostrar();
        }
*/
        
    }
}
