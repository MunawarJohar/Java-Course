import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;
import java.util.Random;
class Mythread extends Thread{
 public Mythread(String name){
 super(name);
 }
 public void run(){
 int i=0;
 while (i<50){
 System.out.println("I am a Thread");
 i++;
 }
 }
}
public class Main {
 public static void main (String [] args) {
 Mythread mth=new Mythread("Munawar");
 Mythread th2=new Mythread("Kamal");
 mth.start();
 th2.start();
 System.out.println("The thread id id "+mth.getId());
 System.out.println("The thread name is :"+mth.getName());
 System.out.println("The thread2 id is:"+th2.getId());
 System.out.println("The name of thread2 is:"+th2.getName());
 }
