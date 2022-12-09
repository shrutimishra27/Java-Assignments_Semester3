class ReturningValue7{

    int n1,n2;
    void getValue(int a,int b)
    {
        n1=a;
        n2=b;
    }
    int returnMax()
    {
        return n1>n2?n1:n2;
    }
    public static void main(String arg[])
    {
        ReturningValue7 R=new ReturningValue7();
        R.getValue(12,50);
        System.out.println("Maximum is : "+R.returnMax());
    }
}