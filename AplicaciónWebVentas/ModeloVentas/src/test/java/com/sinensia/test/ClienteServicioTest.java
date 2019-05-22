package com.sinensia.test;

import com.sinensia.modelo.Cliente;
import com.sinensia.modelo.logica.ServicioClientes;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nadia
 */
public class ClienteServicioTest {

    private static ServicioClientes servCli;

    @BeforeClass
    public static void setUpClass() {
        servCli = new ServicioClientes();
    }

    @Test
    public void ClienteOk1() {
        assertNotNull(servCli.insertar("Ok", "email@ok.com", "ok12", "30", "on"));
        assertEquals( servCli.obtenerUno("email@ok.com").getNombre(), "Ok");
        servCli.eliminar("email@ok.com");
        assertNull(servCli.obtenerUno("email@ok.com"));
    }
    
    @Test
    public void ClienteOk2() {
        servCli.insertar("Cliente Ok", "emailx@ok.com", "ok12", "30", "on");
        servCli.insertar("Cliente Ok", "emailx2@ok.com", "ok12", "30", "on");
        assertEquals(servCli.obtenerUno("emailx@ok.com").getEdad(), "30");
        assertTrue(servCli.obtenerUno("emailx2@ok.com").getActivo()==1);
        servCli.eliminar("emailx@ok.com");
        servCli.eliminar("emailx2@ok.com");
        assertNull(servCli.obtenerUno("emailx@ok.com"));
        assertNull(servCli.obtenerUno("emailx2@ok.com"));
    }
 @Test
    public void clienteMal_Nombre() {
        servCli.insertar("", "clienteMal_1@ok.com", "ok12", "30", "on");
         assertNull(servCli.obtenerUno("clienteMal_1@ok.com"));
    }
    @Test
    public void clienteMal_OtrosCampos() {
        servCli.insertar("Nombre bien", "", "ok12", "30", "on");
        assertNull(servCli.obtenerUno(""));
        servCli.insertar("Bien", "clien@ok.com", "", "30", "on");
        servCli.insertar("Ok", "client_2@ok.com", "ok12", "0", "on");
        servCli.insertar("Ok", "client_3@ok.com", "ok12", "NoNUM", "on");
        assertNull(servCli.obtenerUno("clien@ok.com"));
        assertNull(servCli.obtenerUno("client_2@ok.com"));
        assertNotNull(servCli.obtenerUno("client_3@ok.com"));
    }
    @Test
    public void cliente_modificar () {
        servCli.insertar("Nombre bien", "clientek@ok.com", "ok12", "30", "on");
        Cliente cliente = servCli.obtenerUno("clientek@ok.com");
        servCli.modificar(cliente.getId(),"Cli", "clientek@ok.com", "NuevaPSWD", "30", "on");
        cliente = servCli.obtenerUno("clientek@ok.com");
        assertEquals(cliente.getPassword(),"NuevaPSWD" );
    }
    
    @Test
     public void cliente_modificarMal () {
        assertNotNull( servCli.insertar("Nombre bien", "clientek@ok.com", "ok12", "30", "on"));
        Cliente cliente = servCli.obtenerUno("clientek@ok.com");
        assertNotNull(servCli.modificar(cliente.getId(),"Cli", "clientek@ok.com", "NuevaPSWD", "30", "on"));
        cliente = servCli.obtenerUno("clientek@ok.com");
        assertEquals(cliente.getEdad(),30);
        servCli.eliminar("clientek@ok.com");
        assertNull(servCli.obtenerUno("clientek@ok.com"));
    }
    
    
    
  
}
