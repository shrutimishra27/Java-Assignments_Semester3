import java.util.*;

class Main6 {
    static void varArgs(String ...names) {
        System.out.println("Number of names passed: " + names.length);
        for(String name: names) 
            System.out.println(name);
        System.out.println();
    }

    public static void main(String[] args) {
        varArgs("Shivraj", "Shruti", "Rahul"); 
        varArgs("Murli", "Dhvani");
        varArgs();
    }
}