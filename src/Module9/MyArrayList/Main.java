package Module9.MyArrayList;



public class Main {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("Hello");
        list.add("To");
        list.add("My");
        list.add("Custom");
        list.add("Array");
        list.add("List");
        System.out.println("list.size() = " + list.size());
        System.out.println("list.get(5) = " + list.get(5));
        list.remove(3);
        System.out.println("list.size() = " + list.size());
        for (int i = 0; i < list.size; i++) {
            list.get(i);
        }



    }
}
