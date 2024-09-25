import java.util.Scanner;
public class Main {
 public static void main(String[] args) {
 // Multidimensional array
 int [] marks; // A 1-D array
 int [][] flats; // A 2-D Array
 flats=new int [2][3]; //2 rows 3 column
 // 2 floors 3 home
 flats[0][0]=50;
 flats[0][1]=100;
 flats[0][2]=200;
 flats[1][0]=1000;
 flats[1][1]=2000;
 flats[1][2]=3000;
 //Displaying array using array
 System.out.println("Printing the 2-D array using for loop");
 for(int i=0;i<flats.length;i++) {
 for (int j=0;j<flats[i].length;j++) {
 System.out.print(flats[i][j]);
 System.out.print(" ");
 }
 System.out.println("");
 }
 }
}