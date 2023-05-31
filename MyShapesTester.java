import java.util.*;
public class MyShapesTester {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Which shape you want to calculate? Choose the option from: 1-cube, 2-sphere, 3-rectangular prism, 4-cylinder");
        int a = keyboard.nextInt();
        if (a == 1){
            System.out.println("Please enter the number of side:");
            int side = keyboard.nextInt();
            MyShapes cube = new MyShapes();
            int v1 = cube.volume(side);
            System.out.println(v1);
        }else if (a == 2){
            System.out.println("Please enter the number of radius:");
            double radius = keyboard.nextDouble();
            MyShapes sphere = new MyShapes();
            double v2 = sphere.volume(radius);
            System.out.println(v2);
        }else if (a == 3){
            System.out.println("Please enter the number of length:");
            double length = keyboard.nextDouble();
            System.out.println("Please enter the number of width:");
            double width = keyboard.nextDouble();
            System.out.println("Please enter the number of height:");
            double height = keyboard.nextDouble();
            MyShapes rectangular = new MyShapes();
            double v3 = rectangular.volume(length, width, height);
            System.out.println(v3);
        }else if (a == 4){
            System.out.println("Please enter the number of radius:");
            double radius = keyboard.nextDouble();
            System.out.println("Please enter the number of height:");
            double height = keyboard.nextDouble();
            MyShapes cylinder = new MyShapes();
            double v4 = cylinder.volume(radius, height);
        }else {
            System.out.println("Not this option, please try again.");
        }
    }
}
