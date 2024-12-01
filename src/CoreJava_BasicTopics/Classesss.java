package CoreJava_BasicTopics;

import java.util.Scanner;

public class Classesss {
    int a;
    int b;
    void getData(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First NUmber:");
         a=sc.nextInt();
        System.out.println("Enter a Second Number");
         b=sc.nextInt();
    }
    void putData(){
        System.out.println("Addition="+(a+b));
    }

    public static void main(String[] args) {
        Classesss add=new Classesss();
        add.getData();
        add.putData();
    }

}



///----Second Type to Declareation-------------
//import java.util.Scanner;
//
//public class Classesss {
//
//    public static void main(String[] args) {
//        Sec get=new Sec();
//        get.getData();
//        get.putData();
//    }
//
//}
//
//class Sec{
//    int a;
//    int b;
//    void getData(){
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter First NUmber:");
//        a=sc.nextInt();
//        System.out.println("Enter a Second Number");
//        b=sc.nextInt();
//    }
//    void putData(){
//        System.out.println("Addition="+(a+b));
//    }
//}








