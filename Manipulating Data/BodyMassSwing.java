/*
   Chapter 3:  The Body Mass Index Calculator
   Programmer: B. Moye
   Date:       February 18, 2014
   Filename:   BodyMassSwing.java
   Purpose:    This project calculates the body mass index based 
               on a person's height and weight.
*/

import javax.swing.JOptionPane;

public class BodyMassSwing 
{
   public static void main(String[] args) 
   {
      //declare variables
      String height, weight;
      int inches, pounds;
      double kilograms, meters, index;
      
      // print prompts and get input
      System.out.println("\tThe SUN FITNESS CENTER BODY MASS INDEX CALCULATOR");
      height=JOptionPane.showInputDialog(null,"Enter your height to the nearest inch:");
         inches = Integer.parseInt(height);
      weight=JOptionPane.showInputDialog(null,"Enter you weight to the nearest pound:");
         pounds = Integer.parseInt(weight);
         
         // calculations
         meters = inches / 39.36;
         kilograms = pounds / 2.2;
         index = kilograms / Math.pow(meters,2);
         
         // output
         JOptionPane.showMessageDialog(null, "YOUR BODY MASS INDEX IS " + Math.round(index) +".","Body Mass Calculator",JOptionPane.PLAIN_MESSAGE);
         
         System.exit(0);
   }
}   
         
      