class PassByReference7{

    String name="Java";
    void display(PassByReference7 p)
    {
        name="Java Programming";
    }
    public static void main(String arg[])
    {
        PassByReference7 p=new PassByReference7();
        System.out.println("Before changes : "+p.name);
        p.display(p);
        System.out.println("After changes : "+p.name);
    }
}