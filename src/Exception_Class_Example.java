import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString() {
        return "I am To String";
    }

    @Override
    public String getMessage() {
        return "I am To Message";
    }
}

public class Exception_Class_Example {
    public static void main(String[] args) {
        int a=8;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        if (a<9){
            try {
//                throw  new MyException();
                throw  new ArithmeticException("this is an Exception");

            }catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
                System.out.println("Finished");
            }
            System.out.println("Yes Finished");
        }
    }
}
