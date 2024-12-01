package CoreJava_BasicTopics;

import sun.reflect.generics.tree.Tree;

import java.util.TreeMap;

public class TreeMap_Example_Collection_Framework {
    public static void main(String[] args) {
        System.out.println(gettreemapp());

    }

    static TreeMap<Integer,String>  gettreemapp(){
        TreeMap<Integer,String> a=new TreeMap();
        a.put(1,"Aman");
        a.put(2,"Patel");

        return a;
    }
}
