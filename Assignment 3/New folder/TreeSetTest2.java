import basicoop.*;
import java.util.*;

class TreeSetTest2{

	public static void main(String[] args){

		Comparator cmp = new Comparator(){
			public int compare(Object first, Object second){
				Employee fe = (Employee) first;
				Employee se = (Employee) second;
				if(fe.getRate() != se.getRate())
					return (int) (se.getRate() - fe.getRate());
				return fe.getId() - se.getId();
			}
		};
		Set store = new TreeSet(cmp);
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




















