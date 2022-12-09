import basicoop.*;
import java.util.*;

class ArrayListTest{

	public static void main(String[] args){

		//ArrayList<String> store=new ArrayList<String>(); 
		List store = new ArrayList();
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

		Employee m = (Employee) store.get(store.size() / 2);
		System.out.println("ID of middle employee: " + m.getId());
	}
}




















