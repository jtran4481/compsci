package projects;

//import java.util.Scanner;
import javax.swing.JOptionPane;
public class Runner {
	public static void main(String[] args) {

/*************************************************************************************
 * this is great for notes and pseudo code
 * 
 * circle: input r; calculate circumference, area
 * rectangle: input side A, B, C; calculate perimeter, area, and diagonal
 * Triangle: input side A, B, C; calculate perimeter, area, all angles
 * Cuboid: Input sides, A, B, C; calculate volume, total surface area
 * Sphere: input r; calculate volume, surface area
 * TOTAL celebration dance for tons of great Java
 * name date and period at beginning of program
 * 
 * use Math classes, Math.pi(
 * 		
 **********************************************************************************/
		
		
		/*System.out.println
		Triangle myTriangle = new Triangle();
		myTriangle.setVarsToZero();
		myTriangle.setSides();
		myTriangle.calcPerimeter();
		myTriangle.calcArea();
		myTriangle.showVars();
		myTriangle.calcAngles();
*/
		//Rectangle myRectangle = new Rectangle();
		Triangle myTriangle = new Triangle();
		Circle myCircle = new Circle();
		Rectangle myRectangle = new Rectangle();
		Cuboid myCuboid = new Cuboid();
		Sphere mySphere = new Sphere();	
		
		int goAgain = 0;
		while (goAgain == 0) {
		String msg = "Please enter your selection: Triangle, Circle, Rectangle, Cuboid, or Sphere";
		//JOptionPane.showMessageDialog(null, msg);
		

		String answer = JOptionPane.showInputDialog(msg);
		JOptionPane.showMessageDialog(null, answer);
		
		// When comparing strings, ==  sign is unreliable, do not use
		// Instead, use String class methods
		if ((answer.equals("Triangle")) || (answer.equals("triangle"))) {
			myTriangle.setVarsToZero();
			myTriangle.setSides();
			myTriangle.calcPerimeter();
			myTriangle.calcArea();
			myTriangle.showVars();
			myTriangle.calcAngles();
		}
		else if ((answer.equals("Circle")) || (answer.equals("circle"))) {
			myCircle.setVarsToZero();
			myCircle.setRadius();
			myCircle.calcCircumference();
			myCircle.calcArea();
			myCircle.showVars();
		}
		else if ((answer.equals("Rectangle")) || (answer.equals("rectangle"))) {
			myRectangle.setVarsToZero();
			myRectangle.setSides();
			myRectangle.calcPerimeter();
			myRectangle.calcArea();
			myRectangle.calcDiagonal();
			myRectangle.showVars();
		}
		else if ((answer.equals("Cuboid")) || (answer.equals("cuboid"))) {
			myCuboid.setVarsToZero();
			myCuboid.setSides();
			myCuboid.calcSurfaceArea();
			myCuboid.calcVolume();
			myCuboid.showVars();
		} 
		else if ((answer.equals("Sphere")) || (answer.equals("sphere"))) {
			mySphere.setVarsToZero();
			mySphere.setRadius();
			mySphere.calcVolume();
			mySphere.calcSurfaceArea();
			mySphere.showVars();
		} 
		else {
			JOptionPane.showMessageDialog(null, "Wrong Answer");
		}
		
		/*
		if ((answer.equals("Y") || (answer.equals("y")) {
			goAgain = 1;
		}
		else {
			goAgain = O;
		}
		 */
		msg = "Go again or no:";
		goAgain = JOptionPane.showConfirmDialog(null, msg);
		}
		JOptionPane.showMessageDialog(null, "Thank you! Come again!");
		for (int i = 0; i < 10; i++) {
			JOptionPane.showMessageDialog(null, "Celebrate");
		}
		JOptionPane.showMessageDialog(null, "done");
	}	
}
