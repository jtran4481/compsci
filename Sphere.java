package projects;
import javax.swing.JOptionPane;

public class Sphere {
    private double radius;
    private double volume;
    private double surfaceArea;
    
    public Sphere() {    
    }
    
    public void setVarsToZero() {
        radius = 0.0;
        volume = 0.0;
        surfaceArea = 0.0;
    }    
    
    public void showVars() {
        JOptionPane.showMessageDialog(null, "Radius = " + radius);
        JOptionPane.showMessageDialog(null, "Volume = " + volume);
        JOptionPane.showMessageDialog(null, "Surface Area = " + surfaceArea);
    }    
    
    public void setRadius() {;
        radius = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the Radius:"));
    }
    
    public void calcVolume() {
        volume=((Math.PI * Math.pow(radius, 3)) *4  ) / 3;
    }
    
    public void calcSurfaceArea() {
        surfaceArea=4 * Math.PI * Math.pow(radius, 2);
    }
}
