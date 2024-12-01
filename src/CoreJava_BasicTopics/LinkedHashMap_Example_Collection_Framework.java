package CoreJava_BasicTopics;

import java.util.LinkedHashMap;

public class LinkedHashMap_Example_Collection_Framework {
    public static void main(String[] args) {
        System.out.println(getLinkedHashMap());
    }

    static LinkedHashMap<Integer, String> getLinkedHashMap() {

        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "Aman");
        map.put(2, "Het");
        map.put(3, "Gt");
        map.put(4, "Rushi");

        return map;
    }
}
