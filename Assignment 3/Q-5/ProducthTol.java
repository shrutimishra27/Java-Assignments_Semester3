import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

class Product implements Serializable{
 protected int pId;
 protected String pName;
 protected int pRate;
 static int count;
 {
 count++;
 }
 public static void getProductCount(){ System.out.println(count);}
 public String getName(){return pName; }
 public void setpName(String pName){ this.pName= pName;}
 public int getpId(){ return pId;}
 public void setpId( int id){ pId = id;}
 public int getpRate(){return pRate;}
 public int getCount(){ return count;}
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
public class ProducthTol {
 public static void main(String[] args) {
 try {
 FileInputStream fileIn = new FileInputStream("ProductDetails.dat");
 ObjectInputStream objIn = new ObjectInputStream(fileIn);
 
 Product newPr = (Product) objIn.readObject();
 Product newPr1 = (Product) objIn.readObject();
 Product newPr2 = (Product) objIn.readObject();
 System.out.println(" Product Name: " + newPr.getName());
 System.out.println(" Rate: " + newPr.getpRate());
 System.out.println(" Product Name: " + newPr1.getName());
 System.out.println(" Rate: " + newPr1.getpRate());
 System.out.println(" Product Name: " + newPr2.getName());
 System.out.println(" Rate: " + newPr2.getpRate());
 objIn.close();
 }
 catch (Exception e) {
 e.getStackTrace();
 }
 }
}