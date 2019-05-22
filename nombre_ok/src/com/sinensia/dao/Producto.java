package com.sinensia.dao;

public class Producto {

    private long id;

    private String nombre;

    private double precio;

    private int stock;

    public Producto(long id, String nombre, double precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
}
