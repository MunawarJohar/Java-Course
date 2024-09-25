import java.util.Scanner;
public class Errors_Java {
 public static void main(String[] args) {
 // syntax error
// int a=5 // Error no semicolon
// d=100; // error produce because d is not declared
 // Logical error demo
 //all prime number 1 t0 10
// System.out.println(2);
// for(int i=1;i<5;i++){
// System.out.println(2*i+1);
// }
 // Runtime error
 int input;
 System.out.println("Enter your number except 0:");
 // if you enter 0 than throw exception
 Scanner sc=new Scanner(System.in);
 input=sc.nextInt();
 System.out.println("Integer part of 1000 divided by input is 
"+1000/input);
 }
}