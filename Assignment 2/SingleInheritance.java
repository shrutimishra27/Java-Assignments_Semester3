//single inheritence 

class Animal {
    public Animal() {
        System.out.println("Animal is created");
    }

    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {
    public Dog() {
        // super();
        System.out.println("Dog is created");
    }

    void bark() {
        System.out.println("Barking");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();
    }
}
