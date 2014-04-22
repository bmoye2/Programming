/*
   Chapter 3:  Kilowatt Applet
   Programmer: Brett Moye
   Date:       February 21, 2014
   Filename:   KilowattApplet
   Purpose:    Determines Annual Cost for Running an Appliance
*/

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class KilowattApplet extends Applet implements ActionListener
{

   //declare variable
   double average;
   
   //construct components
   Label welcome = new Label("Welcome to the Appliance Energy Calculator");
   Label costKwhrLabel = new Label("Please enter the cost per kilowatt-hour in cents:");
      TextField costKwhrField = new TextField(5);
   Label hoursPerYearLabel = new Label("Please enter the kilowatt-hours consumed:");
      TextField hoursPerYearField = new TextField(5);
   Button calcButton = new Button("Calculate");
   Label outputLabel = new Label("Click the Calculate button to display the average energy cost.");
   
   public void init()
   {
      setForeground(Color.red);
      add(welcome);
      add(costKwhrLabel);
      add(costKwhrField);
      add(hoursPerYearLabel);
      add(hoursPerYearField);
      add(calcButton);
      calcButton.addActionListener(this);
      add(outputLabel);
   }
   public void actionPerformed(ActionEvent e)
   {
      double costKwhr = Double.parseDouble(costKwhrField.getText());
      double kwHours = Double.parseDouble(hoursPerYearField.getText());
      average = costKwhr * kwHours;
      outputLabel.setText("The average annual cost to operate this appliance is $" + Math.round(average * 100)/100D);
   }
}

