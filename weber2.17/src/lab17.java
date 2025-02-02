import java.util.Scanner;

public class lab17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		 
		  System.out
		    .print("Enter the temperature in Fahrenheit between -58 degrees F and 41 degrees F:");
		  double temp = input.nextDouble();
		  System.out.print("Enter the wind speed (>=2) in miles per hour:");
		  double vel = input.nextDouble();
		  double twc = 35.74 + 0.6215 * temp - 35.75 * Math.pow(vel, 0.16) + 0.4275
		    * temp * Math.pow(vel, 0.16);
		 
		  System.out.print("The wind chill index is " + twc);
	}

}
