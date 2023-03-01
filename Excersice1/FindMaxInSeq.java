package Excersice1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*write a program that reads a sequence of integer values from standard output and finds the maximum value. 
You must place your solution into the max method to pass tests.

Details:

You must read sequence values until the next one is 0. Zero value means end of the input sequence.
The sequence is guaranteed to contain at least one value.
 */

public class FindMaxInSeq {
    
     public static Integer max() {
        
        String input;
        Scanner sc = new Scanner(System.in);
        input = sc.nextLine();
        sc.close();
        
        String[] parts = input.split(" ");

        
        
        int[] partsInt = new int[parts.length-1];
        
        
        for (int i=0; i < partsInt.length; i++){
            partsInt[i] = Integer.parseInt(parts[i]);

        }
        int mayor = partsInt[0];
		for (int i = 0; i < partsInt.length; i++) {
			if (mayor < partsInt[i]) {
			mayor = partsInt[i];
			}
            // if(mayor == 0) {
            // mayor = partsInt[i];
            //     break;
            // } 
		}
        
        return mayor;
        
    }
    


    public static void main(String[] args) throws IOException {

        System.out.println("Test your code here!\n");

        // Get a result of your code
        
        System.out.println(max());
    }


}



/*
 * testSeq11 "1 2 3 7 12 1 4 0"
 * testSeq12 "3 4 9 1 4 0"
 * testNegativeValues "-3 4 -9 1 -4 0"
 * testNegativeMaximum "-3 -4 -9 -1 -4 0"
 * testNegativeDuplicatedMaximum "-3 -4 -9 -4 -1 0"
 * testDuplicatedMaximum "9 -3 9 4 9 -1 4 0"
 * testPolydigitNumbers "99 -321 9 431 99 -11 4 0"
 * oneNumberSequence1 "34567 0"
 * testHavingIntegerMaxValue "-934567 4567 2147483647 -1 6273 -56789 3 2346 -18384 -483642347 6 0"
 */