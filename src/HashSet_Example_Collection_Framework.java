import java.util.HashSet;
import java.util.Stack;

public class HashSet_Example_Collection_Framework {
    public static void main(String[] args) {
        System.out.println(gethash());
    }

    static HashSet gethash(){
        HashSet a=new HashSet();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);

        return a;
    }
}
