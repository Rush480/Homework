package Module9.MyLinkedList;




public class Main {
    public static void main(String[] args) {


        MyLinkedList<String> list = new MyLinkedList<>();
        list.add("Hello");
        list.add("From");
        list.add("My");
        list.add("Linked");
        list.add("List");
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));


        list.remove(4);

        System.out.println("-----------------");

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        //System.out.println(list.get(4));

        list.clear();



    }
}
