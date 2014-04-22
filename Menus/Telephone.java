/*
   Programmer: B. Moye
   Date:       February 2, 2014
   Filename:   Telephone
   Purpose:    Create a telephone keypad
*/

import java.awt.*;
import java.awt.event.*;

public class Telephone extends Frame implements ActionListener
	{
	    //declaring variables - public
	    public Button keys[];
	    public Panel keyPad;
	    public TextField lcd;
	    public Label padLabel;
	    boolean foundKey;
	 
	    //constructor
	    public Telephone()
	    {
	        lcd = new TextField(20);
	        lcd.setEditable(false);
	        keyPad = new Panel();
	        keys = new Button[13];
	        padLabel = new Label();
	 
	 
	        //assign the button's labels
	        for (int i=0; i<=9; i++)
	        {
	            keys[i] = new Button(String.valueOf(i));
	            keys[i].addActionListener(this);
	 
	 
	 
	            keys[12] = new Button("#");
	            keys[11] = new Button("0");
	            keys[10] = new Button ("*");
	        }
	 
	            setBackground(Color.magenta);
	            setLayout(new BorderLayout());
	            keyPad.setLayout(new GridLayout(4,3,10,10));
	 
	            for (int i=1; i<=3; i++)
	                keyPad.add(keys[i]);
	 
	            for (int i=4; i<=6; i++)
	                keyPad.add(keys[i]);
	 
	            for (int i=7; i<=9; i++)
	                keyPad.add(keys[i]);
	 
	            keyPad.add(keys[10]);
	            keyPad.add(keys[11]);
	            keyPad.add(keys[12]);
	 
	            add(lcd, BorderLayout.NORTH);
	            add(keyPad, BorderLayout.CENTER);
	            add(padLabel, BorderLayout.SOUTH);
	 
	 
	        addWindowListener(
	                new WindowAdapter()
	                {
	                    public void windowClosing(WindowEvent e)
	                    {
	                        System.exit(0);
	                    }
	                }
	        );
	    }
	    public void actionPerformed(ActionEvent e)
	    {
	      Object o = e.getSource();
	         if (o instanceof Button) 
             {
	             lcd.setText(lcd.getText() + ((Button)o).getLabel());
	 
	          }
	    }
	        public static void main(String arg[])
	        {
	            Telephone t = new Telephone();
	            t.setTitle("Telephone");
	            t.setBounds(50,130,250,300);
	            t.setVisible(true);
	        }
	    }