package com.sinensia.genericos;

import java.util.ArrayList;
import java.util.Date;

public class ProbandoGenericos {

    public static void probarMetodo() {
        int num = 10;
        Integer objNum = new Integer(10);
        String texto = "" + String.valueOf(num);
        String texto2 = "" + objNum.toString();
        int otroNum = num;
        num = 20;
        System.out.println("otroNum = " + otroNum);
        Integer otroObjNum = objNum;
        otroObjNum = 20;
        System.out.println("otroObjNum = " + otroObjNum);
        ArrayList<Integer> listaInt = new ArrayList();
        insertarDoble(listaInt, 10);
        insertarDoble(listaInt, 15);
        System.out.println("Enteros: " + listaInt.toString());
        ArrayList<String> listaStr = new ArrayList();
        insertarDobleGenerico(listaStr, "texto1");
        insertarDobleGenerico(listaStr, "texto2");
        System.out.println("Cadenas: " + listaStr.toString());
        ArrayList<Date> listaDate = new ArrayList();
        insertarDobleGenerico(listaDate, new Date(82, 4, 12));
        insertarDobleGenerico(listaDate, new Date(84, 9, 20));
        System.out.println("Fechas: " + listaDate.toString());
    }

    public static void insertarDoble(ArrayList<Integer> lista, int valor) {
        lista.add(valor);
        lista.add(valor);
    }

    public static void insertarDoble(ArrayList<String> lista, String valor) {
        lista.add(valor);
        lista.add(valor);
    }

    public static <Clase> void insertarDobleGenerico(ArrayList<Clase> lista, Clase valor) {
        lista.add(valor);
        lista.add(valor);
    }
}
