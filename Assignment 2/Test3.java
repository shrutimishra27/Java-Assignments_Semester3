import java.util.*;

 class Employee {
    protected int ID;
    protected String name;
    protected static int count = 0;

    public Employee() {
        this.ID = 0;
        this.name = "Not assigned";
        Employee.count++;
    }

    public Employee(int ID, String name) {
        this.ID = ID;
        this.name = name;
        Employee.count++;
    }

    public Employee(Employee emp) {
        this.ID = emp.ID;
        this.name = emp.name;
        Employee.count++;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return this.ID;
    }

    public String getName() {
        return this.name;
    }

    public static int getCount() {
        return Employee.count;
    }

    public String toString() {
        return "ID: " + this.ID + "\tName: " + this.name;
    }

   
}

 class Teacher extends Employee {
    protected String qualification;

    public Teacher() {
        this.qualification = "not assigned";
    }

    public Teacher(int ID, String name, String qualification) {
        super(ID, name);
        this.qualification = qualification;
    }

    public String getQualification() {
        return this.qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String toString() {
        return super.toString() + "\tQualification: " + this.qualification;
    }
}

public class Test3 {
    public static void main(String[] args) {
        Employee emp1 = new Employee(10, "Ram");
        Employee emp2 = new Teacher(11, "Anand", "M.Tech");
        

        System.out.println("Employee 1: " + emp1.toString());
        System.out.println("Employee 2: " + emp2.toString());
        
    }
}