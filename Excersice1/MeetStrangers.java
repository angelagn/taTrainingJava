package Excersice1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class MeetStrangers {
    public static void main(String[] args) throws IOException {
        //Write a program, asks for a number - amount of strangers to meet.
        //Then reads stranger names line by line and prints line by line "Hello, ...".*/
        Scanner sc = new Scanner(System.in);
        Integer input = sc.nextInt(); 
        
        if (input == 0) {
             System.out.println("Oh, it looks like there is no one here");
        } else if (input< 0) {
            System.out.println("Seriously? Why so negative?");
        } else {
            List<String> elementos = new ArrayList<>();
            for (int i = 0; i <= input; i++){
                String stranger = sc.nextLine();
                elementos.add(stranger); 
            }
            for (int i = 1; i <= input; i++){
                System.out.println("Hello, " + elementos.get(i));
            }
        }    
    }   
}
