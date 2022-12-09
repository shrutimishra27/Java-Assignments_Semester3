 
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Encrypt{
 	static int encrypt(int data , int key){
 		 data = data +key;
		 return data;
 }

 public static void main(String[] args) {

 FileInputStream fin = null;
 FileOutputStream fout = null;

 try {
 fin = new FileInputStream("sample.txt");
 fout = new FileOutputStream("enc.txt");
 int data =0;
 
 while(fin.available() >0){
 data = fin.read();
 fout.write((char)(encrypt(data, 3)));
 }
 } catch (Exception e) {
 System.out.println(e);
 }
System.out.println("DATA IS ENCRYPTED");
 }
}