import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;
import java.util.Random;
abstract class Base{
 public Base(){
 System.out.println("I am Constructor of Base");
 }
 public void sayHello(){
 System.out.println("Hello");
 }
 abstract public void greet();
 abstract public void greet2();
}
class Derived extends Base{
 @Override
 public void greet(){
 System.out.println("Good morning");
 }
 public void greet2(){
 System.out.println("Good morning greet 2");
 }
}
abstract class derived2 extends Base{
 public void good(){
 System.out.println("I am Good in good method");
 }
}
public class Main {
 public static void main (String [] args) {
 // derived2 derived=new derived2();
 // Derived der=new Derived(); // error is occur because it is 
//abstract class
 }
}