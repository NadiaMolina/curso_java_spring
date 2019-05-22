/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.pruebas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.Scanner;

/**
 *
 * @author nadia
 */
public class Ficheros2 {

    public static void probandoEscritura2() throws UnsupportedEncodingException {
        String[] lineasTexto = {
            "Linea primera",
            "línea segunda", 
            "línea tercera"};
        
        Writer out = null;

        try {
            FileOutputStream streamFich;
            streamFich = new FileOutputStream("fich_2.txt"); //instancia del objeto
            OutputStreamWriter streamWriter;
            streamWriter = new OutputStreamWriter(streamFich, "UTF-8");
            out = new BufferedWriter(streamWriter);
            for (String linea : lineasTexto) {
                try {
                    out.write(linea + "/r/n");
                } catch (IOException ex) {
                    System.err.println("Error al escribir fich:" + ex.getMessage());
                }
            }
        } catch (UnsupportedOperationException | FileNotFoundException ex2) {
            System.err.println("Error 2: " + ex2.getMessage());

        } finally {
            try {
                out.close();
                System.out.println("Fichero cerrado");
            } catch (IOException ex3) {
                System.err.println("Error en cierre fich: " + ex3.getMessage());
            }
        }
    }

    public static void lecturafich() {
        File fichRutaRelativa = new File("fichero_texto.txt");
        Scanner escaner = null;
        try {
            System.out.println("Leyendo fich ");
            escaner = new Scanner(fichRutaRelativa);
            while (escaner.hasNextLine()) {
                String linea = escaner.nextLine();
                System.out.println(">>>> \"" + linea + "\"");
                if (linea.compareTo("línea segunda") < 0) {
                    System.out.println("      es menor");
                } else if (linea.compareTo("línea segunda") > 0) {
                    System.out.println("    es mayor");
                } else {
                    System.out.println("    son iguales");
                }
            }
        } catch (Exception ex) {
            System.out.println("Mensaje: " + ex.getMessage());
        } finally {
            try {
                if (escaner != null) {
                    escaner.close();

                }
            } catch (Exception ex) {
                System.out.println("Mensaje al cerrar: " + ex.getMessage());

            }
        }
    }
}
