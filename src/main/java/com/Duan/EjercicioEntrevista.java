//java
package com.Duan;

/**
 *
 * @author duanr
 */
public class EjercicioEntrevista {

    public static void main(String[] args) {
        String palabra;
        String utilidad = "";
        int matriz[][] = {{1, 0, 0, 0},
                            {0, 1, 0, 1},
                            {0, 1, 1, 0},
                            {0, 0, 0, 1}};
        int grupo = matriz.length;
        int REDIX = 10;
        int apoyo = 0;
        palabra = "";
        for (int a = 0; a < matriz.length; a++) {

            for (int b = 0; b < matriz.length; b++) {
                if (matriz[a][b] == 1) {
                    palabra = palabra.concat(Integer.toString(b));//guardamos la posicion en la que aparece un 1 y la concatenamos.
                }
            }

        }

        for (int z = 0; z < matriz.length; z++) {
            apoyo = 0;
            for (int c = 0; c < palabra.length(); c++) {

                if (palabra.charAt(c) == Character.forDigit(z, REDIX)) {// es donde la cadena sea igual al valor del 0 a n entra al if
                    apoyo++;//variable que contabiliza las veces que se repite un 1 en una posicion
                }

            }
            if (apoyo > 1) {//si apoyo es mayor a dos quiere decir que hay un grupo
                if (apoyo == matriz.length) {//si apoyo es igual a n quiere decir que todo el grupo es un mismo grupo
                    grupo = 1;
                    break;
                }
                grupo--;//le restamos a al cantidad maxima de grupos

            }
        }
        System.out.println("la cantidad de grupos son:" + grupo);

    }
}
