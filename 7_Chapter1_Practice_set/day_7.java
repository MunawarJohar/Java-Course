// 1. Write a program to sum three numbers in Java?
// Solution
import java.util.Scanner;
public class Main {
 public static void main(String[] args) {
 //question 1
 int a=20;
 int b=10;
 int c=30;
 int sum=a+b+c;
 System.out.println("The sum is ");
 System.out.println(sum);

// 2. Write a program to calculate CGPA using marks of three subjects (out of 100)?
// Solution

 float subj1=55;
 float subj2=60;
 float subj3=48;
 float cgpa=(subj1+subj2+subj3)/30;
 System.out.println("The Cgpa is :");
 System.out.println(cgpa);

// 3. Write a program to ask a user to enter his/her name and greets them with 
// “hello < name > have a good day “text?
// Solution

 //question 3
 System.out.println("What is your name ");
 Scanner sc=new Scanner(System.in);
 String name=sc.next();
 System.out.println("Hello "+name+" Have a good day!");

// 4. Write a program to convert kilometers to miles.
// Solution
// 5. Write a program to detect whether a number entered by user us integer or 
// not?
// Solution


 //question 5
 Scanner sc=new Scanner(System.in);
 System.out.println("Please type your number");
 boolean numbers=sc.hasNextInt();
 System.out.println(numbers);
 }
}