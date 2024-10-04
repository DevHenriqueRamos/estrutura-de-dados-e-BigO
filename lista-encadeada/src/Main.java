public class Main {
    public static void main(String[] args) {
        ILinkedList linkedList = new LinkedList();
        linkedList.push(10);

        System.out.println("---Test insert----");
        linkedList.push(30);
        linkedList.insert(1, 20);
        System.out.print("expected: 10 20 30, result: ");
        linkedList.printList();

        System.out.println("---Test remove----");
        linkedList.remove(0);
        System.out.print("expected: 20 30, result: ");
        linkedList.printList();

        System.out.println("---Test elementAt----");
        System.out.println("expected: 20, result: " + linkedList.elementAt(0));

        System.out.println("---Test size----");
        linkedList.insert(0, 10);
        linkedList.push(40);
        System.out.print("expected: 10 20 30 40, result: ");
        linkedList.printList();
        System.out.println("expected: 4, result: " + linkedList.size());

        System.out.println("---Test pop----");
        System.out.println("expected: 40, result: " + linkedList.pop());
        System.out.print("expected: 10 20 30, result: ");
        linkedList.printList();
    }
}