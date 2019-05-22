/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.pruebas;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;




/**
 *
 * @author nadia
 */
public class Ficheros {

    public static void probandoEscritura() {
        String[] lineasTexto = {"Linea primera", "línea segunda", "línea tercera"};

        FileWriter fichero = null;
        try {
            fichero = new FileWriter("fichero_texto.txt"/*, false */);
            for (String linea : lineasTexto) {
                fichero.write(linea + "\n");
            }
            //fichero.close();
        } catch (Exception ex) {
            System.err.println("Mensaje error: " + ex.getMessage());
        }finally {
            try {
                fichero.close();
            } catch (IOException ex) {
                Logger.getLogger(Ficheros.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
