import java.time.Duration;
import java.time.Instant;
import java.util.*;

public class TestClass {


    public long getAddTime(MyLinkedList TestMyLinkedList) {
        TestMyLinkedList = new MyLinkedList();
        Instant start = Instant.now();
        for (int i = 1; i < 10000; i++) {
            TestMyLinkedList.add(i);
        }
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        TestMyLinkedList.clear();

        return timeElapsed;
    }

    public long getAddTime(LinkedList TestLinkedList) {
        Instant start = Instant.now();
        for (int i = 1; i < 10000; i++) {
            TestLinkedList.add(i);
        }
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        TestLinkedList.clear();

        return timeElapsed;
    }

    public long getAddTime(ArrayList TestArrayList) {

        Instant start = Instant.now();
        for (int i = 1; i < 10000; i++) {
            TestArrayList.add(i);
        }
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        TestArrayList.clear();

        return timeElapsed;
    }

    public long getAddTime(LinkedHashSet TestLinkedHashSet) {

        Instant start = Instant.now();
        for (int i = 1; i < 10000; i++) {
            TestLinkedHashSet.add(i);
        }
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        TestLinkedHashSet.clear();

        return timeElapsed;

    }

    public long getAddTime(LinkedHashMap TestLinkedHashMap) {

        Instant start = Instant.now();
        for (int i = 1; i < 10000; i++) {
            TestLinkedHashMap.put(i, i);
        }
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        TestLinkedHashMap.clear();
        return timeElapsed;
    }

    public long getRemoveTime(MyLinkedList TestMyLinkedList) {
        for (int i = 0; i < 10000; i++) {
            TestMyLinkedList.add(i);
        }
        Instant start = Instant.now();
        for (int i = 0; i < 10000; i++) {
            TestMyLinkedList.remove(i);
        }
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();

        return timeElapsed;

    }

    public long getRemoveTime(LinkedList TestLinkedList) {
        for (int i = 0; i < 10000; i++) {
            TestLinkedList.add(i);
        }
        Instant start = Instant.now();
        for (int i = 0; i < 5000; i++) {
            TestLinkedList.remove(i);
        }
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        return timeElapsed;
    }

    public long getRemoveTime(ArrayList TestArrayList) {
        for (int i = 0; i < 10000; i++) {
            TestArrayList.add(i);
        }
        Instant start = Instant.now();
        for (int i = 0; i < 5000; i++) {
            TestArrayList.remove(i);
        }
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        return timeElapsed;
    }

    public long getRemoveTime(LinkedHashSet TestLinkedHashSet) {
        for (int i = 0; i < 10000; i++) {
            TestLinkedHashSet.add(i);
        }
        Instant start = Instant.now();
        for (int i = 0; i < 5000; i++) {
            TestLinkedHashSet.remove(i);
        }
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        return timeElapsed;
    }

    public long getRemoveTime(LinkedHashMap TestLinkedHashMap) {
        for (int i = 0; i < 10000; i++) {
            TestLinkedHashMap.put(i, i);
        }
        Instant start = Instant.now();
        for (int i = 0; i < 5000; i++) {
            TestLinkedHashMap.remove(0, i);
        }
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        return timeElapsed;
    }

    public static void main(String[] args) {

        TestClass testClass = new TestClass();
        MyLinkedList myLinkedList = new MyLinkedList();
        LinkedList linkedList = new LinkedList<>();
        ArrayList arrayList = new ArrayList<>();
        LinkedHashSet linkedHashSet = new LinkedHashSet<>();
        LinkedHashMap linkedHashMap = new LinkedHashMap();


        for (int i = 1; i <= 7; i++) {
            System.out.println("MyLinkedList add time " + testClass.getAddTime(myLinkedList));
            myLinkedList.clear();
            System.out.println("LinkedList add time " + testClass.getAddTime(linkedList));
            linkedList.clear();
            System.out.println("ArrayList add time " + testClass.getAddTime(arrayList));
            arrayList.clear();
            System.out.println("LinkedHashSet add time " + testClass.getAddTime(linkedHashSet));
            linkedHashSet.clear();
            System.out.println("LinkedHashMap add time " + testClass.getAddTime(linkedHashMap));
            linkedHashMap.clear();
            System.out.println("MyLinkedList remove time  " + testClass.getRemoveTime(myLinkedList));
            myLinkedList.clear();
            System.out.println("LinkedList remove time  " + testClass.getRemoveTime(linkedList));
            linkedList.clear();
            System.out.println("ArrayList remove time  " + testClass.getRemoveTime(arrayList));
            arrayList.clear();
            System.out.println("LinkedHashSet remove time  " + testClass.getRemoveTime(linkedHashSet));
            System.out.println("LinkedHashMap remove time  " + testClass.getRemoveTime(linkedHashMap));

        }
    }
}
