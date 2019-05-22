/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.modelo.dao;

import java.util.List;


public interface InterfazDAO<T> {
    
    T insertar(T valor);
    T obtenerUno(Integer id);
    List<T> obtenerTodos();
    void eliminar(T valor);
    void eliminar(Integer id);
    T modificar(/*long id,*/ T nuevoValor);
}