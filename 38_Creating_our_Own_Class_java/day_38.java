import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;
class student {
 int std_id;
 String name;
 int salary=30000;
 public int getSalary() {
 return salary;
 }
 public void printDetail(){
 System.out.println("Student id is "+std_id);
 System.out.println("Student name is "+name);
 }
}
public class Main {
 public static void main(String[] args) {
 // Java class
 System.out.println("This is our custom class");
 student std = new student(); //instantiating a new student object
 // setting properties
 std.std_id = 148;
 std.name = "Munawar";
 std.salary=100000;
 //printing the attribute
 System.out.println(std.std_id);
 System.out.println(std.name);
 System.out.println("The salary of munawar is"+std.getSalary());
 // calling printdetails method
 std.printDetail();
 // creating new object
 student newstd=new student();
 newstd.std_id=321;
 newstd.name="Kamal Ali";
 newstd.printDetail();
 System.out.println("The salary of kamal is 
:"+newstd.getSalary());
 }
 }
