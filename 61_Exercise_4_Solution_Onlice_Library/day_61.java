import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;
import java.util.Random;
class Library{
 String[] books;
 int no_of_books=0;
 Library(){
 this.books=new String[100];
 this.no_of_books=0;
 }
 void addBook(String book){
 this.books[no_of_books]=book;
 no_of_books++;
 System.out.println(book+" Has been Added !");
 }
 void ShowAvailableBooks(){
 System.out.println("Available Books Are :");
 for (String book: this.books) {
 if(book==null){
 continue;
 }
 System.out.println("*"+book);
 }
 }
 void IssueBook(String book){
 for (String b: this.books) {
 for (int i = 0; i < this.books.length; i++) {
 if (this.books[i].equals(book)) {
 System.out.println("The book has been issued");
 this.books[i] = null;
 return;
 }
 }
 System.out.println("*" + book);
 }
 System.out.println("This book is not exist...");
 }
 void ReturnBook(String book){
 addBook(book);
 }
 }
public class Main {
 public static void main (String [] args) {
 Library mLibrary=new Library();
 mLibrary.addBook("This is a book");
 mLibrary.addBook("C++");
 mLibrary.addBook("Python");
 mLibrary.addBook("Scratch");
 mLibrary.ShowAvailableBooks();
 mLibrary.IssueBook("C++");
 mLibrary.addBook("Django by Munawar");
 mLibrary.ShowAvailableBooks();
 mLibrary.ReturnBook("C++");
 mLibrary.ShowAvailableBooks();
 }
}