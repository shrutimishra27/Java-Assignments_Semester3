public class Thread17{
 
public static void main(String[] args) {
 Runnable r1 = new Runnable() {
 public void run(){
 for (int i = 0; i <= 100; i++) {
 System.out.println("hello child thread" +i + " the thread address " 
+Thread.currentThread().hashCode());
 try{
 Thread.sleep((long) 0.5);
 }
 catch(InterruptedException e){
 System.out.println("Sleep inter");
 }
 }
 }
 };
 Thread t1 = new Thread(r1);
 t1.start();
 for (int i = 0; i <= 50; i++) {
 System.out.println("hello main thread" +i+ "from main thread address " + 
Thread.currentThread().hashCode());
 try{
 Thread.sleep(1);
 }
 catch(InterruptedException e){
 System.out.println("Sleep inter");
 }
 }
 t1.interrupt();
 }
}