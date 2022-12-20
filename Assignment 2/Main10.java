 class Employee {
    protected int ID;
    protected String name;
    protected static int employeeCount = 0;

    public Employee() {
        System.out.println("Employee created");
        System.out.println("ID and names are not initialized.");
        employeeCount++;
    }

    public Employee(int ID, String name) {
        accept(ID, name);
        employeeCount++;
    }

    public void accept(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public void display() {
        System.out.println("Employee ID: " + this.ID);
        System.out.println("Employee Name: " + this.name);
    }
}

 class Engineer extends Employee{
    protected String company;
    protected int engineerCount = 0;

    public Engineer() {
        engineerCount++;
    }

    public Engineer(int ID, String name, String company) {
        super(ID, name);
        accept(company);
        engineerCount++;
    }

    public void accept(String company) {
        this.company = company;
    }

    public void display() {
        super.display();
        System.out.println("Company: " + this.company);
    }
}

 class Teacher extends Employee{
    protected String school;
    protected int teacherCount = 0;

    public Teacher() {
        teacherCount++;
    } 

    public Teacher(int ID, String name, String school) {
        super(ID, name);
        accept(school);
        teacherCount++;
    }

    public void accept(String school) {
        this.school = school;
    }

    public void display() {
        super.display();
        System.out.println("School: " + this.school);
    }
}

public class Main10 { 
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Ram");
        Teacher t1 = new Teacher(2, "Laxman", "KV");
        Engineer en1 = new Engineer(2, "Shyam", "Google");

        e1.display();
        t1.display();
        en1.display();
    }
}