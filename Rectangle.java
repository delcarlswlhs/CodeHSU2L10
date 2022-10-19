public class Rectangle
{
    private int width;
    private int length;
    
    //constructor because it has class name
    public Rectangle(int theWidth, int theLength)
    {
        width = theWidth;
        length = theLength;
    }
    
    //method because it doesn't have class name
    public int area()
    {
        return width * length;
    }
    
    //method because it doesn't have class name
    public static void rectEquations()
    {
        System.out.println("The formula for area is: L * W");
        System.out.println("The formula for perimeter is: 2(L + W)");
    }

    
    public String toString()
    {
        return "Rectangle: " + width + " x " + length;
    }

}