import java.util.Scanner;
public class Main {
 public static void main(String[] args) {
 System.out.println("Enter Your mark of Subjects Operating system, 
Computer networks, Software Engineering, DBMS,and Artifical Intelligences : 
");
 Scanner marks=new Scanner(System.in);
 System.out.println("Enter marks of your subject 1 OS :");
 float osmarks=marks.nextFloat();
 System.out.println("Enter marks of your subject 2 CN");
 float cn=marks.nextFloat();
 System.out.println("Enter marks of your subject 3 Software Engineering 
:");
 float sf=marks.nextFloat();
 System.out.println("Enter marks of your subject 4 DBMS:");
 float db=marks.nextFloat();
 System.out.println("Enter marks of your subject 5 Artificail Intelligence 
:");
 float ai=marks.nextFloat();
 float percentage=osmarks+cn+sf+db+ai/500*100;
 float obtainmarks=osmarks+cn+sf+db+ai;
 float total=500;
 System.out.println(" Result Sheet 
");
 System.out.println("Name : Munawar Hussain 
Reg No: 2020-uobs-148");
 System.out.print("Total Marks is :");
 System.out.print(total);
 System.out.print(" obtain 
marks is:");
 System.out.println(obtainmarks);
 System.out.println("Percentage is :");
 System.out.print(percentage);
 
}
}
