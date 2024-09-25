import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;
import java.util.Random;
class Mythread extends Thread{
 public void run(){
 int i=0;
 while (i<50){
 System.out.println("I am a Thread");
 i++;
 }
 }
}
class Mythread2 extends Thread{
 public void run(){
 int i=0;
 while (i<50){
 System.out.println("Thanks");
 try {
 Thread.sleep(23);
 }catch (InterruptedException e) {
// System.out.println("I am a Thread2");
 e.printStackTrace();
 } i++;
 }
 }
}
public class Main {
 public static void main (String [] args) {
 Mythread th1=new Mythread();
 Mythread2 th2=new Mythread2();
 th1.start();
// th1.join();
// try {
// th1.join();
// }
// catch (Exception a){
// System.out.println(a);
// }
 // If we used joined method than run thread1 is complete after that 
thread2 is run
 th2.start();
 }
}