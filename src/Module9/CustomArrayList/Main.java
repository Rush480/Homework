package Module9.CustomArrayList;

public class Main {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("Hello");
        list.add("To");
        list.add("My");
        list.add("Custom");
        list.add("Array");
        list.add("List");
        System.out.println("list.get(7) = " + list.get(7));
        list.remove(9);
        System.out.println("list.size() = " + list.size());
    }
}
