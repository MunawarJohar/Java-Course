import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;
import java.util.Random;
class Game{
 public int number;
 public int numberGuess;
 public int inputNumber;
 public void setNumberGuess() {
 Random rand=new Random();
 this.number =rand.nextInt();
 }
 public void setNumberGuess(int numberGuess) {
 this.numberGuess = numberGuess;
 }
 public int getNumberGuess() {
 return numberGuess;
 }
 Game(){
 Random rand=new Random();
 this.number=rand.nextInt(100);
 }
 void takeUserInput(){
 System.out.println("Guess the number : ");
 Scanner sc=new Scanner(System.in);
 inputNumber=sc.nextInt();
 }
 boolean isCorrectNumber() {
 if (inputNumber == number) {
 return true;
 }
 else if(inputNumber<number){
 System.out.println("Too less .....");
 }
 else if(inputNumber>number){
 System.out.println("Too high .....");
 }
 return false;
 }
}
public class Main {
 public static void main (String [] args) {
 Game g=new Game();
 g.takeUserInput();
 boolean b=g.isCorrectNumber();
 System.out.println(b);
 }
}