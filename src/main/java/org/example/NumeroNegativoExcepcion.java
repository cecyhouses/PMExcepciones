package org.example;

import java.util.Scanner;

class NumeroNegativoExcepcion extends Exception {
    public NumeroNegativoExcepcion() {
        // Constructor sin parámetros, no es necesario usar super() ya que se llama automáticamente
    }

    public NumeroNegativoExcepcion(String mensaje) {
        // Constructor con mensaje, tampoco es necesario usar super() aquí
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingresa un número: ");
            double numero = scanner.nextDouble();

            if (numero < 0) {
                throw new NumeroNegativoExcepcion("Has ingresado un número negativo.");
            } else {
                double raizCuadrada = Math.sqrt(numero);
                System.out.println("La raíz cuadrada es: " + raizCuadrada);
            }
        } catch (NumeroNegativoExcepcion e) {
            System.out.println("Excepción: " + e.getMessage());
        } catch (java.util.InputMismatchException e) {
            System.out.println("Has ingresado un valor no numérico.");
        }
    }
}
