class NestedTryCatch
{
    public static void main(String arg[])
    {
        int arr[]=new int[5];
        try
        {
            
            try
            {
                System.out.println("Divide 1");
                int b=23/0;
            }
            catch(ArithmeticException e)
            {
                System.out.println(e);
            }
            try
            {
                arr[7]=10;
                int c=22/0;
                System.out.println("Divide 2 : "+c);
            }
            catch(ArithmeticException e)
            {
                System.out.println("Err:Divide by 0");
            }
            catch(ArrayIndexOutOfBoundsException e) 
         
            {
                System.out.println("Err:Array out of bound");
            }
        }
        catch(Exception e)
        {
            System.out.println("Handled");
        }
    }
}