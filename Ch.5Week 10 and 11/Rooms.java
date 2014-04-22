/*
   Chapter 5:  Reserve a Party Room
   Programmer: B. Moye
   Date:       March 21, 2014
   Filename:   Rooms.java
   Purpose:    This is an external class called by the Reservations.java program. 
               Its constructor method receives the number of nonsmoking and smoking rooms
               and then creates an array of empty rooms. The bookRoom() method accepts a 
               boolean value and returns a room number.
*/

public class Rooms
{
   //declare class variables
   int numSmoking;
   int numNonSmoking;
   boolean occupied[];
   
   public Rooms(int non, int sm)
   {
      //construct an array of boolean values equal to the total number of rooms
      occupied = new boolean[sm+non];
      for (int i=0; i<(sm+non); i++)
         occupied[i] = false; //set each occupied room to false or empty 
      //initialize the number of smoking and nonsmoking rooms
      numSmoking = sm;
      numNonSmoking = non;
   }
  
   public int bookRoom(boolean smoking)
   {
      int begin, end, roomNumber=0;
      
      if(!smoking)
      {
         begin = 0;
         end = numNonSmoking;
      }
      else
      {
         begin = numNonSmoking;
         end = numNonSmoking+numNonSmoking;
      }
      
      for(int i=begin; i<end; ++i)
      {
         if(!occupied[i]) //if room is not occupied 
         {
            occupied[i] = true;
            roomNumber = i+1;
            i = end; //to exit loop
         }
      }
      return roomNumber;
   }
}
               