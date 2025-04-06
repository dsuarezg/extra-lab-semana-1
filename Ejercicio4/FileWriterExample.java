package Ejercicio4;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) throws IOException {
        var scanner = new java.util.Scanner(System.in);
        FileWriter file;
        System.out.println("Enter a file name:");
        file = new java.io.FileWriter(scanner.nextLine());
        System.out.println("Enter text lines and press enter:");
        while (true) {
            String line = scanner.nextLine();
            if (line.isEmpty()) {
                break;
            }
            file.write(line + "\n");
        }
        file.close();
    }
}
