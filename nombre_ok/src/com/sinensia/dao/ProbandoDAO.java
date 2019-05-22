package com.sinensia.dao;

import com.sinensia.Cliente;
import com.sinensia.ClienteInvitado;
import java.util.List;

public class ProbandoDAO {

    public static void probarCliente() {
        ClienteDAO repoCli = new ClienteDAO();
        repoCli.poner(new Cliente(1, " Ana ", "ana@gmail.com"));
        repoCli.poner(new ClienteInvitado(2, " Juan ", "juan@gmail.com"));
        repoCli.poner(new ClienteInvitado(3, "Bea ", "bea@gmail.com"));
        System.out.println("Juan: " + repoCli.leerUno(2).toString());
        System.out.println(repoCli.leerUno(1));
        repoCli.modificar(new ClienteInvitado(2, "Juan Bonilla", "jedjf@dkfdjf"));
        Cliente cli = repoCli.leerUno(2);
        System.out.println("Cliente modificado  " + cli.toString());
        repoCli.eliminar(1);
        List<Cliente> lista = repoCli.leerTodos();
        for (Cliente cliente : lista) {
            System.out.println("Cliente  " + cliente.toString());
        }
    }
}
