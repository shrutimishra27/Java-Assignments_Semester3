//multilevel

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

class BabyDog extends Dog {
    void weep() {
        System.out.println("Weeping");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        BabyDog d = new BabyDog();
        d.eat();
        d.bark();
        d.weep();
    }
}
