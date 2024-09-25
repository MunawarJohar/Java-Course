import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;
import java.util.Random;
interface Camera{
 void takeSnap();
 void RecordVideo();
 // we can default method define then do not require to used in class
 default void CapturePicture(){
 System.out.println("default Capturing Picture .....");
 }
 private void privateCamera(){
 System.out.println("Private is not accessible in another class or 
main ");
 }
}
interface wifi{
 String [] getNetwork();
 void connectToNetwork(String network);
}
class MycellPhone{
 void cellNumber(int phoneNumber){
 System.out.println("Calling.... "+phoneNumber);
 }
 void pickCall(){
 System.out.println("Connnecting ....");
 }
}
class SmartPhone extends MycellPhone implements wifi,Camera{
 public void takeSnap(){
 System.out.println("Taking snap");
 }
 public void RecordVideo(){
 System.out.println("Recording ......");
 }
 public String[] getNetwork(){
 System.out.println("Getting list of Network");
 String[] networkList={"Munawar","Raziq","Kama1122"};
 return networkList;
 }
 public void connectToNetwork(String network){
 System.out.println("Connecting to"+network);
 }
 public void CapturePicture(){
 System.out.println("Please Capture the Picture.....");
 }
}
public class Main {
 public static void main (String [] args) {
 SmartPhone ms=new SmartPhone();
 String[] ar=ms.getNetwork();
 for(String item:ar){
 System.out.println(item);
 }
 ms.CapturePicture();
 }
}
