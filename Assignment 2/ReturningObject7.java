class ReturningObject7{

    int n1,n2;
    ReturningObject7(int a,int b)
    {
        n1=a;
        n2=b;
    }
    ReturningObject7 minNumber()
    {
        ReturningObject7 min=new ReturningObject7(50,30);
        return min;
    }
    public static void main(String arg[])
    {
        ReturningObject7 R1=new ReturningObject7(60,200);
        ReturningObject7 R2=R1.minNumber();
        int minR1=R1.n1<R1.n2?R1.n1:R1.n2;
        System.out.println("Minimum of (R1) "+R1.n1+" & "+R1.n2+" is "+minR1);
        int minR2=R2    .n1<R2.n2?R2.n1:R2.n2;
        System.out.println("Minimum of (R2) "+R2.n1+" & "+R2.n2+" is "+minR2);
    }
}