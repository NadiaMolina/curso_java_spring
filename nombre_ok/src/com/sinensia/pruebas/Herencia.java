
package com.sinensia.pruebas;

import com.sinensia.ClienteInvitado;
import com.sinensia.ClienteInvitado;

public class Herencia {
    
    
    public static void ProbandoHerencia(){
        ClienteInvitado invitado = new ClienteInvitado (0,"Juan", null);
        invitado.setDuracionMax(10);
        System.out.println("Cliente: " + invitado.getNombre()+ " Duracion: " + invitado.getDuracionMax());
    }
    
}
