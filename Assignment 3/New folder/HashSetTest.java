import basicoop.*;
import java.util.*;

class HashSetTest{

	public static void main(String[] args){

		Set store = new HashSet();
		Employee manager = new Employee(220, 250);
		store.add(manager);
		store.add(new Employee(180, 150));
		store.add(new Employee(195, 85));
		store.add(new Employee(140, 160));
		store.add(manager);
		Iterator i = store.iterator();
		while(i.hasNext()){
			Employee emp = (Employee) i.next();
			System.out.println(emp + "\t" + emp.getNetIncome());
		}
	}
}




















