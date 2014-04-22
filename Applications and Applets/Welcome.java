/* 
   Chapter 2:  Welcome to My Day
   Programmer: B Moye
   Date:       October 4, 2007
   Filename:   Welcome.java
   Purpose:    This project displays a welcome message, the user's 
   name, and the system date in a console application
*/

import java.util.Date; 

public class Welcome
{
   public static void main(String [] args)
   {
      Date currentDate = new Date(); //Date constructor
      System.out.println();
      System.out.println("\t\t\tWelcome to my day!");
      System.out.println("\t\t\tDaily Planner for Brett Moye");
      System.out.println("\t\t\t" + currentDate);
      System.out.println();
   }
}
