// Defining an interface
interface Animal {
    void sound(); // Abstract method
    void sleep();
}

// Implementing the interface
class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleeps");
    }
}

// Another implementation
class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }

    @Override
    public void sleep() {
        System.out.println("Cat sleeps");
    }
}


public class Interfacess_Example {
    public static void main(String[] args) {
        Animal dog = new Dog(); // Polymorphism with interface
        Animal cat = new Cat();

        dog.sound();
        dog.sleep();

        cat.sound();
        cat.sleep();
    }
}
