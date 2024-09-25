import java.util.Scanner;
public class Main {
 public static void main(String[] args) {
 //break and continue statement using loop
// for(int i=0;i<=10;i++){
// System.out.println(i);
// System.out.println("Java is Best");
// if(i==5){
// System.out.println("Ending the loop");
// break;
// }
// i++;
// }
// System.out.println("Ending loop");
 // continue statement
 for(int i=0;i<10;i++){
 System.out.println("Inside loop "+i);
 if (i==5){
 System.out.println("Continue statement");
 continue;
 }
 System.out.println("Ending the loop");
 }
 // continue of do while
 int i=0;
 do{i++;
 System.out.println(i);
 if(i==2){
 System.out.println("Continue");
 continue;
 }
 }while ((i<5));
 }
}