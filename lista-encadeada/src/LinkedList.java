
public class LinkedList implements ILinkedList{

    private Node head;
    private Node tail;
    private int size;

    private static class Node{
        int data;
        Node next;
        Node previous;
        public Node(int value){
            this.data = value;
        }
        public boolean hasNext() {
            return next != null;
        }
    }

    public LinkedList(){
        head = null;
        size = 0;
    }

    private Node createNode(int data){
        return new Node(data);
    }

    @Override
    public void push(int data) {
        Node newNode = createNode(data);
        if(head == null){
            head = tail = newNode;
        } else {
            newNode.previous = tail;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    @Override
    public int pop() {

        if(head == null){
            System.out.println("List is empty");
            return -1;
        }

        if(!head.hasNext()){
            head = null;
            size--;
            return tail.data;
        }

        int removedData = tail.data;
        tail = tail.previous;
        tail.next = null;
        size--;
        return removedData;
    }

    @Override
    public void insert(int index, int data) {
        Node newNode = createNode(data);
        if (index < 0 || index > size()-1) {
            System.out.println("Index out of bounds");
            return;
        }

        if(head == null){
            System.out.println("List is empty");
            return;
        }

        if (index == 0){
            newNode.next = head;
            head.previous = newNode;
            head = newNode;
            size++;
            return;
        }

        Node current = fetchNodeByIndex(index);
        newNode.next = current;
        newNode.previous = current.previous;
        current.previous = newNode;
        newNode.previous.next = newNode;
        size++;
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index > size()-1) {
            System.out.println("Index out of bounds");
            return;
        }

        if(head == null){
            System.out.println("List is empty");
            return;
        }

        if (index == 0){
            head.next.previous = null;
            head = head.next;
            size--;
            return;
        }

        Node current = fetchNodeByIndex(index);
        current.previous.next = current.next;
        current.next.previous = current.previous;
        size--;
    }

    @Override
    public int elementAt(int index) {
        if (index < 0 || index > size()-1) {
            System.out.println("Index out of bounds");
            return -1;
        }

        if(head == null){
            System.out.println("List is empty");
            return -1;
        }

        if (index == 0){
            return head.data;
        }

        Node current = fetchNodeByIndex(index);
        return current.data;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void printList() {
        StringBuilder stringBuilder = new StringBuilder();
        Node current = head;
        while (current.hasNext()) {
            stringBuilder.append(current.data).append(" ");
            current = current.next;
        }
        stringBuilder.append(current.data);
        System.out.println(stringBuilder);
    }
    
    private Node fetchNodeByIndex(int index){
        boolean shouldStartToTail = index > size / 2;

        int currentIndex = shouldStartToTail ? size - 1 : 1;
        Node current = shouldStartToTail ? tail : head.next;

        while (currentIndex != index) {
            current = shouldStartToTail ? current.previous : current.next;
            if(shouldStartToTail){currentIndex--;} else {currentIndex++;}
        }
    }
}
