/*
   Chapter 5:  Programming Assignment 6
   Programmer: B. Moye
   Date:       March 26, 2014
   File name:  DavidApplet.java
   Purpose:    Reservations for David
*/

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class DavidApplet extends Applet implements ActionListener
{
   //Declare variables
   String firstName, lastName, address, city, state, zip, arrivalDate;
   int numberNights;
   
   //Create applet components
   Label firstLabel = new Label("First Name");
      TextField firstField = new TextField(10);
      
   Choice vehicleChoice = new Choice();
   
   Label lastLabel = new Label("Last Name");
      TextField lastField = new TextField(10);
   
   Choice hookupChoice = new Choice();
   
   Label addressLabel = new Label("Address");
      TextField addressField = new TextField(20);
   
   Label arrivalLabel = new Label("Arrival Date");
      TextField arrivalField = new TextField(10);
      
   Label cityLabel = new Label("City");
      TextField cityField = new TextField(20);
      
   Label nightsLabel = new Label("Number of Nights");
      TextField nightsField = new TextField(9);
   
   Label stateLabel = new Label("State");
      TextField stateField = new TextField(2); 
      
   Label zipLabel = new Label("Zip");
      TextField zipField = new TextField(6);
   
   Button submitButton = new Button("Submit");
   Button clearButton = new Button("Clear");
   
   public void init()
   {
      //Add components to applet and set background
      setBackground(Color.red);
      add(firstLabel);
      add(firstField);
         firstField.setBackground(Color.white);
         firstField.requestFocus();
      add(vehicleChoice);
         vehicleChoice.addItem("Camping Vehicles");
         vehicleChoice.addItem("Tent");
         vehicleChoice.addItem("Pop-up");
         vehicleChoice.addItem("Travel Trailer");
         vehicleChoice.addItem("Fifth-Wheel");
         vehicleChoice.addItem("Motor Home");
      add(lastLabel);
      add(lastField);
         lastField.setBackground(Color.white);
      add(hookupChoice);
         hookupChoice.addItem("Hook-ups");
         hookupChoice.addItem("Water only");
         hookupChoice.addItem("Water and Electricity");
         hookupChoice.addItem("Full hook-ups");
         hookupChoice.addItem("No hook-ups");
      add(addressLabel);
      add(addressField);
         addressField.setBackground(Color.white);
      add(arrivalLabel);
      add(arrivalField);
         arrivalField.setBackground(Color.white);
      add(cityLabel);
      add(cityField);
         cityField.setBackground(Color.white);
      add(nightsLabel);
      add(nightsField);
         nightsField.setBackground(Color.white);
      add(stateLabel);
      add(stateField);
         stateField.setBackground(Color.white);
      add(zipLabel);
      add(zipField);
         zipField.setBackground(Color.white);
      add(submitButton);
         submitButton.addActionListener(this);
      add(clearButton);
         clearButton.addActionListener(this);
   }
   
   public void actionPerformed(ActionEvent e)
   {
      String arg = e.getActionCommand();
      if (arg == "Submit")
      {
         firstName = firstField.getText();
         lastName = lastField.getText();
         address = addressField.getText();
         arrivalDate = arrivalField.getText();
         city = cityField.getText();
         numberNights = Integer.parseInt(nightsField.getText());
         state = stateField.getText();
         zip = zipField.getText();
      }
      
      if (arg == "Clear")
      {
         firstField.setText("");
         vehicleChoice.select(0);
         lastField.setText("");
         hookupChoice.select(0);
         addressField.setText("");
         arrivalField.setText("");
         cityField.setText("");
         nightsField.setText("");
         stateField.setText("");
         zipField.setText("");
      }
   }
}
      
   