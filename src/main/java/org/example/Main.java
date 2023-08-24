import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingresa una cadena de caracteres: ");
            String cadena = scanner.nextLine();

            char caracter = caracterEn(cadena, 7);
            System.out.println("El caracter en la posición 7 es: " + caracter);
        } catch (Exception e) {
            System.out.println("Has intentado recuperar una posición de la cadena de caracteres que no existe.");
        }
    }

    public static char caracterEn(String cadena, int posicion) throws Exception {
        if (posicion >= 0 && posicion < cadena.length()) {
            return cadena.charAt(posicion);
        } else {
            throw new Exception("Posición inválida");
        }
    }
}