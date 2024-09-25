import java.util.Scanner;
public class Main {
 public static void main(String[] args) {
 //Question 1
// float [] marks={34.f,55,76.3f,99.9f};
// float sum=0;
// for (float element:marks) {
// sum=sum+element;
// }
// System.out.println("The value of sum is "+sum);
// //Question 2
// int [] mark={34,55,76,99};
// Scanner sc=new Scanner(System.in);
// System.out.println("Enter the number please that you want to check 
:");
// int num=sc.nextInt();
// boolean isInArray=false;
// for (int element:mark) {
// if (num==element){
// isInArray=true;
// break;
// }
// }
// if(isInArray) {
// System.out.println("The value is present in array");
// }
// else {
// System.out.println("The value is not present in array");
// }
 // Question 3
 float [] std_marks={34.f,55,76.3f,99.9f};
 float sum=0;
 for (float element:std_marks) {
 sum=sum+element;
 }
// System.out.println("The value of average marks is 
"+sum/std_marks.length);
// // Question 4
// int [] [] matric1={{1,2,3},{5,6,7}};
// int [] [] matric2={{2,4,6},{8,10,12}};
//
// int [][] result={{0,0,0},{0,0,0}};
//// for(int i=0;i<matric1.length;i++){ // row number of times
//// for(int j=0;j<matric1[i].length;j++){ // column number of 
time
//// System.out.format("Setting value fori=%d and j=%d 
\n",i,j);
//// result[i][j]=matric1[i][j]+matric2[i][j];
//
// for (int i=0;i<matric1.length;i++){
// for(int j=0;j<matric1[i].length;j++){ //column of times
// System.out.print(result[i][j]+" ");
// result[i][j]=matric1[i][j]+matric2[i][j];}
// System.out.println(" ");
// }
// // Question 5
//// float a=Math.floorDiv(5,2);
//// System.out.println(a);
// int [] arr={1,2,3,4,5,6,7};
// int l=arr.length;
// int temp;
// int n=Math.floorDiv(l,2);
// System.out.print("Before Reverse :");
// for (int element:arr){
//
// System.out.print(element+" ");
// }
// System.out.println("");
//
// for (int i=0;i<n;i++){
// //swap a[i] a [a-l-1-i]
// // a b temp
// //[][4][3]
// temp=arr[i];
// arr[i]=arr[l-1-i];
// arr[l-1-i]=temp;
//
// }
// System.out.print("After Reverse :");
// for (int element: arr){
// System.out.print(element+" ");
// }
// // Question 6
// int [] maxArr={1,2,3,4,6,7,10,15,20,35};
// int maximum=0;
// for(int element:maxArr){
// if(element>maximum){
// maximum=element;
// }
// }
//
// System.out.println("The value of the Maximum element of an array is 
: "+maximum);
//
// // Question 7
// int [] minArr={1,2,3,4,6,7,10,15,20,35};
// int min=35;
// int newMax=Integer.MAX_VALUE;
// int newMin=Integer.MIN_VALUE;
// for(int e:minArr){
// if(e<min){
// min=e;
// }
// }
//
// System.out.println("The value of the minimum element of an array is 
: "+min);
 // Question 8
 int [] sortArr={1,3,5,7,8,9};
 boolean isSorted=true;
 for(int i=0;i<sortArr.length-1;i++){
 if(sortArr[i]>sortArr[i+1]){
 isSorted=false;
 break;
 }
 }
 if(isSorted){
 System.out.println("The array is sorted:");
 }
 else {
 System.out.println("The give array is not sorted");
 }
 }
}
