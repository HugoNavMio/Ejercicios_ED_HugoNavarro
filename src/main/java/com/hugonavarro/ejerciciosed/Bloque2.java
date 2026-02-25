package com.hugonavarro.ejerciciosed;

public class Bloque2 {
    public static int maximo(int[] datos) {
        int max = 0;
        for (int i = 0; i < datos.length; i++) {
            if (datos[i] > max) {
                max = datos[i];
            }
        }
        return max;
    }
}
