import java.util.*;

 class Student {
    protected int rollNo;
    protected String name;
    protected static int studentCount = 0;

    public Student() {
        studentCount++;
    }

    public Student(int rollNo, String name) {
        this.accept(rollNo, name);
        studentCount++;
    }

    public void accept(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public void display() {
        System.out.println("Display method of Student class");
        System.out.println("Roll number: " + this.rollNo);
        System.out.println("Name: " + this.name);
    }
}

 class EngineeringStudent extends Student{
    protected String branch;
    protected static int engineeringStudentCount = 0;

    public EngineeringStudent() {engineeringStudentCount++;}

    public EngineeringStudent(int rollNo, String name, String branch) {
        super(rollNo, name);
        accept(branch);
        engineeringStudentCount++;
    }

    public void accept(String branch) {
        this.branch = branch;
    }

    public void display() {
        System.out.println("Display method of EngineeringStudent class");
        System.out.println("Roll number: " + this.rollNo);
        System.out.println("Name: " + this.name);
        System.out.println("Branch: " + this.branch);
    }
}

 class CSE_Student extends EngineeringStudent{
    protected static int cseStudentCount = 0;
    protected String favouriteProgrammingLanguage;

    public CSE_Student() {cseStudentCount++;}

    public CSE_Student(int rollNo, String name, String favouriteProgrammingLanguage) {
        super(rollNo, name, "Computer Science & Engineering");
        this.accept(favouriteProgrammingLanguage);
    }

    public void accept(String favouriteProgrammingLanguage) {
        this.favouriteProgrammingLanguage = favouriteProgrammingLanguage;
    }

    public void display() {
        System.out.println("Display method of CSE_Student class");
        System.out.println("Roll No: " + this.rollNo);
        System.out.println("Name: " + this.name);
        System.out.println("Branch: " + this.branch);
        System.out.println("Favourite Programming Language: " + this.favouriteProgrammingLanguage);
    }

}

public class Main11 {
    public static void main(String[] args) {
        Student s1 = new Student(100, "rahul kumar");
        EngineeringStudent s2 = new EngineeringStudent(101, "shyam sharma", "Electrical Engineering");
        CSE_Student s3 = new CSE_Student(102, "kamlesh kumar", "JAVA");

        s1.display();
        s2.display();
        s3.display();
    }
}