import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;
import java.util.Random;
class Mythread extends Thread{
 @Override
 public void run(){
 int i=1;
 while (i<20) {
 System.out.println("My Thread is Running.. ");
 System.out.println("During coking");
 i++;
 }
 }
}
class Mythread2 extends Thread{
 @Override
 public void run(){
 int j=0;
 while (j<10) {
 System.out.println("My Thread2 is Running.. ");
 System.out.println("During Coding ");
 j++;
 }
 }
}
public class Main {
 public static void main (String [] args) {
 Mythread th1=new Mythread();
 Mythread2 th2=new Mythread2();
 th1.start();
 th2.start();
// func1(); -----> th
// func2();------> th
 // Some other lones of code
 }
}