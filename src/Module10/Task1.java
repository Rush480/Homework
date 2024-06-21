package Module10;

import java.io.*;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("Files/Task1/file.txt");
        FileInputStream fIs = new FileInputStream(file);
        Scanner fileScanner = new Scanner(fIs);
        while (fileScanner.hasNext()) {
            validate(fileScanner.nextLine());
        }
    }

    public static void validate(String num) {
        if (num.matches("\\(\\d{3}\\) \\d{3}-\\d{4}") || num.matches("\\d{3}-\\d{3}-\\d{4}")) {
            System.out.println(num);
        }
    }
}