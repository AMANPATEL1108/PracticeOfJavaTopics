
class Base1{
    Base1(){
        System.out.println("I am a Base 1 Simple ClassConstructor");
    }

    Base1(int x){
        System.out.println("I am a Overloaded Base ClassConstructor with Value as :"+x);
    }
}

class  Deriverd1 extends  Base1{

//    Deriverd1(){
////        super(0);
//        System.out.println("I am a Derived Simple Class Construnctor");
//    }

    Deriverd1(int x,int y){
        super(x);
        System.out.println("I am a Overloaded Derived ClassConstructor with Value as :"+y);

    }
}


class childOfDerived extends Deriverd1 {
    // Constructor for childOfDerived with no arguments
    childOfDerived() {
        super(0, 0); // Call the overloaded constructor of Deriverd1 with default values
        System.out.println("I am a Child of Derived Constructor");    //
    }

    // Overloaded constructor for childOfDerived with three integer arguments
    childOfDerived(int x, int y, int z) {
        super(x, y); // Call the overloaded constructor of Deriverd1
        System.out.println("I am a Child of Derived Constructor with Values: " + x + ", " + y + ", " + z);
    }
}

public class Constructorrr {
    public static void main(String[] args) {
//        Base1 b=new Base1();
//        Deriverd1 d=new Deriverd1(2,3);
        childOfDerived cd=new childOfDerived();
    }


}
