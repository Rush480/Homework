package Module10;

import java.io.*;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){

        final var fileScanner = getScanner();
        while (fileScanner.hasNext()) {
            validate(fileScanner.nextLine());
        }
    }

    private static Scanner getScanner() {
        FileInputStream fIs;
        try {
            File file = new File("Files/Task1/file.txt");
            fIs = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return new Scanner(fIs);
    }

    public static void validate(String num) {
        if (num.matches("\\(\\d{3}\\) \\d{3}-\\d{4}") || num.matches("\\d{3}-\\d{3}-\\d{4}")) {
            System.out.println(num);
        }
    }
}