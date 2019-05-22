package pkg02_colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PruebasColecciones {
    
      public static void ejemploHashMap (){
      HashMap<String,cliente> diccClientes;/*los hashmap funciona por clave y valor
      en este caso la clave es String*/
      
      diccClientes = new HashMap<String,cliente>();
      
      cliente ana = new cliente(1,"Ana",null);
      cliente luis = new cliente(2,"Luis",null);
      cliente bea = new cliente(3,"Bea",null);
      
     diccClientes.put("a1", ana);
     diccClientes.put("b2", luis);
     diccClientes.put("c3", bea); //podemos acceder a los elementos mediante su clave
     
      System.out.println("Bea? " + diccClientes.get("c3").getNombre());
      /*los busca por clave no por posicion*/
      
           
      if (!diccClientes.containsKey("c3")){
           diccClientes.put("c3", new cliente(4, "Pedro",null));
      }
      
      System.out.println("Bea? " + diccClientes.get("c3").getNombre());
     
      diccClientes.put("c3", new cliente(4, "Pedro",null)); //perdemos el valor por error
      
      System.out.println("Bea? " + diccClientes.get("c3").getNombre());
      
     //cómo recorrer en un hashmap; pero no tenemos un índice, solo claves
     //los elementos son un parclavevalor
     
     for (Map.Entry<String,cliente> parClaveValor : diccClientes.entrySet()){
      
      System.out.println("Clave del cliente " + parClaveValor.getKey());
      cliente Cliente = parClaveValor.getValue();
      System.out.println("Nombre del cliente " + Cliente.getNombre());
      
  }
      
      
  }
    public static void ejemploListas() {
 
        ArrayList<cliente> listaClientes; /*array es un tipo de objeto, que
        está formado por distintos elementos. funciona por indice y valor*/
        listaClientes = new ArrayList<cliente>();
                
        listaClientes.add(new cliente(1, "Ana", "ana@gmail.com"));
        listaClientes.add(new cliente(2, "Luis", "luis@gmail.com"));
        listaClientes.add(new cliente(3, "Bea", null));
        
        
        for (int i = 0; i<listaClientes.size(); i++){
            System.out.println("Cliente " + listaClientes.get(i).getId()
                    + ": " + listaClientes.get(i).getNombre());      
        }
        
        listaClientes.remove(1);//elimina el elemento 1
        
        cliente bea = listaClientes.get(1); //porque se ha borrado es el nuevo 1. listaClientes solo tiene 2 elementos
        bea.setEmail("bea@gmail.com");
        
       //bucle que recorre la lista
        for (int i = 0; i<listaClientes.size(); i++){
            System.out.println("Cliente " + listaClientes.get(i).getId()
                    + ": " + listaClientes.get(i).getNombre() + ", "
                    + listaClientes.get(i).getEmail());      
        }
        
        //equivalente creando una variable intermedia
         for (int i = 0; i<listaClientes.size(); i++){
           cliente Cliente =  listaClientes.get(i);
           System.out.println("Cliente " + listaClientes.get(i).getId()
                    + ": " + Cliente.getNombre() + ", "
                    + Cliente.getEmail());      
        }
        
        //veamos cómo hacerlo de otra forma
        for (cliente Cliente: listaClientes){
            System.out.println("Cliente: " +  Cliente.getNombre());    
        }
        
    }
}
