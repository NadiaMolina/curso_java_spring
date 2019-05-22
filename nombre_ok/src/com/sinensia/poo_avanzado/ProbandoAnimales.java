package com.sinensia.poo_avanzado;

import com.sinensia.Cliente;

public class ProbandoAnimales {
    
    public static void probarClasesAbstractas(){
        
        Cliente yo =  new Cliente(0,"yo",null);
      
        
        Tucan unTucan = new Tucan("Turigualpa",15.8f); //se puede hacer new porque Tucan es clase concreta
        unTucan.mover(); //se queda con el método mover del hijo (Tucan) y no del padre (Animal)
        unTucan.comer();
        unTucan.volar();
        System.out.println("");

              
        
        Loro miPajaro = new Loro("Lorito",2.8f);
        miPajaro.setPropietario(yo);
        miPajaro.mover();
        miPajaro.comer();
        miPajaro.volar();
        miPajaro.saludarPropietario();
        miPajaro.pedirComida();
        System.out.println("");
        
        
        Animal miDragon = new Dragon(2,"Limon",100f);//conversión implícita. miDragon es de tipo Dragon con forma de Animal
        //conversion explícita a forma Mascota para acceder al método setPropietario; saludar y pedir
        Mascota miDragon2 = (Mascota) miDragon; 
        Dragon miDragon3 = (Dragon) miDragon;
        
        miDragon2.setPropietario(yo);
        
        miDragon.mover();
        miDragon.comer();
        miDragon.volar();
        miDragon2.saludarPropietario();
        ((Mascota) miDragon).pedirComida();//es lo mismo hacerlo así directamente que guardarlo en la otra variable miDragon2
        miDragon3.cazar("rajoy");  
        System.out.println("");
    
        
        //Mascota miMascota = new Mascota(0,true,true,"",0); da error porque una clase abstracta no puede ser instanciada    
        TortugaNinja michelangelo = new TortugaNinja("Michelangelo",175.5f);
        
        Perezoso sid = new Perezoso("Sid",10.4f);
                
                
                
        michelangelo.mover();
        michelangelo.comer();
        
        
        try {
            michelangelo.volar(); //si no lo meto en un try da errror de excepción y se detendrá el programa
        } 
        /*catch (Exception ex){ //el catch captura el error
            ex.printStackTrace(); //te devuelve el error pero continúa el programa
            System.err.println(ex.getMessage());
        }*/
        catch (UnsupportedOperationException ex){ //el catch puede capturar un error concreto
            System.err.println(ex.getMessage());
        } catch (StringIndexOutOfBoundsException ex){
            System.err.println(" Error en el String" + ex.getMessage());
        }catch (Exception ex){
            System.err.println(" Error general" + ex.getMessage());
        } finally{ //siempre se ejecuta; aunque no haya ninguna excepción
            System.out.println("Siempre me ejecuto. Cerremos recursos");
        }
       


           
        
        michelangelo.mamar();
        //michelangelo.mamar2(michelangelo);
        michelangelo.mamar3(sid);
        
        
         

        sid.mover();
        sid.comer();
        sid.volar();
        sid.cazar("oruga");
        //sid.mamar2(michelangelo);
        sid.mamar3(michelangelo);

    }
    
}
