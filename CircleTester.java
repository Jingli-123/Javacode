import java.util.*;
public class CircleTester
{
    public static void main(String[] args)
    {
        //take user input to create a circle object first
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the number of Radius:");
        double radius = keyboard.nextDouble();
        double diameter = radius * 2;
        Circle myCircle = new Circle(radius, diameter);
        double perimeter = myCircle.calculatePerimeter();
        double area = myCircle.calculateArea();
        System.out.println("The circle's radius is: " + radius + ".");
        System.out.println("The circle's diameter is: " + diameter + ".");
        System.out.println("The circle's perimeter is: " + perimeter + ".");
        System.out.println("The circle's area is: " + area + ".");
    }
}