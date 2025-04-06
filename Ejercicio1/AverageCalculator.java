package Ejercicio1;

public class AverageCalculator {

    private static double average(Double[]  averageArray) {
        double sum = 0;
        for (double number: averageArray) {
            sum += number;
        }
        return (sum / averageArray.length);
    }


    public static void main(String[] args) {
        int arrayLength;
        Double[] averageArray;
        var scanner = new java.util.Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        arrayLength = scanner.nextInt();
        System.out.println("Enter each number and press enter:");
        averageArray = new Double[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Number " + (i + 1) + ":");
            averageArray[i] = scanner.nextDouble();
        }
        System.out.println("Average: " + average(averageArray));

        scanner.close();
    }
}
