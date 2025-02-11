package com.gentech.mine;


abstract class shape
{
    String colour;
    abstract double area();
    abstract String toostring();

}
class circle extends shape{
    double radius;

    public circle(String color, double radius)
    {

        // calling Shape constructor
        System.out.println("Circle constructor called");
        this.radius = radius;
    }
    @Override
    double area() {
        return  Math.PI * Math.pow(radius, 2);
    }

    @Override
    String toostring() {
        return "area is :  "+ area();
    }
}
class Pattern6
{
    public  void mtd(int n, int i,int j)
   {

       while (i <= 5) {
           while (j <= i) {
               System.out.print(n + " ");
               n++;
               j++;
           }
           System.out.println();
           i++;
           j = 1; // Reset j for the next row
       }

   }
   static class dem extends Pattern6
   {

       {
           mtd(1,1,1);
       }

   }
}
 class Addition {

    // Method to add two integers
    protected static void addTwoInt(int a, int b) {
        int sum = a + b;
        // Printing the sum of the integers
        System.out.println(sum);
    }
}

// Helper class, inheriting from Addition
 class GFG extends Addition {

    // Static block to invoke the static method
    static {
        // Calling the static method of the parent class directly
        addTwoInt(1, 2);  // This will print 3
    }
}

public class MainMine extends Addition {

    public static void main(String[] args) {
        // Calling the static method directly via the class name
        Addition.addTwoInt(1, 4); // This will print 5

        // Creating an object of GFG will invoke the static block
        new GFG(); // This will print 3 due to static block execution in GFG
        Pattern6 m = new Pattern6();
        int hashcodeee = m.hashCode();
        Class<?>   cs = m.getClass();
        System.out.println(cs);
        System.out.println(hashcodeee);
        GFG gfgInstance = new GFG(); // Creating an instance of GFG
        Class<?> gfgClass = gfgInstance.getClass();
        System.out.println("Class of GFG: " + gfgClass);
        shape d = new circle("green",2.0);
        d.area();
        d.toostring();
        System.out.println(d.toostring());

    }
}
