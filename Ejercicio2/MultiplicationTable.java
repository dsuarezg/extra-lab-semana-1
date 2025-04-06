package Ejercicio2;

public class MultiplicationTable {

    public static void main(String[] args) {
        var scanner = new java.util.Scanner(System.in);
        int number;
        System.out.println("Enter the number for the multiplication table:");
        number = scanner.nextInt();
        for(int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
        scanner.close();
    }
}
