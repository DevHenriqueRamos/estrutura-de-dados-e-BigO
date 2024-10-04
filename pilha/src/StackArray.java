public class StackArray implements IStackArray{

    private Node top;
    private int size;

    private static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        }
    }

    @Override
    public void push(int value) {
        Node newNode = new Node(value);
        if (top == null) {
            top = newNode;
            size++;
            return;
        }
        newNode.next = top;
        top = newNode;
        size++;
    }

    @Override
    public int pop() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        int returnValue = top.data;
        top = top.next;
        size--;
        return returnValue;
    }

    @Override
    public int top() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public int size() {
        return size;
    }
}
