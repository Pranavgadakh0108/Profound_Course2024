package com.awt_project2.billCalculator;

import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Hotel_Bill_Calculator implements ActionListener{
	Frame f;
	TextField t1,t2,t3,t4,t5;
	Label l,l1,l2,l3,l4,l5,l6,l7;
	Checkbox c1,c2,c3,c4,c5,c6;
	List list;
	Button gb,b1;
	TextArea ar;
	Hotel_Bill_Calculator()
	{
		f = new Frame("Bill");
		f.setBackground(Color.pink);
		
		l = new Label(" Hotel JAVA_AWT");
		l.setForeground(Color.blue);
		l.setBackground(Color.yellow);
		Font myFont = new Font("Arial", Font.ITALIC, 18);
		l.setFont(myFont);
		l.setBounds(150, 40, 160, 30); 
		f.add(l);
		
		Font myFont1 = new Font("Arial", Font.BOLD, 12);
		l1 = new Label("Order No: ");
		l1.setBounds(60, 80, 60, 20);
		l1.setFont(myFont1);
		f.add(l1);
		 t1 = new TextField();
		t1.setBounds(120, 80, 100, 20);
		f.add(t1);
		
		l2 = new Label("Customer Name: ");
		l2.setBounds(230, 80, 100, 20);
		l2.setFont(myFont1);
		f.add(l2);
		t2 = new TextField();
		t2.setBounds(330, 80, 120, 20);
		f.add(t2);
		
		l3 = new Label("Menu: ");
		l3.setBounds(60, 110, 60, 20);
		l3.setFont(myFont1);
		f.add(l3);
		c1 = new Checkbox(" Tea (15 ₹.)");
		c1.setBounds(70, 130, 100, 20);
		c1.setFont(myFont1);
		f.add(c1);
		c2 = new Checkbox(" Coffee (15 ₹.)");
		c2.setBounds(70, 150, 100, 20);
		c2.setFont(myFont1);
		f.add(c2);
		c3 = new Checkbox(" Water (10 ₹.)");
		c3.setBounds(70, 170, 100, 20);
		c3.setFont(myFont1);
		f.add(c3);
		c4 = new Checkbox(" Pav-Bhaji (30 ₹.)");
		c4.setBounds(200, 130, 120, 20);
		c4.setFont(myFont1);
		f.add(c4);
		c5 = new Checkbox(" Misal-Pav (30 ₹.)");
		c5.setBounds(200, 150, 120, 20);
		c5.setFont(myFont1);
		f.add(c5);
		c6 = new Checkbox(" Vada-Pav (20 ₹.)");
		c6.setBounds(200, 170, 120, 20);
		c6.setFont(myFont1);
		f.add(c6);
		
		
		l4 = new Label(" Quantity: ");
		l4.setBounds(60, 200, 60, 20);
		l4.setFont(myFont1);
		f.add(l4);
		t3= new TextField();
		t3.setBounds(120, 200, 30, 20);
		f.add(t3);
		
		l5 = new Label(" Amount: ");
		l5.setBounds(160, 200, 60, 20);
		l5.setFont(myFont1);
		f.add(l5);
		t4 = new TextField();
		t4.setBounds(220, 200, 100, 20);
		f.add(t4);
		
		l6 = new Label(" Discount: ");
		l6.setBounds(330, 200, 60, 20);
		l6.setFont(myFont1);
		f.add(l6);
		list = new List(5);
		list.setBounds(400, 200, 50, 19);
		list.add("0%");
		list.add("5%");
		list.add("10%");
		list.add("15%");
		list.add("20%");
		f.add(list);
		
		l7 = new Label(" Final Amount: ");
		l7.setBounds(60, 235, 80, 20);
		l7.setFont(myFont1);
		f.add(l7);
		t5 = new TextField();
		t5.setBounds(143, 235, 100, 20);
		f.add(t5);
		
		gb = new Button(" Generate Bill ");
		gb.setBounds(250, 235, 100, 20);
		gb.setBackground(Color.green);
		gb.addActionListener(this);
		gb.setFont(myFont1);
		f.add(gb);
		
		b1 = new Button(" Cancel Order ");
		b1.setBounds(360,235,100,20);
		b1.setBackground(Color.orange);
		b1.setFont(myFont1);
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		f.add(b1);
	
		ar = new TextArea();
		ar.setBounds(30, 270, 450, 250);
		Font myFont2= new Font(Font.MONOSPACED, Font.BOLD, 13);
		ar.setFont(myFont2);
		f.add(ar);
		
		f.setSize(500,550);
		f.setLayout(null);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		Hotel_Bill_Calculator bill = new Hotel_Bill_Calculator();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int orderno = Integer.parseInt(t1.getText());
		String custname = t2.getText();
		
		int price=0;
		String p1 = "";
		String rate="";
		if(c1.getState())
		{
			price=15;
			p1="Tea";
			rate="15 ₹.";
		}
		if(c2.getState())
		{
			price = price+15;
			p1=p1+" Coffee";
			rate=rate+"15 ₹.";
		}
		if(c3.getState())
		{
			price = price+10;
			p1=p1+" Water";
			rate=rate+"10 ₹.";
		}
		if(c4.getState())
		{
			price = price+30;
			p1=p1+" Pav-Bhaji";
			rate=rate+"30 ₹.";
		}
		if(c5.getState())
		{
			price = price+30;
			p1=p1+" Misal-pav";
			rate=rate+"30 ₹.";
		}
		if(c6.getState())
		{
			price = price+20;
			p1=p1+" Vada-pav";
			rate=rate+"20 ₹.";
		}
		
		
		int quantity = Integer.parseInt(t3.getText());
		
		int amount =price*quantity;
		
		double discount;
		if(list.getSelectedItem().equals("5%"))
		{
			discount = amount*0.05f;
		}
		else if(list.getSelectedItem().equals("10%"))
		{
			discount = amount*0.1f;
		}
		else if(list.getSelectedItem().equals("15%"))
		{
			discount = amount*0.15f;
		}
		else if(list.getSelectedItem().equals("20%"))
		{
			discount = amount*0.2f;
		}
		else
		{
			discount = 0;
		}
		
		Double fAmount=amount-discount;
		System.out.println(fAmount);
		
		t4.setText(String.valueOf(amount));
		t5.setText(String.valueOf(fAmount));
		
		Date d = new Date();
		
		ar.setText("\n------------------------------------------------------------------------------\n"
				+" Date: "+d
				+"\n------------------------------------------------------------------------------\n"
				+" Hello "+custname+", Your Order No. is "+orderno+""
				+"\n------------------------------------------------------------------------------\n"
				+" Product Name: "+p1+"\n Quantity: "+quantity+"\n Rate: "+rate+""
				+"\n------------------------------------------------------------------------------\n"
				+"		Total:"+amount+" ₹."
				+"\n		Discount:"+discount+" ₹. ("+list.getSelectedItem()+")"
				+"\n		Final Amount:"+fAmount+" ₹."	
				+"\n-------------------------------------------------------------------------------"
				+"\n-------->> THANK YOU!! VISIT AGAIN...<<----------\n"
						);
	}

}
