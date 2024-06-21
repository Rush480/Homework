package Module10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class Task3 {
    public static void main(String[] args) throws FileNotFoundException {
        MyFileReader str = new MyFileReader();
        String text = str.ReadFile("Files/Task3/words.txt");
        System.out.println(text);
        String[] words = text.split(" ");

        Map<String, Integer> wordCountMap = new HashMap<>();
        for (String word : words) {
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                wordCountMap.put(word, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


        System.out.println("Arrays.toString(array) = " + Arrays.toString(words));


    }
}
class MyFileReader{

    public String ReadFile(String path) throws FileNotFoundException {
        File file = new File(path);
        FileInputStream fIs = new FileInputStream(file);
        Scanner scanner = new Scanner(fIs);
        String text = "";
        while (scanner.hasNext()) {
            text = text + " " + scanner.nextLine();
        }
        return text.trim();
    }

}