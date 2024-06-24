package Module9.MyArrayList;



public class Main {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("Hello");
        list.add("From");
        list.add("My");
        list.add("Custom");
        list.add("Array");
        list.add("List");

        System.out.println("list.size() = " + list.size());
        list.remove(2);
        list.size();



        for (int i = 0; i < list.size; i++) {
            System.out.println(list.get(i));
        }



    }
}
