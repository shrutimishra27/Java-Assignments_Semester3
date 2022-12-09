import basicoop.*;
import java.util.*;

class TreeSetTest1{

	public static void main(String[] args){

		Set store = new TreeSet();
		Employee manager = new Employee(220, 250);
		store.add(manager);
		store.add(new Employee(180, 150));
		store.add(new Employee(195, 85));
		store.add(new Employee(140, 160));
		store.add(manager);
		store.add(new Employee(140, 125));
		Iterator i = store.iterator();
		while(i.hasNext()){
			Employee emp = (Employee) i.next();
			System.out.println(emp + "\t" + emp.getNetIncome());
		}
	}
}




















