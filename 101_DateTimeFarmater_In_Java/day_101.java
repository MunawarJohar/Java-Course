import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.time.LocalTime;
public class NewTask {
 public static void main(String[] args) {
 // Date time farmater
 LocalDateTime datetime=LocalDateTime.now();
 System.out.println(datetime);
 // My code time
 //2023-02-25T19:33:19.937627100
 DateTimeFormatter dateFarmeter=DateTimeFormatter.ofPattern("dd-mmyyyy");
 DateTimeFormatter date2=DateTimeFormatter.ISO_LOCAL_DATE;
 String mylist=dateFarmeter.format(datetime);
 System.out.println(mylist);
 }
}