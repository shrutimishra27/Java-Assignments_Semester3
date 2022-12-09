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

public class TreeSet {
 public static void main(String[] args) {
 Comparator cmp = new Comparator() {
 public int compare(Object first , Object second){
 Product pd1 = (Product) first;
 Product pd2 = (Product) second;
 return pd1.getpId() - pd2.getpId();
 }
 };
 Set s = new TreeSet<>(cmp);
 s.add(new Product("B" , 100 , 11));
 s.add(new Product("A", 1000 , 12));
 s.add(new Product("D" , 100, 13));
 s.add(new Product("D" , 100, 13));
 
 Iterator itr=s.iterator(); 
 while(itr.hasNext()) 
 { 
 System.out.println(itr.next()); 
 } 
 }
}