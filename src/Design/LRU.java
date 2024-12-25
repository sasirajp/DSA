package Design;

//class DoubleLinkedList {
//    String data;
//    DoubleLinkedList prev;
//    DoubleLinkedList next;
//}


import java.util.LinkedList;
import java.util.Map;

public class LRU {
    static int capacity = 3;

    private static Map<Integer, String> map;
    private static LinkedList<String> doubleLinkedList;


    public static void main(String[] args) {
//        PUT TO LIST

    }

    static void add(Integer key, String data) {
        if (map.containsKey(key)) {
            map.put(key, data);
            doubleLinkedList.g
        }
    }

    static void printList() {
        System.out.println(doubleLinkedList);
    }

    static void printMap() {
        System.out.println(doubleLinkedList);
    }
}
