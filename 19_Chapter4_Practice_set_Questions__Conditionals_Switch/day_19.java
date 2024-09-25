import java.util.Scanner;
public class Main {
 public static void main(String[] args) {
// //question 1
// int a=18;
// if(a=20){
// System.out.println("It is equal to 20");
// }
// else {
// System.out.println("not equal to 20");
// }
// //Question 2
// byte m1,m2,m3;
// Scanner sc=new Scanner(System.in);
// System.out.println("Enter your Mark in Physics");
// m1=sc.nextByte();
//
// System.out.println("Enter your Mark in Biology ");
// m2=sc.nextByte();
//
// System.out.println("Enter your Mark in Computer");
// m3=sc.nextByte();
//
// float average=(m1+m2+m3)/3.0f;
// System.out.println("Your over all percentage"+average);
// if (average>4 && m1>=33 && m2>=33 && m3>=33){
// System.out.println("Congratulations , You have been promoted");
// }
// else {
// System.out.println("Sorry You have not been promoted Please try 
again ");
// }
// //Question 3
// Scanner sc=new Scanner(System.in);
// System.out.println("Enter your income");
// float income=sc.nextFloat();
// float tax=0;
// if (income<=2.5){
// tax=tax+0;
// }
// else if (income<2.5f && tax<=5f){
// tax=tax+0.05f*(income-2.5f);
// }
// else if (income<5f && tax<=10f){
// tax=tax+0.05f*(5.0f-2.5f);
// tax=tax+0.05f*(income-5f);
// }
// else if (income>10f){
// tax=tax+0.05f*(5.0f-2.5f);
// tax=tax+0.05f*(10.f-5f);
// tax=tax+0.05f*(income-10.0f);
// }
// System.out.println("The total tax paid by employee is "+tax);
//
// //Question 4
// Scanner sc=new Scanner(System.in);
// System.out.println("Enter 1 to 7 --");
// int day=sc.nextInt();
// switch (day){
// case 1:
// System.out.println("Monday");
// break;
// case 2:
// System.out.println("Tuesday");
// break;
// case 3:
// System.out.println("Wednesday");
// break;
// case 4:
// System.out.println("Thursday");
// break;
// case 5:
// System.out.println("Friday");
// break;
// case 6:
// System.out.println("Saturday");
// break;
// case 7:
// System.out.println("Sunday");
// break;
// default:
// System.out.println("No day");
// }
 //Question 6
 Scanner sc=new Scanner(System.in);
 String website=sc.next();
 if (website.endsWith(".com")){
 System.out.println("This is a commercial website");
 }
 else if (website.endsWith(".pk")){
 System.out.println("This is a Pakistani website");
 }
 else if (website.endsWith(".org")){
 System.out.println("This is an Organizational website");
 }
 else {
 System.out.println("No website");
 }
 }
}