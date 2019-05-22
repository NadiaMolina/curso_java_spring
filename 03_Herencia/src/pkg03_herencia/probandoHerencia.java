
package pkg03_herencia;

public class probandoHerencia {
    
    
    public static void ProbandoHerencia(){
        ClienteInvitado invitado = new ClienteInvitado (0,"Juan", null);
        invitado.setDuracionMax(10);
        System.out.println("Cliente: " + invitado.getNombre()+ " Duracion: " + invitado.getDuracionMax());
    }
    
}
