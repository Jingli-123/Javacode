public class MyShapes {
    
    public static int volume(int side){
        return side * side * side;
    }
    public static double volume(double radius){
        return (double)4/3 * Math.PI * radius * radius * radius;
    }
    public static double volume(double length, double width, double height){
        return length * width * height;
    }
    public static double volume(double radius, double height){
        return Math.PI * radius * radius * height;
    }
}
