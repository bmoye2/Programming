/*
   Chapter 6:  Clickable Applet
   Programmer: B. Moye
   Date:       April 2, 2014
   Filename:   MoveIt.java
   Pupose:     To create clickable applet
*/

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class MoveIt extends Applet implements ActionListener
{
   //declaring variables
   private Image cup;
   private Panel keyPad;
   public int top = 15;
   public int left = 15;
   private Button keysArray[];
   private boolean foundKey;
   
   public void init()
   {
      cup = getImage(getDocumentBase(), "cup.gif");//gets the image
      Canvas myCanvas = new Canvas();
      
      Panel keyPad = new Panel();
      keysArray = new Button[5];
      
      //create buttons
	   keysArray[0] = new Button("Up");
	   keysArray[1] = new Button("Left");
	   keysArray[2] = new Button("Right");
	   keysArray[3] = new Button("Down");
	   keysArray[4] = new Button("Center");
      
      keysArray[0].setActionCommand("Up");
      keysArray[1].setActionCommand("Left");
      keysArray[2].setActionCommand("Right");
      keysArray[3].setActionCommand("Down");
      keysArray[4].setActionCommand("Center");
      
	   setBackground(Color.blue);
      
      //Sets the layout manager for the frame
	   setLayout(new BorderLayout());
      
      //Sets the layout manager for the Panel
	   keyPad.setLayout(new BorderLayout());
      
      //Adding the buttons
      keyPad.add(keysArray[0], BorderLayout.NORTH);
      keyPad.add(keysArray[1], BorderLayout.WEST);
      keyPad.add(keysArray[2], BorderLayout.EAST);
      keyPad.add(keysArray[3], BorderLayout.SOUTH);
      keyPad.add(keysArray[4], BorderLayout.CENTER);
      
      add(myCanvas, BorderLayout.NORTH);
      add(keyPad, BorderLayout.SOUTH);
      
      //Adds ActionListener statements
      for(int i = 0; i < keysArray.length; i++)
         keysArray[i].addActionListener(this);
   }
   
   public void paint(Graphics g)
   {
      g.drawImage(cup, left, top, this);
   }
   
   public void actionPerformed(ActionEvent e)
	{
	    String arg = e.getActionCommand();
	 
	    if(arg.equals("Up")) top = top - 15;
	    if(arg.equals("Down")) top = top + 15;
	    if(arg.equals("Left")) left = left - 15;
	    if(arg.equals("Right")) left = left + 15;
	    if(arg.equals("Center"))
         {
	        top = 60;
	        left = 125;
         }
	 
	    repaint();
	    }
	}
