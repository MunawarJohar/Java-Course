import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;
import java.util.Random;
interface Bicycle{
 int m=100; // by default this variable is public in interfaces
 void applyBrake(int decrement);
 void speedUp(int increment);
}
interface HornBicycle{
 void blowHornk3g();
 void blogHorn();
}
class AvonCycle implements Bicycle,HornBicycle{
 int k=100; 
 void BlowHorn(){
 System.out.println("Peep Pop Peep up");
 }
 public void applyBrake(int decrement){
 System.out.println("Applying Brake");
 }
 public void speedUp(int increment){
 System.out.println("Applyinh speed up");
 }
 public void blowHornk3g(){
 System.out.println("Blow horn");
 }
 public void blogHorn(){
 System.out.println("Blog Horn");
 }
}
public class Main {
 public static void main (String [] args) {
 AvonCycle Anmunwar=new AvonCycle();
 Anmunwar.applyBrake(1);
 // you can create properties in interface
 System.out.println(Anmunwar.m);
 //you cannot modify the properties in interfaces as they are final
// Anmunwar.m=200; // error is occur
// System.out.println(Anmunwar.m);
 Anmunwar.blogHorn();
 Anmunwar.BlowHorn();
 System.out.println(Anmunwar.k);
 }
}