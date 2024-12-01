class  Base{

    int x;
    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am a set X of Base Class");
        this.x = x;
    }


//    void printMe(){
//        System.out.println("I am a Constructor");
//    }
     void printMe(){
    System.out.println("I am a Constructor");
}
}

class Driverd extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}


public class InheritancePractiice {
    public static void main(String[] args) {
        Driverd d=new Driverd();
        d.setX(4);
        System.out.println(d.getX());

    }
}
