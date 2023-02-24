package Excersice1;
/*Consider a company of friends visiting a restaurant. They decided to equally split the bill.
Friends decided to add 10 percent of the bill total amount as tips. Then they cover the total payment in equal parts.
Please, proceed to GoDutch class and write a program that reads a bill total amount and a number of friends, 
and then prints part to pay.

Consider some details:

Program must read data from System.in.
Bill total amount cannot be negative. If input value is negative, the program stops, printing: 
Bill total amount cannot be negative.
Number of friends cannot be negative or zero. If input value is, then the program stops, printing: 
Number of friends cannot be negative or zero.
Bill total amount, number of friends and part to pay are integers.*/

import java.util.Scanner;

public class GoDutch {
    public static void main(String[] args) {

        int totalCuenta;
        int numeroAmigos;
        int valorPorPersona;

        Scanner leer = new Scanner(System.in);
        totalCuenta = leer.nextInt();
        numeroAmigos = leer.nextInt();
        leer.close();

        if(totalCuenta < 0){
            System.out.println("Bill total amount cannot be negative");
        }else if(totalCuenta == 0){
            System.out.println(0);
        }else if(numeroAmigos <= 0){
            System.out.println("Number of friends cannot be negative or zero");
        }else{
            totalCuenta = totalCuenta + totalCuenta*10/100;
            valorPorPersona = totalCuenta / numeroAmigos;
            System.out.println(valorPorPersona);
        }
    }
}
