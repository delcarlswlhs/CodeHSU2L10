//import static java.lang.Math.*;

public class MathDemo{
    public static void main(String[] args){
        double x1 = 17.2;
        double y1 = -8.5;
        double x2 = 5.6;
        double y2 = -2.0;
        int z1 = 7;
        
        //absolute value
        
        System.out.println(Math.abs(y1));
        //System.out.println(abs(y1)); only use if import is used
        
        //square root something
        double squareRoot = Math.sqrt(z1);
        System.out.println(squareRoot); //integer argument is fine
        
        //use exponents
        double powerExample = Math.pow(7,5); //result will be stored as double
        System.out.println("7 to the 5th power is: " + (int)powerExample); //can cast double to int
        
        //find the sin, cos, and tan of an angle
        int angle1 = 60;
        double angle1InRad = Math.toRadians(angle1); //since toRadians is static it belongs to math class, not an object or instance of it
        System.out.println("The cos of 60 degrees is " + Math.cos(angle1InRad));
        System.out.println("The true value is 0.5");
        
        //convert to radians by multiplying by pi/180
        final double PI = Math.PI;
        double angle1InRad2 = angle1*(PI/180);
        System.out.println("The cos of 60 degrees is " + Math.cos(angle1InRad2));
        System.out.println("The true value is 0.5");
        
        //area of a circle
        double radius = 4.0;
        
        //make a variable
        double area1 = Math.pow(radius, 2) * PI;
        double area2 = PI * radius * radius;
        
        //print
        System.out.println("The area of a circle with a radius of " + radius + " is " + area1);
        
    }
}