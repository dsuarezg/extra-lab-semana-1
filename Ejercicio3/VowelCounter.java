package Ejercicio3;

public class VowelCounter {

    private static int vowelCount (String words) {
        int count = 0;
        String text = words.toLowerCase();

        for (char c : text.toCharArray()) {
            if ((c== 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u') ){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        var scanner = new java.util.Scanner(System.in);
        String inputString;
        System.out.println("Enter a string:");
        inputString = scanner.nextLine();
        System.out.println("Number of vowels: " + vowelCount(inputString));
    }

}
