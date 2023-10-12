package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Calculadora {
    public static void main(String[] args) {
        // Definir dos números para multiplicar
        int numero1 = 5;
        int numero2 = 10;

        // Realizar la multiplicación
        int resultado = multiplica(numero1, numero2);

        // Mostrar el resultado
        System.out.println("El resultado de la multiplicación es: " + resultado);
    }

    // Método para realizar la multiplicación
    public static int multiplica(int a, int b) {
        return a * b;
    }
}