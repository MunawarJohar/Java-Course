import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;
class base{
 int x;
 public int getX() {
 System.out.println("I am getting x :");
 return x;
 }
 public void setX(int x) {
 System.out.println("I am setting x :");
 this.x = x;
 }
 public void DipslayMe(){
 System.out.println("Hello I am DisplayME Function.");
 }
}
class Derived extends base{
 int y;
 public int getY() {
 return y;
 }
 public void setY(int y) {
 this.y = y;
 }
}
// Quick Quiz
class Animal{
 String name;
 int types=5;
 public Animal(){
 this.name="Cat";
 this.types=5;
 }
 public void animalDisplay(){
 System.out.println(name);
 }
}
class dog extends Animal{
 public void dog() {
 System.out.println("I am Dog");
 }
}
public class Main {
 public static void main(String[] args) {
 // creating an object for base class
 base b= new base();
 b.setX(5);
 System.out.println(b.getX());
 // creating an object for base class
 Derived d=new Derived();
 d.setX(10);
 System.out.println(d.getX());
 d.setY(30);
 System.out.println(d.getY());
 Animal ani=new Animal();
 ani.animalDisplay();
 dog dag=new dog();
 }
}
