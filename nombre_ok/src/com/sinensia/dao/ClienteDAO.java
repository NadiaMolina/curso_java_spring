package com.sinensia.dao;

import com.sinensia.Cliente;
import com.sinensia.ClienteInvitado;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClienteDAO implements InterfazDAO {

    HashMap<Long, Cliente> mapa;

    public ClienteDAO() {
        mapa = new HashMap();
    }

    public void poner(Cliente cli) {
        if (cli == null) {
            System.err.println("No se pueden añadir nulos");
        } else {
            mapa.put(cli.getId(), cli);
        }
    }

    @Override
    public Cliente leerUno(long id) {
        if (mapa.containsKey(id)) {
            return mapa.get(id);
        } else {
            System.err.println("Clave/ID no encontrada " + id);
            return null;
        }
    }

    public void eliminar(Cliente valor) {
        mapa.remove(valor.getId());
    }

    @Override
    public void eliminar(long id) {
        mapa.remove(id);
    }

    @Override
    public List<Cliente> leerTodos() {
        ArrayList<Cliente> lista;
        lista = new ArrayList<Cliente>();
        for (Map.Entry<Long, Cliente> ent : mapa.entrySet()) {
            lista.add(ent.getValue());
        }
        return lista;
    }

    public void modificar(Cliente nuevoValor) {
        Cliente clienteModificado = mapa.get(nuevoValor.getId());
        String valorNombre = nuevoValor.getNombre();
        clienteModificado.setNombre(valorNombre);
        String valorEmail = nuevoValor.getEmail();
        clienteModificado.setEmail(valorEmail);
    }

    @Override
    public void poner(Object valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Object valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificar(Object nuevoValor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
