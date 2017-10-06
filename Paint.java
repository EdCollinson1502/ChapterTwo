//***************************************************************
//File: Paint.java
//
//Purpose: Determine how much paint is needed to paint the walls
//of a room given its length, width, and height
//***************************************************************
 
public class Paint
{
        public static void main(String[] args)
        {
            final int COVERAGE = 350;  //paint covers 350 sq ft/gal
            //declare integers length, width, and height;
            int length = 15;
            int width = 11;
            int height = 8;
            //declare double totalSqFt;
            double totalSqFt = length * width * height;
            //Compute the amount of paint needed
            double paintNeeded = totalSqFt / 350;
            //Print the length, width, and height of the room and the
            //number of gallons of paint needed.
            System.out.println("The dimensons are:");
            System.out.println("Length: \t\t " + length);
            System.out.println("Width: \t\t\t" + width);
            System.out.println("Height: \t\t" + height);
            System.out.println("And the total number of gallons needed is...");
            System.out.println(paintNeeded + "!");
        }
}