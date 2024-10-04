public class QueueFIFO implements IQueueFIFO{

    private Node rear;
    private Node front;
    private int size;

    private static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        }
    }

    @Override
    public void enqueue(int value) {
        Node newNode = new Node(value);
        if(front == null){
            front = rear = newNode;
        }
        rear.next = newNode;
        rear = newNode;
        size++;
    }

    @Override
    public void dequeue() {
        if(front == null){
            System.out.println("Queue is empty");
            return;
        }
        front = front.next;
        size--;
    }

    @Override
    public int rear() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return rear.data;
    }

    @Override
    public int front() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return front.data;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return front == null;
    }

}
