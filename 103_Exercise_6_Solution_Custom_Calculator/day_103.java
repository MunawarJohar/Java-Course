import javax.naming.CannotProceedException;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.time.LocalTime;
class InvalidInputException extends Exception{
 @Override
 public String toString(){
 return "Cannot add 8 and 9";
 }
}
class Custom_calculator{
 double add(double a,double b) throws InvalidInputException{
 if(a==8|| b==9) {
 throw new InvalidInputException();
 }
 return a+b;
 }
 double subtract(double a,double b){
 return a-b;
 }
 double multiple(double a,double b){
 return a*b;
 }
 double divide(double a,double b) throws CannotProceedException {
 if(b==0){
 throw new CannotProceedException();
 }
 return a/b;
 }
}
public class NewTask {
 public static void main(String[] args) {
 Custom_calculator custom=new Custom_calculator();
 custom.divide(20,10);
 }
}