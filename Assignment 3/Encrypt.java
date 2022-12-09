import java.io.FileInputStream;
import java.io.FileOutputStream;

class Encrypt{

    static void encrypt(int data , int key){
        data = data +key;

    }

  //  static void decrypt(int data , int key){
  //    data = data - key;
  //  }
    
    public static void main(String[] args) {
        FileInputStream fin = null;
        FileOutputStream fout = null;
        try {
            fin = new FileInputStream("shruti.txt");
            fout = new FileOutputStream("Copy1.txt");
            int data =0;
            while(fin.available() >0){
                data = fin.read();
                encrypt(data, 3);
                System.out.print(data); // to get data in file

               //  decrypt(data, 3);
                fout.write(data);
            }
            
        } catch (Exception e) {
            System.out.println(e);

        }
        finally{
            try{
            fin.close();
            }catch(Exception e){

            }
        }
        
    }
}