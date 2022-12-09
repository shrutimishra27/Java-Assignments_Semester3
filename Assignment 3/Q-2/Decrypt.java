import java.io.FileInputStream;

public class Decrypt{
 
 static int decrypt(int data , int key){
 return data = data - key;
 }
 public static void main(String[] args) {
 FileInputStream fin = null;
 try {
 fin = new FileInputStream("enc.txt");
 
 int data =0;

 System.out.println("Decrypted Data is :");
 
while(fin.available() >0){
 data = fin.read();
 System.out.print((char)(decrypt(data, 3)));
 }
 
 } catch (Exception e) {
 System.out.println(e);
 }
 }
}
