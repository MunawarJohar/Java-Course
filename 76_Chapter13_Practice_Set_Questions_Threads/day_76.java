import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;
import java.util.Random;
// Question 1
class goodMorning extends Thread{
 public void run(){
 int i=0;
 while (i<10) {
 System.out.println("Good Morning ");
 i++;
 }
 }
}
class welcome extends Thread{
 public void run() {
 int j = 0;
 while (j < 10) {
 try {
 Thread.sleep(200);
 }
 catch (Exception e) {
 System.out.println(e);
 }
 System.out.println("Well come to my code. ");
 j++;
 }
 }
}
public class Main {
 public static void main (String [] args) {
 // Question
 goodMorning goodt=new goodMorning();
 welcome wellt=new welcome();
 goodt.setPriority(5); // normal priority
 wellt.setPriority(10);//max priority
 System.out.println(goodt.getPriority());
 System.out.println(wellt.getPriority());
 goodt.start();
 wellt.start();
 System.out.println("Wel come state is :"+wellt.getState());
 System.out.println(" Good morning state is :"+goodt.getState());
 System.out.println(Thread.currentThread().getState());
 }
}
