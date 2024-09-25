import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;
class Phone{
 public void name(){
 System.out.println("I am Phone class in java");
 }
 public void great(){
 System.out.println("Hello Every one good morning");
 }
}
class SmartPhoneo extends Phone {
 public void name(){
 System.out.println("I am SmartPhone Class in java");
 }
 public void welcome(){
 System.out.println("Welcome to my notes ");
 }
}
public class Main {
 public static void main (String [] args) {
// Phone p=new Phone();
// SmartPhoneo sp=new SmartPhoneo();
// p.name();
 Phone obj=new SmartPhoneo(); // It is allowed
 // SmartPhoneo objs=new Phone(); // This is not allowed
 obj.great();
 obj.name();
 // obj.welcome(); // It is not allowed because this method is 
belong to SmartPhone 
 }
}
