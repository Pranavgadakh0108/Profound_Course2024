package com.awt_project.calculator;

import java.awt.*;
import java.awt.event.*;


public class Calculator implements ActionListener {
	double num1 = 0, num2 = 0, result = 0;
    String operator;
    TextField t = new TextField();
	Calculator()
	{
		Frame f = new Frame("Calculator");
		
		t.setBounds(70, 80, 250, 50);
		t.setBackground(Color.white);
		Font myFont = new Font("Arial", Font.BOLD, 27);
		t.setFont(myFont);
		f.add(t);
		
		Font btnFont = new Font(Font.MONOSPACED, Font.BOLD, 15);
		Button b1 = new Button("1");
		b1.setBounds(80, 150, 50, 30);
		b1.setBackground(Color.cyan);
		b1.setFont(btnFont);
		b1.addActionListener(this);
		f.add(b1);
		
		Button b2 = new Button("2");
		b2.setBounds(140, 150, 50, 30);
		b2.setBackground(Color.cyan);
		b2.setFont(btnFont);
		b2.addActionListener(this);
		f.add(b2);

		Button b3 = new Button("3");
		b3.setBounds(200, 150, 50, 30);
		b3.setBackground(Color.cyan);
		b3.setFont(btnFont);
		b3.addActionListener(this);
		f.add(b3);
		
		Button add = new Button("+");
		add.setBounds(260, 150, 50, 30);
		add.setBackground(Color.yellow);
		add.setFont(btnFont);
		add.addActionListener(this);
		f.add(add);
		
		Button b4 = new Button("4");
		b4.setBounds(80, 190, 50, 30);
		b4.setBackground(Color.cyan);
		b4.setFont(btnFont);
		b4.addActionListener(this);
		f.add(b4);
		
		
		Button b5 = new Button("5");
		b5.setBounds(140, 190, 50, 30);
		b5.setBackground(Color.cyan);
		b5.setFont(btnFont);
		b5.addActionListener(this);
		f.add(b5);
		
		Button b6 = new Button("6");
		b6.setBounds(200, 190, 50, 30);
		b6.setBackground(Color.cyan);
		b6.setFont(btnFont);
		b6.addActionListener(this);
		f.add(b6);
		
		Button sub = new Button("-");
		sub.setBounds(260, 190, 50, 30);
		sub.setBackground(Color.yellow);
		sub.setFont(btnFont);
		sub.addActionListener(this);
		f.add(sub);
		
		Button b7 = new Button("7");
		b7.setBounds(80, 230, 50, 30);
		b7.setBackground(Color.cyan);
		b7.setFont(btnFont);
		b7.addActionListener(this);
		f.add(b7);
		
		Button b8 = new Button("8");
		b8.setBounds(140, 230, 50, 30);
		b8.setBackground(Color.cyan);
		b8.setFont(btnFont);
		b8.addActionListener(this);
		f.add(b8);
		
		Button b9 = new Button("9");
		b9.setBounds(200, 230, 50, 30);
		b9.setBackground(Color.cyan);
		b9.setFont(btnFont);
		b9.addActionListener(this);
		f.add(b9);
		
		Button mul = new Button("x");
		mul.setBounds(260, 230, 50, 30);
		mul.setBackground(Color.yellow);
		mul.setFont(btnFont);
		mul.addActionListener(this);
		f.add(mul);
		
		Button b0 = new Button("0");
		b0.setBounds(80, 270, 50, 30);
		b0.setBackground(Color.cyan);
		b0.setFont(btnFont);
		b0.addActionListener(this);
		f.add(b0);
		
		Button point = new Button(".");
		point.setBounds(140, 270, 50, 30);
		point.setBackground(Color.cyan);
		point.setFont(btnFont);
		point.addActionListener(this);
		f.add(point);
		
		Button mod = new Button("%");
		mod.setBounds(200, 270, 50, 30);
		mod.setBackground(Color.yellow);
		mod.setFont(btnFont);
		mod.addActionListener(this);
		f.add(mod);
		
		Button div = new Button("/");
		div.setBounds(260, 270, 50, 30);
		div.setBackground(Color.yellow);
		div.setFont(btnFont);
		div.addActionListener(this);
		f.add(div);
		
		Button ans = new Button("Answer");
		ans.setBounds(85, 310, 70, 30);
		ans.setBackground(Color.green);
		ans.setFont(btnFont);
		ans.addActionListener(this);
		f.add(ans);
		
		Button clear = new Button("Clear");
		clear.setBounds(168, 310, 60, 30);
		clear.setBackground(Color.red);
		clear.setFont(btnFont);
		clear.addActionListener(this);
		f.add(clear);
		
		Button exit = new Button("Exit");
		exit.setBounds(240, 310, 60, 30);
		exit.setBackground(Color.magenta);
		exit.setFont(btnFont);
		exit.addActionListener(this);
		f.add(exit);
		
		f.setSize(400,400);
		f.setBackground(Color.darkGray);
		f.setLayout(null);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		Calculator c = new Calculator();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		//System.out.println("command: "+command);
        if ((command.charAt(0) >= '0' && command.charAt(0) <= '9')||command.charAt(0)=='.') 
        {
            t.setText(t.getText() + command);
        }
        else if (command == "Clear") 
        {
            t.setText("");
        }
        else if (command == "Exit") 
        {
        	System.exit(0);
        }
        
        else if (command == "Answer") 
        {
            num2 = Double.parseDouble(t.getText());

            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "x":
                    result = num1 * num2;
                    break;
                case "/":
                    result = num1 / num2;
                    break;
                case "%":
                	result = num1 % num2;
                	break;
            }
            t.setText(String.valueOf(result));
            num1 = result;
        
        } 
        
        else 
        {
            if (!t.getText().isEmpty()) 
            {
                num1 = Double.parseDouble(t.getText());
                operator = command;
                t.setText("");
            }
        }
		
	}

}
