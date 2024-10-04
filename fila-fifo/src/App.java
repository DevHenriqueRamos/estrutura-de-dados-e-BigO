public class App {
    public static void main(String[] args) {
        IQueueFIFO queueFIFO = new QueueFIFO();
        queueFIFO.enqueue(1);
        queueFIFO.enqueue(2);

        System.out.println("----Test front----");
        System.out.println("expected: 1, result: " + queueFIFO.front());

        System.out.println("----Test rear----");
        System.out.println("expected: 2, result: " + queueFIFO.rear());

        System.out.println("----Test size----");
        queueFIFO.enqueue(3);
        System.out.println("expected: 3, result: " + queueFIFO.size());

        System.out.println("----Test isEmpty----");
        System.out.println("expected: false, result: " + queueFIFO.isEmpty());

        System.out.println("----Test dequeue----");
        queueFIFO.dequeue();
        System.out.println("expected: 1, result: " + queueFIFO.front());

    }
}
