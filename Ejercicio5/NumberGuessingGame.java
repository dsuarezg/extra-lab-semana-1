package Ejercicio5;

import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1;
        int guess = 0;
        int count = 0;
        var scanner = new java.util.Scanner(System.in);
        System.out.println("¡Bienvenido al juego de adivinanza de números!");
        System.out.println("He elegido un número entre 1 y 100. ¡Intenta adivinarlo!:");
            while(guess!=secretNumber){
                System.out.println("Introduce tu número:");
                guess = scanner.nextInt();
                if (guess < secretNumber) {
                    System.out.println("El número es mayor. Intenta de nuevo.");
                    count++;
                } else if (guess > secretNumber) {
                    System.out.println("El número es menor. Intenta de nuevo.");
                    count++;
                } else {
                    System.out.println("¡Felicidades! Has adivinado el número.");
                    System.out.println("Has necesitado " + count + " intentos.");
                }
            }
            scanner.close();
    }
}
