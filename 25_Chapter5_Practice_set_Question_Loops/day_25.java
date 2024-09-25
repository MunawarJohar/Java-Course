import java.util.Scanner;
public class Main {
 public static void main(String[] args) {
 //Chapter 5 practice set questions Loop
 //Question 1
// int n=5;
// for(int i=n;i>0;i--){
// for(int j=0;j<i;j++) {
// System.out.print("*");
// }
// System.out.println("\n");
// }
//
// //Question 2
// // using while loop
// int num=5;
// int s=0;
// int j=0;
// while (j<num)
// {
// s=s+(2*j);
// j++;
// }
//
// System.out.println("Sum of even number is ");
// System.out.println(s);
//
// // using for loop
//// int n=5;
//// int sum=0;
//// for(int i=0;i<n;i++){
//// sum =sum+(2*i);
//// }
//// System.out.println("Sum of even number is ");
//// System.out.println(sum);
// //Question 3
// int table=5;
// int number=10;
// for(int i=1;i<=number;i++){
// System.out.print(table);
// System.out.print(" X ");
// System.out.print(i);
// System.out.print("=");
// System.out.println(table*i);
// }
// //Question 4 In Reverse Order
// int t=5;
// for(int i=10;i>0;i--){
// System.out.print(t);
// System.out.print(" X ");
// System.out.print(i);
// System.out.print("=");
// System.out.println(t*i);
// }
 // Question 5
 //self question
// // Question 6
// int repeat=5;
// // Factorial 5!=5*4*2*1
// int k=1;
// int factorial=1;
// while (k<=repeat){
// factorial*=k;
// k++;
// }
// System.out.println(factorial);
 // Question 8
 // Answer is ture
 // Question 9
 int tab=5;
 int numb=10;
 int total_Sum=0;
 for(int i=1;i<=numb;i++){
 total_Sum+=tab*i;
 }
 System.out.println(total_Sum);
 }
}
