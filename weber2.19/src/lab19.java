import java.util.Scanner;

public class lab19 {
    // find the area of a triangle
    public static void main (String [] args) {
      
        Scanner input = new Scanner(System.in);

        //obtain three points for a triangle
        System.out.print("Enter the points x1");
        double x1  = input.nextDouble();
        System.out.print("Enter the points y1");
        double y1  = input.nextDouble();
        System.out.print("Enter the points x2");
        double x2  = input.nextDouble();
        System.out.print("Enter the points y2");
        double y2  = input.nextDouble();
        System.out.print("Enter the points x3");
        double x3  = input.nextDouble();
        System.out.print("Enter the points y3");
        double y3  = input.nextDouble();

        double area = (x1*y2 + x2*y3 + x3*y1 - x1*y3 + x2*y1 + x3*y1)/2;
        System.out.println("The area of the triangle is");
        System.out.println(Math.abs(area));
    }
}
