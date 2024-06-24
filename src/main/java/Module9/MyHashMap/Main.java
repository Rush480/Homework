package Module9.MyHashMap;

public class Main {
    public static void main(String[] args) {
        MyHashMap<Integer,String> myHashMap = new MyHashMap<>();
        myHashMap.put(1,"Hello");
        myHashMap.put(2,"World");
        myHashMap.put(3,"Ola");
        myHashMap.put(3,"Oleole");
        myHashMap.remove(2);
        System.out.println("myHashMap.size() = " + myHashMap.size());


        System.out.println(myHashMap.get(3));

        myHashMap.clear();
        System.out.println(myHashMap.get(3));
        System.out.println(myHashMap.get(2));
        System.out.println(myHashMap.get(1));


    }

}
