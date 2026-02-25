package com.hugonavarro.ejerciciosed;

public class Bloque1 {
    public static int calcularPrecioFinal(int precioBase, int descuento) {
        return precioBase - (precioBase * descuento / 100);
    }

    public static void main(String[] args) {
        // EJERCICIO 1

        /* CASO 1
        Entradas: 59 & 8
        Resultado esperado: 54,28
        Oráculo: 55
        */

        System.out.println("CASO 1: " + calcularPrecioFinal(59, 8));

        /* CASO 2
        Entradas: 11 & 95
        Resultado esperado: 0,55
        Oráculo: 1
        */

        System.out.println("CASO 2: " + calcularPrecioFinal(11, 95));

        /* CASO 3
        Entradas: 87 & 48
        Resultado esperado: 45,24
        Oráculo: 46
        */

        System.out.println("CASO 3: " + calcularPrecioFinal(87, 48));

        /* CASO 4
        Entradas: 82 & 26
        Resultado esperado: 60,68
        Oráculo: 61
        */

        System.out.println("CASO 4: " + calcularPrecioFinal(82, 26));

        /* CASO 5
        Entradas: 57 & 85
        Resultado esperado: 8,55
        Oráculo: 9
        */

        System.out.println("CASO 5: " + calcularPrecioFinal(57, 85));

        /* CASO 6
        Entradas: 66 & 75
        Resultado esperado: 16,5
        Oráculo: 17
        */

        System.out.println("CASO 6: " + calcularPrecioFinal(66, 75));

        /* CASO 7
        Entradas: 45 & 65
        Resultado esperado: 15,75
        Oráculo: 16
        */

        System.out.println("CASO 7: " + calcularPrecioFinal(45, 65));

        /* CASO 8
        Entradas: 20 & 100
        Resultado esperado: 0
        Oráculo: 0
        */

        System.out.println("CASO 8: " + calcularPrecioFinal(20, 100));

        // EJERCICIO 2

        /* CASO 9 (Número del Descuento en Negativo)
        Entradas: 70 & -30
        Resultado esperado: 91
        Oráculo: 91
        */

        System.out.println("CASO 9: " + calcularPrecioFinal(70, -30));

        /* CASO 10 (Número del Descuento mayor que 100)
        Entradas: 100 & 200
        Resultado esperado: -100
        Oráculo: -100
        */

        System.out.println("CASO 10: " + calcularPrecioFinal(100, 200));
    }
}