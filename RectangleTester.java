public class RectangleTester
{
    public static void main(String[] args)
    {
        // Can call static methods
        // WITHOUT creating an object (it won't work)
        // Classname.method();
        Rectangle.rectEquations();
        
        // Cannot call non-static methods without
        // an object
        
        // WRONG
        //int area = Rectangle.area();
        
        // RIGHT
        Rectangle desk = new Rectangle (3, 6);
        int area = desk.area();
        System.out.println("The area of my desk is " + area);
        
        //desk.rectEquations(); will work but AP will deduct points for 
        //calling a static method on an object
        
    }
}