package com.campusdual.classroom;
import java.util.ArrayList;
import java.util.List;

public class Exercise07 {

    public static void main(String[] args) {
        sumFirstNaturalNumbers(10);
        showFirstNaturalNumbers(20);
        positionInAList(7);
        positionInAList(14);
    }

    //TODO ↓
    // ESTE MÉTODO NO ES NECESARIO HACERLO POR PARTE DE LOS ALUMNOS
    // Crear una List<Integer> con los números del 10 al 1. Luego buscar el elemento
    // que se le pasa por parámetro.
    // Si lo encuentra, que imprima el siguiente mensaje → El elemento X se encuentra en la posición: Y
    // Si NO lo encuentra, que imprima el siguiente mensaje → El elemento X no se encuentra en la lista.

    /**
     * Busca un número en una lista del 0 al 10 e imprime la posición si lo encuentra.
     * Si no lo encuentra, muestra un mensaje indicando que no está en la lista.
     *
     * @param num Número a buscar.
     */
    public static void positionInAList(int num) {
        List<Integer> numberList = new ArrayList<>();

        for(int i= 1; i <= 10; i++) {
            numberList.add(i);
        }

        if(numberList.contains(num)) {
            System.out.println("El elemento " + num + " se encuentra en la posición: " + numberList.indexOf(num));
        } else {
            System.out.println("El elemento " + num + " no se encuentra en la lista.");
        }
    }

    //TODO ↓
    // Que imprima como mensaje la suma de los primeros N números positivos
    /**
     * Calcula e imprime la suma de los primeros N números naturales.
     *
     * @param num Número de elementos a sumar.
     */
    public static void sumFirstNaturalNumbers(int num) {
        if(num <= 0) System.out.println("Tienes que introducir un numero positivo mayor a cero" );
        int sum = num*(num + 1)/2;
        System.out.println("la suma de los primeros "+ num + " números positivos es: "+ sum);
    }

    //TODO ↓
    // Que imprima por pantalla los N primeros números positivos
    /**
     * Imprime los primeros N números naturales.
     *
     * @param num Número de elementos a imprimir.
     */
    public static void showFirstNaturalNumbers(int num) {
        if(num <= 0) System.out.println("Tienes que introducir un numero positivo mayor a cero" );
        for(int i=1; i<=num; i++) {
            System.out.println("Número positivo: "+ i);
        }
    }

}
