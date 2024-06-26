package Module9.MyQueue;

public class Main {
    public static void main(String[] args) {
        MyQueue<String> mq = new MyQueue<>();
        mq.add("0");
        mq.add(null);
        mq.add(null);
        mq.add("4");
        System.out.println(mq.size()); // 4
        System.out.println(mq.poll()); // 0
        System.out.println(mq.poll()); // null
        System.out.println(mq.poll());
    }
}
