package com.hugonavarro.ejerciciosed;

public class Bloque4 {
    public static String clasificarEdad(int edad) {
        if (edad < 0) {
            return "ERROR";
        } else if (edad < 12) {
            return "NIÑO";
        } else if (edad < 18) {
            return "ADOLESCENTE";
        } else {
            return "ADULTO";
        }
    }
}
