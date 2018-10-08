package projects;
//import java.util.Scanner;

import javax.swing.JOptionPane;


public class Triangle {

	// class variables go here
	private double sideA, sideB, sideC;
	private double perimeter;
	private double theArea;
	//Scanner keyboard = new Scanner(System.in);
	
	
	
	// constructor goes here
	// constructor has same name as class, but no class, void, and stuff like that
	public Triangle() {
		/*
		setSides(0, 0, 0);
		perimeter = 0;
		theArea = 0;
	*/
		
	}
	public void setVarsToZero() {
        sideA = 0.0;
        sideB = 0.0;
        sideC = 0.0;
        perimeter = 0.0;
        theArea = 0.0;
    }
	//method definition: 
	public void showVars() {
		/*
        System.out.println("Side A = " + sideA);
        System.out.println("Side B = " + sideB);
        System.out.println("Side C = " + sideC);
        System.out.println("Perimeter = " + perimeter);
        System.out.println("Area = " + theArea);*/
		//JOptionPane.showMessageDialog( null, "Hello Java world...  Please welcome ME to the smart Java community"); 
        JOptionPane.showMessageDialog(null, "Side A: " + sideA);
        JOptionPane.showMessageDialog(null, "Side B: " + sideB);
        JOptionPane.showMessageDialog(null, "side C: " + sideC);
        JOptionPane.showMessageDialog(null, "Perimeter: " + perimeter);
        JOptionPane.showMessageDialog(null, "Area: " + theArea);

    }

	/* runner get access this cause its private
	private void setSides() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the length of side A (integer): ");
		sideA = keyboard.nextInt();
		System.out.println("you entered:" + sideA);
		System.out.println("Please enter the length of side B (integer): ");
		sideB = keyboard.nextInt();
		System.out.println("Please enter the length of side C (integer): ");
		sideC = keyboard.nextInt();
		
		calculatePerimeter();
	}
*/
	public void setSides() {/*
		System.out.println("Please enter the length of side A (integer): ");

		//sideA = keyboard.nextDouble();
		System.out.println("Please enter the length of side B (integer): ");
		//sideB = keyboard.nextDouble();
		System.out.println("Please enter the length of side C (integer): ");*/
		//sideC = keyboard.nextDouble();
		
		//calculatePerimeter();
		boolean b = true;
		while (b) {
			try {
				sideA = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter Side A: "));
				b = false;
			}
			catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Enter an number");
			}
		}
		
		sideB = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter Side B: "));
		sideC = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter Side C: "));

	}
	/*private void calculatePerimeter() {
		perimeter = sideA + sideB + sideC;
		System.out.println(perimeter);
		
	}*/
	
	public void calcPerimeter() {
		perimeter = (sideA + sideB + sideC);
		//System.out.println(perimeter);
	}
	
	public void calcArea() {
		double p = 0.0;
		p = perimeter/2.0;
		//System.out.println(p);
		theArea = Math.sqrt(p * (p-sideA) * (p-sideB) * (p-sideC));
		//System.out.println("Area: " + theArea);
	}
	public void calcAngles() {
		double cosC = 0, Adeg = 0;
		double cosB = 0, Cdeg = 0;
		double cosA = 0, Bdeg = 0;
		cosC = (Math.pow(sideA, 2.0) + Math.pow(sideB, 2.0) - Math.pow(sideC, 2.0))/
				(2.0 * sideA * sideB);
		cosB = (Math.pow(sideA, 2.0) + Math.pow(sideC, 2.0) - Math.pow(sideB, 2.0))/
				(2.0 * sideA * sideC);
		cosA = (Math.pow(sideB, 2.0) + Math.pow(sideC, 2.0) - Math.pow(sideA, 2.0))/
				(2.0 * sideB * sideC);
		//System.out.println("cosC:" + cosC);
		Cdeg = Math.toDegrees(Math.acos(cosC));
		Bdeg = Math.toDegrees(Math.acos(cosB));
		Adeg = Math.toDegrees(Math.acos(cosA));
		//System.out.println("Angle A: " + Adeg + " Angle B: " + Bdeg + " Angle C: " + Cdeg);
		JOptionPane.showMessageDialog(null, "Angle A: " + Adeg + " Angle B: " + Bdeg + " Angle C: " + Cdeg);
	}	
	// methods go here
	
}
