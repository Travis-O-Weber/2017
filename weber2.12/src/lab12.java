import java.util.Scanner;

public class lab12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		   double acceleration, speed, length;
		  
		   System.out.print("Enter speed:");
		   speed = input.nextDouble();
		  
		   System.out.print("Enter acceleration:");
		   acceleration = input.nextDouble();
		  
		   length = (Math.pow(speed, 2))/(2*acceleration);
		  
		   System.out.print("The minimum runway length for this airplane is " + length);

	}

}
