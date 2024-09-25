import java.util.Scanner;
public class Main {
 public static void main(String[] args) {
 // Length of Array
 int [] mark={1,2,4,5,6,7,8,8};
// System.out.println(mark.length);
//
// // type is float
// float [] number={1.2f,3.2f,4.0f};
// System.out.println(number[2]);
//
// String [] std={"Ali","Munawar","Hussain"};
// System.out.println(std[1]);
 // Displaying Array elements ( native way )
//
// System.out.println(mark[0]);
// System.out.println(mark[1]);
// System.out.println(mark[2]);
// // Displaying Array elements ( for loop )
// for (int i=0;i<mark.length;i++){
// System.out.println(mark[i]);
// }
 // Quick Quiz
 // Displaying Array elements in reverse order ( for loop )
 System.out.println("Printing in reverse order");
 for (int i=mark.length-1;i>=0;i--){
 System.out.println(mark[i]);
 }
 String [] Students={"Munawar","Ali","hassan","Mir"};
 // printing using for each loops
 System.out.println("Printing element an array using for each loop");
 for(String element: Students){
 System.out.println(element);
 }
 }
}