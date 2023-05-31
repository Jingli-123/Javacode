//import java.lang.Math.*;
public class Circle {
    private double radius;
    private double diameter;
    //private double perimeter;
    //private double area;
    //constructor
    public Circle (double radiusValue, double diameterValue){
        radius = radiusValue;
        diameter = diameterValue;
        
    }
    //return type void means method does not return a value
    public void setRadius(double radiusValue)
    {
        radius = radiusValue;
    }
    public void setDiameter(double diameterValue)
    {
        diameter = diameterValue;
    }
    
    //return type double means method returns a value of type double
    public double getRadius(double radiusValue)
    {
        return radius;
    }
    public double getDiameter(double diameterValue)
    {
        return diameter;
    }
    public double calculatePerimeter()
    {
        return 2*Math.PI*radius; //return the perimeter of the circle
    }
    public double calculateArea()
    {
        return Math.PI*Math.pow(radius, 2); //return the area of the circle
    }

}
