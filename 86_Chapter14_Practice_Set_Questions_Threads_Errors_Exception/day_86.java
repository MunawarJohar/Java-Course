import java.security.PublicKey;
import java.util.Scanner;
public class Errors_Java {
 public static void main (String[]args){
//
// // Question 1
// // int a=7 // syntax error because semicolon is missed
//
//
// int age=78;
// int year_born=2000-78; // logical error
//// System.out.println(10/0);
// // Question 2
// try {
// int a=877/0; // print hehe
//
//// int b=666/9; // print haha
// }catch (IllegalArgumentException e){
// System.out.println("Haha");
// }catch (ArithmeticException e){
// System.out.println("Hehe");
// }
 // Question 3
 boolean flag=true;
 int [] marks=new int[3];
 marks[0]=99;
 marks[1]=100;
 marks[2]=120;
 Scanner sc=new Scanner(System.in);
 int index;
 int i=0;
 while (flag && i<5){
 try {
 System.out.println("Enter the value of index: ");
 index=sc.nextInt();
 System.out.println("The value of marks[index] is 
"+marks[index]);
 break;
 }catch (Exception e){
 System.out.println("Invalid Index");
 i++;
 }
if(i>=5){
 System.out.println("Error...");
 }
 }
 }
 }
