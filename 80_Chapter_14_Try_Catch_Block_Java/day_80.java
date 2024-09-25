import java.util.Scanner;
public class Errors_Java {
 public static void main(String[] args) {
 int a=100;
 int b=0;
// // without Try
// int k=a/b;
// System.out.println("The resulr is :"+k);
 // With Try
 try {
 int c=a/b;
 }
 catch (Exception e) {
 System.out.println("We failed to divide . reason :");
 System.out.println(e);
 }
 System.out.println("End the program");
 }
}
