class InvalidBOXException extends Exception
{
	
	InvalidBOXException(String msg)
	{
		super(msg);
		System.out.println("Invalid BOX due to either length or width or height less than zero");
	}
}
class BOX
{
	private double length;
	private double width;
	private double height;

	BOX(double l, double w, double h) throws InvalidBOXException
	{
		if( l <=0 || w <= 0 || h <= 0)
			throw new InvalidBOXException("Invalid Box");
		length = l;
		width = w;
		height = h;
	}
	double getLength() { return length; }
	double getWidth()  { return width;  }
	double getHeight() { return height; }

	double area()   { return 2*(length*width + width*height + height*length); }
	double volume() { return length*width*height ; }
}
class ExceptionTest
{
	public static void  main(String args[])
	{
		try{
			BOX b2 = new BOX(10,4,5);
			System.out.println("Area of b2(10, 4, 5):"+b2.area());
			BOX b1 = new BOX(0,0,0);
		
			
		}catch(InvalidBOXException ib){System.out.println("Attempt to create Invalid Box ! failed");}
	}
}
