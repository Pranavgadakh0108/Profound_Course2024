package com.profound.java_day30;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWT_EVENT_EG2 {
	TextField tf1 = new TextField();
	TextField tf2 = new TextField();
	
	AWT_EVENT_EG2()
	{
		Frame f = new Frame();
		f.setBackground(Color.LIGHT_GRAY);
		
		Button b1 = new Button("1");
		Button b2 = new Button("2");
		
		tf1.setBounds(30,50,80,20);
		tf2.setBounds(140,50,80,20);
		
		b1.setBounds(30,100,30,30);
		b1.setBackground(Color.pink);
		b2.setBounds(60,100,30,30);
		b2.setBackground(Color.green);
		
		f.add(tf1);
		f.add(tf2);
		f.add(b1);
		f.add(b2);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				tf1.setText("1.Hello");
				
			}
		});
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				tf2.setText("2.Bye");
				
			}
		});
		
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		AWT_EVENT_EG2 a=new AWT_EVENT_EG2();
	}
}
