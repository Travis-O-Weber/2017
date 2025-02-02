import java.util.Scanner;

public class lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Scanner input = new Scanner(System.in);      
	    System.out.print("Enter the radius of the circle");
	    double radius = input.nextDouble();
	    
	    System.out.print("Enter the hieght of the cylinder");
	    double hight = input.nextDouble();
	    
	    double area = radius * radius * Math.PI; 
	    double volume = area * hight;
	 
	    System.out.println("The area is = " + area);
	    System.out.println("The volume is = " + volume);
	}
}