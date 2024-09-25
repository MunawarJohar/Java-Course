import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;
import java.util.Random;
class C1{
 public int x=5;
 protected int y=42;
 int z=44;
 private int k=100;
 public void funct(){
 System.out.println("Class C1");
 System.out.println(x);
 System.out.println(y);
 System.out.println(k);
 System.out.println(z);
 }
}
public class Main {
 public static void main (String [] args) {
 C1 c1=new C1();
 c1.funct();
 System.out.println("Main class");
 System.out.println(c1.x);
 System.out.println(c1.y);
 System.out.println(c1.z);
// System.out.println(c1.k); // error occur because k is private
 }
}
