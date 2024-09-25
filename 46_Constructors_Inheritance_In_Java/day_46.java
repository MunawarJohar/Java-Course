import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;
class Base{
 Base(){
 System.out.println("I am a Constructor :");
 }
 Base(int a){
 System.out.println("I am a constructor with value of "+a);
 }
}
class derived1 extends Base {
 derived1() {
 System.out.println("I am Derived constructor");
 }
 derived1(int a, int b){
 System.out.println("The value of is "+a+" The value of b is "+b);
 }
}
class childDerived extends derived1{
 childDerived(){
 System.out.println("I am chidDerived constructor:");
 }
 childDerived(int a, int b,int c){
 System.out.println("print "+a+b+c);
 }
}
public class Main {
 public static void main (String [] args) {
// Base b = new Base();
 // in derived first run base constructor and than run derived 
constructor
 derived1 d = new derived1();
 // constructor overloading
 Base b1=new Base(10);
 derived1 d2=new derived1(12,30);
 childDerived cd=new childDerived(2,4,3);
 }
}