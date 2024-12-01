package CoreJava_BasicTopics;

import java.util.Stack;

public class Stack_Example_Collection_Framework {
    public static void main(String[] args) {
        System.out.println(getstck());
    }

    static Stack  getstck(){
        Stack a=new Stack();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);

        return a;
    }
}
