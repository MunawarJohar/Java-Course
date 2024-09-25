import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;
class A{
 public int ali(){
 return 148;
 }
 public void mathod2(){
 System.out.println("I a am method 2 of clasa A");
 }
}
class B extends A{
 public void method3(){
 System.out.println("I am constructor of class B and method 3");
 }
 @Override
 public void mathod2(){
 System.out.println("I a am method 2 of clasa B");
 }
}
public class Main {
 public static void main (String [] args) {
// A a=new A();
// a.mathod2();
//
// B b=new B();
// b.mathod2();
 B newB=new B();
 newB.mathod2();
 A newA=new A();
 newA.mathod2();
 }
}
