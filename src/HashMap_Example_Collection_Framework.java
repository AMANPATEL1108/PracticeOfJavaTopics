import java.util.HashMap;

public class HashMap_Example_Collection_Framework {
    public static void main(String[] args) {
        System.out.println(gethashmapp());
    }

    static HashMap<Integer, Integer> gethashmapp() {
        HashMap<Integer, Integer> a = new HashMap<>();
        a.put(1, 10);
        a.put(2, 20);
        a.put(3, 30);
        return a;
    }
}
