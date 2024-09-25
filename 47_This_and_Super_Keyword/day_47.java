import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;
class Ekclass{
 int a;
 Ekclass(int x){
 this.a=x;
 // this is a reference
 }
 public int getA() {
 return a;
 }
 public int returnOne(){
 return 1;
 }
}
class twoclass extends Ekclass{
 twoclass(int c){
 super(c);
 System.out.println("mak ek constructor hon");
 }
}
public class Main {
 public static void main (String [] args) {
 Ekclass e=new Ekclass(15);
 System.out.println(e.getA());
 twoclass to=new twoclass(40);
 System.out.println(e.getA());
 }
}
}