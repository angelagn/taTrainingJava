package Excersice1;

import java.io.IOException;
import java.util.Scanner;

public class Snail {

     //Write a program that reads a,b and h (line by lyne in this order) and prints
        //the number of days for which the snail reach the top of the tree.
        //a - feet that snail travels up each day, b - feet that slides down each night, h - height of the tree
  
    public static void main(String[] args) throws IOException {
         int a;
         int b;
         int h;
         int avance = 0;
         int sube;
         Scanner leer = new Scanner(System.in);
         a = leer.nextInt();
         b = leer.nextInt();
         h = leer.nextInt();
         leer.close();
         
        if (h <= a ){
            System.out.println(1);
        }else if(a == b || a < 0 || b < 0 || h < 0 || a<b){
            System.out.println("Impossible");
        }else if(h <= a){
            System.out.println(1);
        }else{
            for (int i=1; i<=h; i++){
                sube = avance + a;
                avance = sube - b;
               if (sube >= h){
                   System.out.println(i);
                   break;
                 }
            }

        }

        
        
        
    }
}    

// arguments("8", "3", "2", "10"),
// arguments("6", "4", "2", "14"),
// arguments("7", "4", "3", "10"),
// arguments("Impossible", "4", "4", "10"),
// arguments("Impossible", "5", "6", "10"),
// arguments("1", "5", "7", "2"),
// arguments("1", "5", "5", "3"),
// arguments("10", "2", "1", "11"),
// arguments("1", "12", "0", "10"),
// arguments("1", "12", "100", "10"),
// arguments("1", "123", "256", "12"),
// arguments("1", "123", "256", "123"),
// arguments("4", "4", "1", "13")
