package projects;

//import java.util.Scanner;

//import javax.swing.*;
import javax.swing.JOptionPane;
public class Circle {

	
	
	private double radius;
	private double circumference;
	private double theArea;
	//Scanner keyboard = new Scanner(System.in);
	
	
	public Circle() {

		
	}
	
	public void setVarsToZero() {
        radius = 0.0;
        circumference = 0.0;
        theArea = 0.0;
    }	
	
	public void showVars() {
		/*
        System.out.println("radius = " + radius);
        System.out.println("Circumference = " + circumference);
        System.out.println("Area = " + theArea);*/
        JOptionPane.showMessageDialog(null, "radius: " + radius);
        JOptionPane.showMessageDialog(null, "circumference: " + circumference);
        JOptionPane.showMessageDialog(null, "area: " + theArea);
    }	

	public void setRadius() {
		//System.out.println("Please enter the radius (integer): ");
		//radius = keyboard.nextDouble();
		radius = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the radius: "));

	}
	
	public void calcCircumference() {
		circumference = (2 * radius * Math.PI);

	}
	public void calcArea() {
		theArea = (Math.pow(radius, 2) * Math.PI);

	}
	
	
}
