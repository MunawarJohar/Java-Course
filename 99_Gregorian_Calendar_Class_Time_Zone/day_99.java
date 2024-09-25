import java.lang.reflect.Array;
import java.util.*;
public class NewTask {
 public static void main(String[] args) {
 // Greogorian Class in java
 Calendar cal=Calendar.getInstance();
 // current time
 System.out.println(cal.getTime());
 // Date
 System.out.println(cal.get(Calendar.DATE));
 // Second
 System.out.println(cal.get(Calendar.SECOND));
 // hour
 System.out.println(cal.get(Calendar.HOUR));
 // Hour of day
 System.out.println("The current time is 
"+cal.get(Calendar.HOUR_OF_DAY)+":"+cal.get(Calendar.MINUTE)+":"+cal.get(Cale
ndar.SECOND));
 GregorianCalendar grecal=new GregorianCalendar();
 // 2023 Not a leap year
 System.out.println(grecal.isLeapYear(2023));
 // 2020 is a leap year
 System.out.println(grecal.isLeapYear(2020));
 // Time zone
 // GMT stand Greenwhich Mean time zone
 System.out.println(TimeZone.getAvailableIDs()[0]);
 System.out.println(TimeZone.getAvailableIDs()[1]);
 System.out.println(TimeZone.getAvailableIDs()[2]);
 System.out.println(TimeZone.getAvailableIDs()[3]);
 }
}