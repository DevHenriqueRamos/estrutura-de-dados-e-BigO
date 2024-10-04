public class HashMap implements IHashMap {

    private final int capacity = 10;
    private Node[] buckets;

    public HashMap() {
        this.buckets = new Node[capacity];
    }

    private int hash(int key) {
        return (key * 31) % capacity;
    }

    @Override
    public void put(int key, int value) {
        int index = hash(key);
        Node node = new Node(key, value);
        if (buckets[index] != null) {
            Node current = buckets[index];
            while (current != null) {
                if (current.key == key) {
                    current.value = value;
                    return;
                }
                current = current.next;
            }
            node.next = buckets[index];
        }
        buckets[index] = node;

    }

    @Override
    public int delete(int key) {
        int index = hash(key);
        Node current = buckets[index];

        while (current != null) {
            if (current.key == key && current.next == null) {
                buckets[index] = null;
                return current.value;
            }

            if (current.next.key == key) {
                current.next = current.next.next;
                return current.next.value;
            }
            current = current.next;
        }
        return -1;
    }

    @Override
    public int get(int key) {
        int index = hash(key);
        Node current = buckets[index];
        while (current != null) {
            if (current.key == key) {
                return current.value;
            }
            current = current.next;
        }
        return -1;
    }

    @Override
    public void clear() {
        buckets = new Node[capacity];
    }
}
