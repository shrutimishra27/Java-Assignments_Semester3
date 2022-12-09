package basicoop;

public class SalesPerson extends Employee{
	
	private double sales;
	
	public SalesPerson(int h, float r, double s){
		super(h, r);
		sales = s;
	}

	public double getSales(){
		return sales;
	}

	public void setSales(double value){
		sales = value;
	}

	public double getNetIncome(){
		double income = super.getNetIncome(); //invoke Employee.getNetIncome, this
		if(sales >= 25000)
			income += 0.05 * sales;
		else
			income *= 0.99;
		return income;
	}
	
}















