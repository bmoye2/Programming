/*
	Programmer: Brett Moye
	Date:       March 26, 2014
	Filename:	PasswordApplet.java
   Purpose:    Allow users to login
*/

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class PasswordApplet extends Applet implements ActionListener
{
   //Declaring variables
   String id, password;
   String idArray[] = {"id1", "id2"};
   String passwordArray[] = {"password1", "password2"};
   boolean success;

   //Create components for applet
   Label headerLabel = new Label("Please type your ID and Password");

   Label idLabel = new Label("ID:");
      TextField idField = new TextField(8);

   Label passwordLabel = new Label("Password:");
      TextField passwordField = new TextField(8);


   Button loginButton = new Button("Login");

   public void init()
   {
      //Set color, layout, and add components
      setBackground(Color.orange);

      setLayout(new FlowLayout(FlowLayout.LEFT,50,30));

      add(headerLabel);

      add(idLabel);
         add(idField);
         idField.requestFocus();

      add(passwordLabel);
         add(passwordField);
 		 passwordField.setEchoChar('*');

      add(loginButton);
         loginButton.addActionListener(this);
   }

   public void actionPerformed(ActionEvent e)
   {
      success = false;

      //Sequential search
      int i = 0;
      while (i<idArray.length)
      {
         if (idField.getText().compareTo(idArray[i])== 0)
         {
            if (passwordField.getText().compareTo(passwordArray[i])==0)
            {
               success = true;
            }
         }
         i = i + 1;
      }
      
      if (success==true)
      {  
         headerLabel.setText("Login successful");
      }
      
      else
      {
         headerLabel.setText("Unsuccessful. Try again");
         idField.setText("");
            passwordField.setText("");
            idField.requestFocus();
      }
      
      repaint();
   }
}