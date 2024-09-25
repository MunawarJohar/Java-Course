import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;
import java.util.Random;
class MythreadRunnnable1 implements Runnable{
 public void run(){
 int i=0;
 while (i<20) {
 System.out.println("I am a Thread not a threat");
 i++;
 }
 }
}
class MythreadRunnnable2 implements Runnable{
 public void run(){
 int j=0;
 while (j<20) {
 System.out.println("I am a Thread2 not a threat");
 j++;
 }
 }
}
public class Main {
 public static void main (String [] args) {
 MythreadRunnnable1 r1=new MythreadRunnnable1();
 Thread t1=new Thread(r1);
 MythreadRunnnable2 r2=new MythreadRunnnable2();
 Thread t2=new Thread(r2);
 t1.start();
 t2.start();
 }
}