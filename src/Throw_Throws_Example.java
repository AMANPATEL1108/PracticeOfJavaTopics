public class Throw_Throws_Example {

  public   static int divide(int a,int b) throws ArithmeticException{  //or use in any where we can throw Exception where i want like if statements or others
        int result=a/b;
        return  result;
    }
    public static void main(String[] args) {

      try {
          int c=divide(5,0);
          System.out.println(c);
      }catch (Exception e){
          System.out.println("Exception");
      }

    }
}
