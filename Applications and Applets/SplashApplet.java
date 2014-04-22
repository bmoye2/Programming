/*
   Programmer: Brett Moye
   Date:       February 9, 2014
   Program:    Name and Date
   Course #:   COSC 1336
   Purpose:    To Display my Name and Address
*/

import java.awt.*;
import java.applet.*;

public class SplashApplet extends Applet
{
   public void paint(Graphics g)
   {
      g.drawString("Brett",200,70);
      g.drawString("2508 E 11th Ave",200,100);
      g.drawString("Denver, CO",200,130);
      setBackground(Color.cyan);
   }
}   