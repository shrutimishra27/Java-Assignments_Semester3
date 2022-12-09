interface Printable{  
	void print();  
}  

interface Showable{  
	void show();  
}  

class Main14 implements Printable,Showable{  

public void print(){System.out.println("JAVA");}  
public void show(){System.out.println("THE KING OF PROGRAMMING");}  
  
public static void main(String args[]){  
Main14 obj = new Main14();  
obj.print();  
obj.show();  
 }  
}  