public class Nested_Try_Catch_Example {
    public static void main(String[] args) {
        int[] marks=new int[3];
        marks[0]=7;
        marks[1]=12;
        marks[2]=17;

        try{
            System.out.println("Welcome to Video 82");
            try{
                System.out.println(marks[9]);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Sorry this index not Exist");
                System.out.println("Exception In Level 2");

            }
        }
        catch (Exception e){
            System.out.println("Exception In Level 1");
        }
    }
}
