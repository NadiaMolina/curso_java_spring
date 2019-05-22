package com.sinensia.dao;

import java.util.HashMap;
import java.util.List;

public class GenericoDao<T> implements InterfazDAO {

    HashMap<Long, T> mapa;

    public GenericoDao() {
    }

    @Override
    public void poner(Object valor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Object leerUno(long id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List leerTodos() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void eliminar(Object valor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void eliminar(long id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void modificar(Object nuevoValor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
