import java.io.*;
import java.util.*;
class Product implements Serializable{
 protected int pId;
 protected String pName;
 protected int pRate;
 static int count;
 {
 count++;
 }
 public static void getProductCount(){
 System.out.println(count);
 }
 public String getName(){
 return pName;
 }
 public void setpName(String pName){
 this.pName= pName;
 }
 public int getpId(){
 return pId;
 }
 public void setpId( int id){
 pId = id;
 }
 public int getpRate(){
 return pRate;
 }
 // return total number of id created
 public int getCount(){
 return count;
 }
 public Product(String name , int rate , int id){
 pName = name;
 pRate = rate;
 pId = id;
 }
 public String toString(){
 return " Product id is " + pId + " name is " +pName ;
 }
 
 public Product() {
 }
}

public class ArrayList {
 public static void main(String[] args) {
 // Scanner sc = new Scanner(System.in);
 ArrayList list = new ArrayList();
 Product p1 = new Product("RAJ" , 100 , 11);
 Product p2 = new Product("SHYAM", 1000 , 12);
 Product p3 = new Product("RAM" , 100, 13);
 list.add(p1);
 list.add(p2);
 list.add(p3);
 
 Iterator i = list.iterator();
 while (i.hasNext()) {
 System.out.println(i.next());
 }
 if(list.contains(p1)){
 System.out.println("YES Founded");
 }
 }
}