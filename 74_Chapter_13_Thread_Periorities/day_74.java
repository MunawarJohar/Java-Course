import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;
import java.util.Random;
class Mythreads extends Thread{
 public Mythreads(String name){
 super(name);
 }
 public void run(){
 int i=0;
 while (i<50){
 System.out.println("I am a Thread: "+this.getName());
 i++;
 }
 }
}
public class Main {
 public static void main (String [] args) {
 Mythreads th1=new Mythreads("Kamal");
 Mythreads th2=new Mythreads("Thread2");
 Mythreads th3=new Mythreads("Jamal");
 Mythreads th4=new Mythreads("Munawar(most important)");
 th4.setPriority(Thread.MAX_PRIORITY);
 th1.setPriority(Thread.MIN_PRIORITY);
 th1.start();
 th2.start();
 th3.start();
 th4.start();
 }
}
