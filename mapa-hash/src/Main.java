public class Main {
    public static void main(String[] args) {
        IHashMap hashMap = new HashMap();
        hashMap.put(1, 100);

        System.out.println("----Test get----");
        System.out.println("expected: 100, result: " + hashMap.get(1));

        System.out.println("----Test change value----");
        hashMap.put(1, 200);
        System.out.println("expected: 200, result: " + hashMap.get(1));

        System.out.println("----Test delete----");
        System.out.println("expected: 200, result: " + hashMap.delete(1));
        System.out.println("expected: -1, result: " + hashMap.get(1));

        System.out.println("----Test clear----");
        hashMap.put(1, 100);
        hashMap.put(2, 200);
        hashMap.put(3, 300);
        hashMap.put(4, 400);
        hashMap.clear();
        System.out.println("expected: -1, result: " + hashMap.get(1));

    }
}