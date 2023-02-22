package Excersice1;
import java.util.Scanner;


public class MeetAnAgent {
    final static int PASSWORD = 133976; //You can change pass, but don't change the type

    public static void main(String[] args) {
        //put you code here
        Scanner sc = new Scanner(System.in);
        Integer input = sc.nextInt(); // entrada de cadena
      
         
    if(input == PASSWORD) {
        System.out.println("Hello, Agent");
      } else {
        System.out.println("Access denied");
      }
        
    }
}
