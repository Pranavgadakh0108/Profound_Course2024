package com.profound.java_day30;

import java.awt.*;

public class AWT_Eg2 {
	
	AWT_Eg2()
	{
		Frame f = new Frame("AWT Eg 2");
		
		Button b = new Button("Submit");
		b.setBounds(80,100,80,30);
		
		Color c = new Color(0,255,0);
		b.setBackground(c);
		
		Button d = new Button("Delete");
		d.setBounds(190,100,80,30);
		
		Color dc = new Color(255,0,0);
		d.setBackground(dc);
	
		
		f.add(b);
		f.add(d);
		f.setSize(400,300);
		f.setLayout(null);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		AWT_Eg2 obj = new AWT_Eg2();

	}

}
