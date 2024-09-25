import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;
import java.util.Random;
interface SampleInterface{
 void meth1();
 void meth2();
}
interface childSampleInterface extends SampleInterface{
 void meth3();
 void meth4();
}
class MySampleClass implements childSampleInterface{
 public void meth3(){
 System.out.println("Meth 3");
 }
 public void meth4(){
 System.out.println("Meth 4");
 }
 public void meth1(){
 System.out.println("Meth 1");
 }
 public void meth2(){
 System.out.println("Meth 2");
 }
}
public class Main {
 public static void main (String [] args) {
 MySampleClass msc=new MySampleClass();
 msc.meth1();
 msc.meth2();
 msc.meth3();
 msc.meth4();
 }
}