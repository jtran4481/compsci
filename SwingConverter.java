package projects;

import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;



public class SwingConverter implements ActionListener{
	
	
	// class scope: anything added here can be used down below
	// want the narrowest scope possible
	private JPanel inputPanel = initInputPanel();
	private JTextField inputText;
	private JTextArea resultArea;
	private JButton enterButton;
	private JTextField inputRadius;
	private JButton enterRadius;	
	private JButton resetRadius;
	
	public SwingConverter() {
        JFrame myWindow = new javax.swing.JFrame("Base Converter - Created by John");
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myWindow.add(inputPanel);
        myWindow.setSize(600, 500);
        myWindow.setVisible(true);

	}
	
	
	
    private JPanel initInputPanel() {
		// TODO Auto-generated method stub
    	JPanel panel = new JPanel();
    	panel.setPreferredSize(new java.awt.Dimension(500, 500));
    	panel.setLayout(null);
    	panel.setBackground(java.awt.Color.cyan);
    	JLabel label = new JLabel("Enter a base 10 number: ");
    	label.setBounds(50, 50, 220, 30);
    	panel.add(label);
    	//method scope: can only use it in this method
    	JTextField text;
    	text = inputText = new JTextField();
    	text.setBounds(230, 50, 100, 30);
    	panel.add(text);
    	
    	JButton button = new JButton("Enter");
    	button.setActionCommand("Enter");
    	button.setBounds(340, 50, 80, 30);
    	button.addActionListener(this);
    	panel.add(button);
    	// save to the class variable, to be sued in other methods
    	enterButton = button; // assign in to a class var to be used in other methods
    	button = new JButton("Reset");
    	button.setActionCommand("Reset");
    	button.setBounds(430, 50, 80, 30);
    	button.addActionListener(this);
    	panel.add(button);
    	
    	resultArea = new JTextArea();
    	resultArea.setBounds(50, 180, 500, 200);
    	resultArea.setEditable(false);
    	resultArea.setBackground(java.awt.Color.yellow);
    	panel.add(resultArea);
    	

    	JLabel radiusLabel = new JLabel("Enter a radius: ");
    	radiusLabel.setBounds(50, 100, 220, 30);
    	panel.add(radiusLabel);
    	enterRadius = new JButton("Enter");
    	enterRadius.setActionCommand("ERad");
    	enterRadius.addActionListener(this);
    	enterRadius.setBounds(340, 100, 80, 30);
    	panel.add(enterRadius);
    	resetRadius = new JButton("Reset");
    	resetRadius.setActionCommand("RRad");
    	resetRadius.addActionListener(this);
    	resetRadius.setBounds(430, 100, 80, 30);
    	panel.add(resetRadius);
    	
    	inputRadius = new JTextField();
    	inputRadius.setBounds(230, 100, 100, 30);
    	panel.add(inputRadius);

		return panel;
	}






	public static void main(String[] args) throws Exception {
        //SwingConverter baseConverter=new SwingConverter();
        new SwingConverter();
    }



	@Override
	public void actionPerformed(ActionEvent ev) {
        String command=ev.getActionCommand();
        if (command.equals("Enter")) {
            showResult();
        }
        else if (command.equals("Reset")) {
            reset();
        }
        else if (command.equals("ERad")) {
        	showSphere();
        }
        else if (command.equals("RRad")) {
        	reset();
        }
    }



	private void showResult() {
    	String hexUpperCase;
    	inputText.setEnabled(false);
    	enterButton.setEnabled(false);
    	Integer n = getInputNumber();
    	Integer p = getRadius();
    	if (n == null){
    		resultArea.append("Invalid Number");
    		return;
    	}

    	int baseTenNumber = n.intValue();
    	resultArea.append("Decimal = " + baseTenNumber + "\n");
    	resultArea.append("binary = " + Integer.toString(baseTenNumber, 2) + "\n");
    	resultArea.append("octal = " + Integer.toString(baseTenNumber, 8) + "\n");
    	resultArea.append("hexadecimal = " + Integer.toString(baseTenNumber, 16) + "\n");
    	hexUpperCase = Integer.toString(baseTenNumber, 16).toUpperCase();
    	resultArea.append("Hexadecimal = " + hexUpperCase + "\n");
    }
    
    private void showSphere() {
    	String hexUpperCase;
    	inputText.setEnabled(false);
    	enterButton.setEnabled(false);

    	Integer p = getRadius();
    	if (p==null) {
    		resultArea.append("Invalid Number");
    		return;
    	}
    	
    	int radius = p.intValue();

    	resultArea.append("radius = " + radius + "\n");
    	resultArea.append("volume = " + (4 * Math.PI * Math.pow(radius, 3)) / 3 + "\n");
    	resultArea.append("surface area = " + 4 * Math.PI * Math.pow(radius, 2) + "\n");
    }
    
    private Integer getRadius() {
		try {
    		Integer p = Integer.parseInt(inputRadius.getText());
    		return p;
		}
		catch (Exception e) {
			return null;
		}
	}



	private void reset() {
        inputText.setText("");
        resultArea.setText("");
        inputRadius.setText("");
        inputText.setEnabled(true);
        enterButton.setEnabled(true);
        inputText.requestFocus();
    }
    
    private Integer getInputNumber() {
    	try {
    		Integer n = Integer.parseInt(inputText.getText());
    		return n;
    	}
    	catch (Exception e) {
    		return null;
    	}
    	
    }
}
