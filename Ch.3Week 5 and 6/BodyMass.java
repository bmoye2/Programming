/*
   Chapter 3:  The Body Mass Index Calculator
   Programmer: B. Moye
   Date:       February 18, 2014
   Filename:   BodyMass.java
   Purpose:    This project calculates the body mass index based 
               on a person's height and weight.
*/

import java.io.*;

public class BodyMass
{
   public static void main(String[] args) throws IOException
   {
      //declare and construct variables
      String height, weight;
      int inches, pounds;
      double kilograms, meters, index;
      BufferedReader dataIn= new BufferedReader(new InputStreamReader(System.in));
      
      // print prompts and get input
      System.out.println("\tThe SUN FITNESS CENTER BODY MASS INDEX CALCULATOR");
      System.out.println();
      System.out.print("\t\tEnter your height to the nearest inch: ");
         height = dataIn.readLine();
         inches = Integer.parseInt(height);
      System.out.print("\t\tEnter your weight to the nearest pound: ");
         weight = dataIn.readLine();
         pounds = Integer.parseInt(weight);
         
         // calculations
         meters = inches / 39.36;
         kilograms = pounds / 2.2;
         index = kilograms / Math.pow(meters,2);
         
         // output
         System.out.println();
         System.out.println("\tYOUR BODY MASS INDEX IS " + Math.round(index) + ".");
         System.out.println();
   }
}   
         
      