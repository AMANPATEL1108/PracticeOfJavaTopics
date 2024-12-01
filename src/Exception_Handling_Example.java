import java.util.Scanner;

public class Exception_Handling_Example {
    public static void main(String[] args) {
       int[] marks=new int[3];
       marks[0]=7;
       marks[1]=12;
       marks[2]=17;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Index:");
        int ind=sc.nextInt();

        System.out.println("Enter a Number Divide the value");
        int number=sc.nextInt();
        try{
            System.out.println("The Value of array index enterd is "+marks[ind]);
            System.out.println("The Value of Array value divide by Number is"+marks[ind]/number);
        }catch (ArithmeticException e){
            System.out.println("Arithmetic Exception Found");
            System.out.println(e);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Bound Exception Found");
            System.out.println(e);
        }catch (Exception e){
            System.out.println("Some Exception Occure Found");
            System.out.println(e);
        }
    }
}
