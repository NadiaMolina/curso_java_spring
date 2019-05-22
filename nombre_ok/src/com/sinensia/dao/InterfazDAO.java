package com.sinensia.dao;

import java.util.List;

public interface InterfazDAO<T> {

    void poner(T valor);

    T leerUno(long id);

    List<T> leerTodos();

    void eliminar(T valor);

    void eliminar(long id);

    void modificar(T nuevoValor);
}
