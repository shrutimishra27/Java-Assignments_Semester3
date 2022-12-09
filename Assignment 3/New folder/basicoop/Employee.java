package basicoop;

public class Employee implements Comparable{
	
	private int id;
	protected int hours;
	float rate;
	private static int count;
	
	public Employee(int h, float r){
		id = 101 + count++;
		hours = h;
		rate = r;
	}

	public Employee(){
		this(0, 0);
	}

	public Employee(int i, int h, float r){
		id = i;
		hours = h;
		rate = r;
	}

	public int getId(){
		return id;
	}

	public int getHours(){
		return hours;
	}

	public final void setHours(int value){
		hours = value;
	}

	public float getRate(){
		return rate;
	}

	public void setRate(float value){
		rate = value;
	}

	public double getNetIncome(){
		double income = hours * rate;
		int ot = hours - 180;
		if(ot > 0) income += 50 * ot;
		return income;
	}

	public static int countEmployee(){
		return count;
	}

	public String toString(){
		return id + " " + hours + " " + rate;
	}
	
	public int hashCode(){
		return id;
	}
	
	
	public boolean equals(Object other){
		if(other instanceof Employee){
			Employee that = (Employee) other;
			return (id == that.id) && (hours == that.hours) && (rate == that.rate);
		}
		return false;
	}

	public void finalize(){
		System.out.println("-- Reclaiming Employee with id " + id);
	}

	public int compareTo(Object other){
		Employee that = (Employee) other;
		if(this.hours != that.hours)
			return this.hours - that.hours;
		return this.id - that.id;
	}
}






















