package com.sinensia.pruebas;

public class TratamientoDeCadenas {

    public static void pruebaString() {
        String quijote = "En un lugar de la Mancha...";
        if (quijote.contains("Mancha")) {
            System.out.println("Contiene Mancha");
        }
        if (quijote.contains("manCHa")) {
            System.out.println("Contiene manCHa");
        } else {
            System.out.println("No contiene manCHa");
        }

        if (quijote.toLowerCase().contains("manCHa".toLowerCase())) {
            System.out.println("Contiene manCHa -  Versión minúsculas");
        } else {
            System.out.println("No contiene manCHa");
        }

        if (quijote.startsWith("En un lugar ")) {
            System.out.println("Comienza con 'En un lugar'");
        }
        if (quijote.endsWith("la Mancha ")) {
            System.out.println("Termina con 'la Mancha...'");
        }

        System.out.println("charAt (6) = " + quijote.charAt(6));

        System.out.println(String.format("El texto ' %s' tiene '%d' caracteres ", quijote, quijote.length()));

        System.out.println("Mancha está en la posición  " + quijote.indexOf("Mancha"));
        if (!quijote.isEmpty()) {
            System.out.println("Quijote no está vacía ");
        }

        System.out.println("La última 'a' está en " + quijote.lastIndexOf('a')); //tipo Char   

        System.out.println("Trozo cadena " + quijote.substring(6, 14));

        String palabras[] = quijote.split(" ");
        for (String palabra : palabras) {
            System.out.println("  Palabra; " + palabra);
        }
        String strCsv = "Nadia, 622 014, C/Minerva, Desarrolladora ";
        for (String dato : strCsv.split(",")) {
            System.out.println("  Dato: " + dato.trim());
        }
    }

}
