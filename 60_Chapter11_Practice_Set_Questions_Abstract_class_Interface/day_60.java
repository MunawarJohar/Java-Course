import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;
import java.util.Random;
//// Questions 1
//abstract class Pen{
// abstract void Write();
// abstract void refill();
//}
//
//class FuontainPen extends Pen{
// void Write(){
// System.out.println("Write");
// }
// void refill(){
// System.out.println("Refill");
// }
// void ChangeNib(){
// System.out.println("Changing the nib");
// }
//}
// Question 3
class Monkey{
 void jump(){
 System.out.println("Jumping method");
 }
 void bite(){
 System.out.println("biting ..");
 }
}
interface BasicAnimal{
 void eat();
 void sleep();
}
class Human extends Monkey implements BasicAnimal{
 void speak(){
 System.out.println("Hello sir ..");
 }
 @Override
 public void eat() {
 System.out.println("Eating .....");
 }
 @Override
 public void sleep() {
 System.out.println("Sleeping .......");
 }
}
public class Main {
 public static void main (String [] args) {
// //Question 1
// FuontainPen pen=new FuontainPen();
// pen.ChangeNib();
// // Question 3
// Human hum=new Human();
// hum.sleep();
// hum.eat();
 // Question 5
 Monkey m1=new Human();
 //m1.speak() // Error is occur
 BasicAnimal kamal=new Human();
 //kamal.speak() // Error
 kamal.sleep();
 }
}