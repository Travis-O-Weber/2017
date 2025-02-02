import java.util.Scanner;
 
public class lab16 {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        System.out.println("Enter the side of a hexagon");
        double side = input.nextDouble();
 
        if (side == 0)
            System.out.println("error cant do that");
        else
            System.out.println("The area is " + printHexArea(side));
    }
 
 
    public static double printHexArea(double a) {
 
        double area = (( 3 * Math.sqrt(3) * Math.pow(a, 2))) / 2;
        return area;
         
    }
}