import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;
import java.util.Random;
public class Main {
 public static void main(String[] args) {
 // Solution of Exercise 2
 Scanner scan = new Scanner(System.in);
 System.out.print("Enter 0 for Rock, 1 for Paper, 2 for scissor : ");
 int input = scan.nextInt();
 Random random = new Random();
 int computerInput = random.nextInt(3);
 if (input == computerInput) {
 System.out.println("The Match is Draw...");
 } else if (input == 0 && computerInput == 2 || input == 1 && 
computerInput == 0 || input == 1 && computerInput == 0) {
 System.out.println("Congratulation You are Win!");
 } else {
 System.out.println("Ops Computer are Win ...");
 }
 }
}
