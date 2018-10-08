package projects;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;


	public class Calculator implements ActionListener {
		
		JFrame frame;
		JTextField textField;
		JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bdec, badd, bsub, bmul, bdiv, beq, bclr, bksp, bsqr, bcbe, bsqt, blog;
		
		Double firstNumber;
		Double secondNumber;
		Double result;
		int operator;
		// constructor
		
		public Calculator() {
			frame = new JFrame("Calculator by John");
			frame.setLayout(null);

			textField = new JTextField();
			textField.setBounds(30, 40, 410, 30);
			textField.setBackground(java.awt.Color.yellow);
			frame.getContentPane().setBackground(java.awt.Color.black);

			frame.add(textField);

			
			b1 = new JButton("1");
			b1.setBounds(40, 310, 50, 40);
			b1.addActionListener(this);
			
			b2 = new JButton("2");
			b2.setBounds(130, 310, 50, 40);
			b2.addActionListener(this);
			
			b3 = new JButton("3");
			b3.setBounds(220, 310, 50, 40);
			b3.addActionListener(this);
			
			b4 = new JButton("4");
			b4.setBounds(40, 240, 50, 40);
			b4.addActionListener(this);
			
			b5 = new JButton("5");
			b5.setBounds(130, 240, 50, 40);
			b5.addActionListener(this);
			
			b6 = new JButton("6");
			b6.setBounds(220, 240, 50, 40);
			b6.addActionListener(this);
			
			b7 = new JButton("7");
			b7.setBounds(40, 170, 50, 40);
			b7.addActionListener(this);
			
			b8 = new JButton("8");
			b8.setBounds(130, 170, 50, 40);
			b8.addActionListener(this);
			
			b9 = new JButton("9");
			b9.setBounds(220, 170, 50, 40);
			b9.addActionListener(this);
			
			b0 = new JButton("0");
			b0.setBounds(40, 380, 140, 40);
			b0.addActionListener(this);
			
			bdec = new JButton(".");
			bdec.setBounds(220, 380, 50, 40);
			bdec.addActionListener(this);
			
			//width: +90, length: +70
			badd = new JButton("+");
			badd.setBounds(310, 170, 50, 40);
			badd.addActionListener(this);
			
			bsub = new JButton("-");
			bsub.setBounds(310, 240, 50, 40);
			bsub.addActionListener(this);
			
			bmul = new JButton("*");
			bmul.setBounds(310, 310, 50, 40);
			bmul.addActionListener(this);
			
			bdiv = new JButton("/");
			bdiv.setBounds(310, 380, 50, 40);
			bdiv.addActionListener(this);
			
			bclr = new JButton("Clear");
			bclr.setBounds(220, 450, 140, 40);
			bclr.addActionListener(this);
			
			beq = new JButton("Enter");
			beq.setBounds(400, 450, 140, 40);
			beq.addActionListener(this);
			
			bksp = new JButton("Backspace");
			bksp.setBounds(40, 450, 140, 40);
			bksp.addActionListener(this);
			
			bsqr  = new JButton("Sqaure");
			bsqr.setBounds(400, 170, 140, 40);
			bsqr.addActionListener(this);
			
			bcbe  = new JButton("Cube");
			bcbe.setBounds(400, 310, 140, 40);
			bcbe.addActionListener(this);
			
			bsqt  = new JButton("sqt");
			bsqt.setBounds(400, 240, 140, 40);
			bsqt.addActionListener(this);
			
			blog  = new JButton("Log");
			blog.setBounds(400, 380, 140, 40);
			blog.addActionListener(this);
			
			frame.add(b1);		
			frame.add(b2);
			frame.add(b3);
			frame.add(b4);
			frame.add(b5);
			frame.add(b6);
			frame.add(b7);
			frame.add(b8);
			frame.add(b9);
			frame.add(b0);
			frame.add(bdec);
			frame.add(badd);
			frame.add(bsub);
			frame.add(bmul);
			frame.add(bdiv);
			frame.add(beq);
			frame.add(bclr);
			frame.add(bksp);
			frame.add(bsqr);
			frame.add(bcbe);
			frame.add(bsqt);
			frame.add(blog);
			frame.setSize(800, 600);
			frame.setVisible(true);
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource() == b1) {
				textField.setText(textField.getText().concat("1"));
			}
			if(e.getSource() == b2) {
				textField.setText(textField.getText().concat("2"));
			}
			if(e.getSource() == b3) {
				textField.setText(textField.getText().concat("3"));
			}
			 if(e.getSource() == b4) {
				textField.setText(textField.getText().concat("4"));
			}
			if(e.getSource() == b5) {
				textField.setText(textField.getText().concat("5"));
			}
			if(e.getSource() == b6) {
				textField.setText(textField.getText().concat("6"));
			}
			if(e.getSource() == b7) {
				textField.setText(textField.getText().concat("7"));
			}
			if(e.getSource() == b8) {
				textField.setText(textField.getText().concat("8"));
			}
			if(e.getSource() == b9) {
				textField.setText(textField.getText().concat("9"));
			}
			if(e.getSource() == b0) {
				textField.setText(textField.getText().concat("0"));
			}
			if(e.getSource() == bdec) {
				textField.setText(textField.getText().concat("."));
			}
			if(e.getSource() == bclr) {
				textField.setText("");
			}
			if(e.getSource() == badd) {
				firstNumber = Double.parseDouble(textField.getText());
				operator = 1;
				textField.setText("");
			}
			if(e.getSource() == bsub) {
				firstNumber = Double.parseDouble(textField.getText());
				operator = 2;
				textField.setText("");
			}
			
			if(e.getSource() == bmul) {
				firstNumber = Double.parseDouble(textField.getText());
				operator = 3;
				textField.setText("");
			}
			
			if(e.getSource() == bdiv) {
				firstNumber = Double.parseDouble(textField.getText());
				operator = 4;
				textField.setText("");
			}
			
			if(e.getSource() == bsqr) {
				firstNumber = Double.parseDouble(textField.getText());
				operator = 5;
				textField.setText("");
			}
			
			if(e.getSource() == bcbe) {
				firstNumber = Double.parseDouble(textField.getText());
				operator = 7;
				textField.setText("");
			}
			if(e.getSource() == bsqt) {
				firstNumber = Double.parseDouble(textField.getText());
				operator = 6;
				textField.setText("");
			}
			
			if(e.getSource() == blog) {
				firstNumber = Double.parseDouble(textField.getText());
				operator = 8;
				textField.setText("");
			}
			
			if (e.getSource() == bksp) {
				String s = textField.getText();
				textField.setText("");
				for (int i=0; i<s.length()-1; i++) {
					textField.setText(textField.getText()+s.charAt(i));
				}
			}
			
			if (e.getSource() == beq) {
				if (operator < 5) {
				secondNumber = Double.parseDouble(textField.getText());
				}
				
				switch(operator) {
					case 1:
						result = firstNumber + secondNumber;
						break;
					case 2:
						result = firstNumber - secondNumber;
						break;
					case 3:
						result = firstNumber * secondNumber;
						break;
					case 4:
						result = firstNumber / secondNumber;
						break;
					case 5:
						result = Math.pow(firstNumber, 2);
						break;
					case 6:
						result = Math.pow(firstNumber, .5);
						break;
					case 7:
						result = Math.pow(firstNumber, 3);
						break;
					case 8:
						result = Math.log10(firstNumber);
						break;

				}
				textField.setText("" + result);
			
			
			}
		}
	}


