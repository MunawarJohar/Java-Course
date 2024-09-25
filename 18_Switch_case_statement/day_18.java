import java.util.Scanner;
public class Main {
 public static void main(String[] args) {
 //if else clause
 int age;
 System.out.println("Enter Your age");
 Scanner sc=new Scanner(System.in);
 age=sc.nextInt();
// if(age>55){
// System.out.println("You are old man");
// }
// else if( age<35 && age>18){
// System.out.println("You are young man ");
// }
// else if (age<3){
// System.out.println("You are baby ");
// }
// else {
// System.out.println("You are a good man ");
// }
// //Switch statement
// switch (age){
// case 18:
// System.out.println("Your are going to become adult !");
// break;
// case 60:
// System.out.println("Your are old man");
// break;
// case 30:
// System.out.println("Your age is good");
// break;
// default:
// System.out.println("You are a java programmer");
// }
 char ch='m';
 switch (ch){
 case 'n':
 System.out.println("Nadeem");
 break;
 case 'm':
 System.out.println("Munawar");
 break;
 case 'A':
 System.out.println("Ali");
 break;
 default:
 System.out.println("Hello programmer");
 }