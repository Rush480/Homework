package Module9.MyHashMap;

public class Main {
    public static void main(String[] args) {
        MyHashMap<Integer,String> myHashMap = new MyHashMap<>();
        myHashMap.put(1,"Hello");
        myHashMap.put(2,"World");
        myHashMap.put(3,"Ola");
        System.out.println(myHashMap.get(1));


    }

}
