class C1{
    public  int x=5;                          //access=Class,Package,SubClass,Word
    protected  int y=45;                      //access=Class,package,subclass                         //Not-Word
    int z=6;                                 //access=class,Package                                 // Not-subClass,Word
    private  int a=78;                       //access=Class                                         // Not-Package,SubClass,Word
    public  void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);

    }

}

public class AccessModifier {
    public static void main(String[] args) {
       C1 c=new C1();
       c.meth1();
    }
}
