
public class App {

    public static void main(String[] args) {
        IStackArray stack = new StackArray();
        stack.push(10);
        stack.push(20);

        System.out.println("-----Test top-----");
        System.out.println("expected: 20, result: " + stack.top());

        System.out.println("-----Test isEmpty-----");
        System.out.println("expected: false, result: " + stack.isEmpty());

        System.out.println("-----Test size-----");
        System.out.println("expected: 2, result: " + stack.size());

        System.out.println("-----Test pop-----");
        stack.pop();
        stack.pop();
        System.out.println("expected: true, result: " + stack.isEmpty());
    }
}