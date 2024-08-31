package com.profound.java_day30;
import java.awt.*;

public class AWT_Eg1 extends Frame{
	
	AWT_Eg1()
	{
		
		Button b = new Button("Submit");
		b.setBounds(80,100,80,30);
		
		Color c = new Color(0,255,0);
		b.setBackground(c);
		
		Button d = new Button("Delete");
		d.setBounds(190,100,80,30);
		
		Color dc = new Color(255,0,0);
		d.setBackground(dc);
	
		
		add(b);
		add(d);
		setSize(400,300);
		setLayout(null);
		setTitle("AWT EG 1");
		setVisible(true);
	}
	public static void main(String[] args) {
		AWT_Eg1 a = new AWT_Eg1();

	}

}
