package Module10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class Task3 {
    public static void main(String[] args) throws FileNotFoundException {
        MyFileReader str = new MyFileReader();
        String text = str.ReadFile("Files/Task3/words.txt");

        //System.out.println(text);

        String[] words = text.split(" ");

        Map<String, Integer> wordCountMap = new HashMap<>();
        for (String word : words) {
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                wordCountMap.put(word, 1);
            }
        }

        List<Map.Entry<String, Integer>> wordCountList = new ArrayList<>(wordCountMap.entrySet());
        wordCountList.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        for (Map.Entry<String, Integer> entry : wordCountList) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

class MyFileReader {

    public String ReadFile(String path) throws FileNotFoundException {
        File file = new File(path);
        FileInputStream fIs = new FileInputStream(file);
        Scanner scanner = new Scanner(fIs);
        StringBuilder text = new StringBuilder();
        while (scanner.hasNext()) {
            text.append(" ").append(scanner.nextLine());
        }
        return String.valueOf(text).trim();
    }

}