import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;
class MyStudents{
 private int ID;
 private String name;
 public void setID(int id){
 ID=id;
 }
 public void Setname(String n){
 this.name=n;
 }
 public String getName(){
 return name;
 }
 public int getID(){
 return ID;
 }
}
public class Main {
 public static void main(String[] args) {
 MyStudents mstd=new MyStudents();
// mstd.ID=148;
// mstd.name="Munawar"; // ....> it give error we can not access 
private data
 mstd.setID(148);
 mstd.Setname("Munawar");
 System.out.print("My Registration number is :");
 System.out.println(mstd.getID());
 System.out.print("My Name is :");
 System.out.println(mstd.getName());
 }
}