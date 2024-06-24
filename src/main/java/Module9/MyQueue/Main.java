package Module9.MyQueue;

public class Main {
    public static void main(String[] args) {
        MyQueue<String> queue = new MyQueue<>();
        queue.add("Welcome");
        queue.add("To");
        queue.add("My");
        queue.add("Custom");
        queue.add("Queue");
        System.out.println("queue.peek() = " + queue.peek());

        System.out.println("queue.size() = " + queue.size());
        System.out.println("queue.peek() = " + queue.peek());

        System.out.println("queue.pool() = " + queue.pool());

        System.out.println("queue.pool() = " + queue.pool());

        System.out.println("queue.peek() = " + queue.peek());

        System.out.println("queue.size() = " + queue.size());

        queue.clear();
        System.out.println("queue.size() = " + queue.size());
    }
}
