package CoreJava_BasicTopics;

class EkClass{
    int a;
    EkClass(int a){
        this.a=a;
    }
    public  int returnone(){
        return 1;
    }

    public int getA() {
        return a;
    }
}

class DoClass extends EkClass{
    DoClass(int c){
        super(c);
        System.out.println("Mai Ak Constructor huu");
    }
}


public class This_Super {
    public static void main(String[] args) {
//       EkClass e=new EkClass(5);
//        System.out.println(e.getA());
        DoClass d=new DoClass(5);
    }
}
