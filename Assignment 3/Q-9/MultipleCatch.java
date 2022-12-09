class MultipleCatch{

	public static void main(String[] args){
		
		System.out.println("Start of main");
		try{
			int number1 = Integer.parseInt(args[0]);
			int number2 = Integer.parseInt(args[1]);
			String name = null;
			if(name == null) 
				throw new NullPointerException();
			int number3 = number1 / number2;
			System.out.println(number1 + "\t" + number2 + "\t" + number3);

		}
		catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
			System.out.println("Please provide command line argument!!");
		}catch(ArithmeticException e){ 
			 System.out.println("A number cannot be divided by zero"); 
		}catch(NumberFormatException e){
			System.out.println("Only integer argumnet required!!!");
		}catch(RuntimeException e){
			System.out.println(e);
		}catch(Exception e){
			System.out.println("Null Reference");
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e);
		}
		finally{
			System.out.println("finally block");
		}
		
		System.out.println("End of main");
	}
}