/*
   Chapter 4:  Using switch and try statements to validate user input
   Programmer: B. Moye
   Date:       March 8, 2014
   Filename:   MyType.java
   Purpose:    To help student programmers understand data types
*/

import java.io.*;
import javax.swing.JOptionPane;

public class MyType
{
   public static void main(String[] args)
   {
      //Declare variables
      String strTryString, strTryInt, strTryDouble;
      int choice, tryInt;
      double tryDouble;
      boolean done = false;
      
      while(!done)
      {
         try
         {
            String strChoice = JOptionPane.showInputDialog(null,"What's my type?" + "\n\n1) String\n2) integer\n3) double\n4) Quit the program");
            choice = Integer.parseInt(strChoice);
            
            switch(choice)
            {
               case 1:
                  JOptionPane.showMessageDialog(null, "Correct, any input can be saved as a String");
                  break;
                  
               case 2:
                  tryInt = Integer.parseInt(strChoice);
                  JOptionPane.showMessageDialog(null,"Correct!");
                  break;
                  
               case 3:
                  tryDouble = Integer.parseInt(strChoice);
                  JOptionPane.showMessageDialog(null,"Correct!");
                  break;
               
               case 4:
                  done = true;
                  JOptionPane.showMessageDialog(null,"Thank you. Goodbye!");
                  break;
                  
               default:
                  throw new NumberFormatException();
            }
         }
            catch(NumberFormatException e)
            {
               System.out.println("Try again.");
            }
         
      }
   }
}
                 
               
                  