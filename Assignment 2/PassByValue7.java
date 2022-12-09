class PassByValue7{

    String name="java";
    void display(String name)
    {
        name="Java Programming";
    }
    public static void main(String arg[])
    {
        PassByValue7 p=new PassByValue7();
        System.out.println("Before changes : "+p.name);
        p.display("C++");
        System.out.println("After changes : "+p.name);
    }
}