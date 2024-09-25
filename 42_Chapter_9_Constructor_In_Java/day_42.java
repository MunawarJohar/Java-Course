import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;
import java.util.Random;
class Our_Students {
 private String name;
 private int fees;
 private int ID;
 public Our_Students(){ //constructor overloading
 ID=144;
 name="Kamal";
 }
 // Quick Quiz
 public Our_Students(String Name,int My_id){
 ID=My_id;
 name=Name;
 }
 public Our_Students(String n, int id,int fee){
 name=n;
 ID=id;
 fees=fee;
 }
 public int getFees(){
 return fees;
 }
 public void setID(int id) {
 ID = id;
 }
 public void Setname(String n) {
 this.name = n;
 }
 public String getName() {
 return name;
 }
 public int getID() {
 return ID;
 }
}
public class Main {
 public static void main(String[] args) {
 // Constructor in Java
// Our_Students std=new Our_Students("munawar Hussain",148);
 Our_Students std=new Our_Students(); // constructor overloading 
without passing argument
 System.out.println(std.getID());
 System.out.println(std.getName());
 // Quiz Question
 Our_Students quiz=new Our_Students("Munawar Hussain",148,5000);
 System.out.println(quiz.getID());
 System.out.println(quiz.getName());
 System.out.println(quiz.getFees());
 }
}
