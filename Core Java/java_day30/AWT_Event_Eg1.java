package com.profound.java_day30;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWT_Event_Eg1 extends Frame implements ActionListener{
	TextField tf;
	AWT_Event_Eg1()
	{
		tf=new TextField();
		tf.setBounds(100,100,100,30);
		add(tf);
		
		Button b=new Button("Click Me!!");
		b.setBounds(110,150,80,30);
		b.setBackground(Color.yellow);
		
		b.addActionListener(this);
		add(b);
		
		setSize(300,300);
		setLayout(null);
		setVisible(true);
		setBackground(Color.LIGHT_GRAY);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		tf.setText("Hello World!!");
		
	}
	
	public static void main(String[] args) {
		AWT_Event_Eg1 a = new AWT_Event_Eg1();

	}
}
