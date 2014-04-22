/*
   Chapter 3      Programming Assignment #3
   Programmer:    Brett Moye
   Date:          February 21, 2014
   Program Name:   Coin.java
*/

import java.io.*;

public class Coin
{
   public static void main(String[] args) throws IOException
   {
	   BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

	   //Declaring Variables
      String strQuarters;
      String strDimes;
      String strNickels;
      String strPennies;
	   int quarters;
	   int dimes;
	   int nickels;
	   int pennies;
	   int dollars;
	   int totalCents;
	   int cents;
      
      
	   //Assigning Values
	   System.out.println("Enter the number of quarters.");
         strQuarters = dataIn.readLine();
      System.out.println("Enter the number of dimes.");
         strDimes = dataIn.readLine();
      System.out.println("Enter the number of nickels.");
         strNickels = dataIn.readLine();
      System.out.println("Enter the number of pennies.");
         strPennies = dataIn.readLine();

	   //Calculations
	   quarters = Integer.parseInt(strQuarters) * 25;
	   dimes = Integer.parseInt(strDimes) * 10;
	   nickels = Integer.parseInt(strNickels) * 5;
	   pennies = Integer.parseInt(strPennies) * 1;

	   //Conversions
	   totalCents = quarters + dimes + nickels + pennies;
	   dollars = (totalCents / 100);
	   cents = (totalCents % 100);

	   //Output
	   System.out.println("Your change equalled "+ dollars+" dollars and "+cents+" cents");
   }
}