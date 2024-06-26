package Module10;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.*;

public class Task2 {
    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader();

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String[] words = fileReader.getString("Files/Task2/file.txt").split(" ");

        List<User> users = new ArrayList<>();
        for (int i = 2; i < words.length; i += 2) {
            String name = words[i];
            int age = Integer.parseInt(words[i + 1]);
            users.add(new User(name, age));
        }

        try(FileWriter writer = new FileWriter("Files/Task2/file.json")){
            gson.toJson(users,writer);
        }catch (IOException ex){
            ex.printStackTrace();
        }

    }
}

class FileReader {
    public String getString(String path) {
        File file = new File(path);
        StringBuilder text = null;

        try (FileInputStream fs = new FileInputStream(file);
             Scanner scanner = new Scanner(fs)) {
            text = new StringBuilder();

            while (scanner.hasNext()) {
                text.append(scanner.nextLine());
                text.append(" ");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return String.valueOf(text);
    }

}


class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

}