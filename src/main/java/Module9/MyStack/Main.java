package Module9.MyStack;

public class Main {
    public static void main(String[] args) {
        MyStack<String> myStack = new MyStack<>();
        myStack.push("Hello");
        myStack.push("To");
        myStack.push("My");
        myStack.push("Custom");
        myStack.push("Stack");
        System.out.println(myStack.peek());
        System.out.println("myStack.size = " + myStack.size());

        System.out.println(myStack.pop());
        System.out.println("myStack.size = " + myStack.size());

        System.out.println(myStack.peek());
        myStack.clear();


    }
}
