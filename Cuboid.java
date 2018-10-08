package projects;

import javax.swing.JOptionPane;
public class Cuboid {

	private double side1, side2, side3;
	private double SurfaceArea;
	private double volume;
	
	public Cuboid() {

		
	}
	
	public void setVarsToZero() {
        side1 = 0.0;
        side2 = 0.0;
        side3 = 0.0;
        SurfaceArea = 0.0;
        volume = 0.0;
    }	
	
	public void showVars() {
        JOptionPane.showMessageDialog(null, "side 1: " + side1 + " side 2: " + side2 + " side 3: " + side3);
        JOptionPane.showMessageDialog(null, "Surface Area: " + SurfaceArea);
        JOptionPane.showMessageDialog(null, "Volume: " + volume);
    }	
	
	public void setSides() {

		side1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter Side 1: "));
		side2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter Side 2: "));
		side3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter Side 3: "));

	}
	
	public void calcSurfaceArea() {
		SurfaceArea = (2 * side1 * side2) + (2 * side1 * side3) + (2 * side2 * side3);
	}
	
	public void calcVolume() {
		volume = side1 * side2 * side3;
	}
}
