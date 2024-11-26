
class Calculator {
    // Overloaded methods
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}



public class Polymorephism_Prac {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5, 3));       // Calls int method
        System.out.println(calc.add(4.5, 2.5));
    }
}
