import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 	double temperatue;
		    Scanner input = new Scanner(System.in);      
		 
		    System.out.print("Enter temperatue in celsius");
		    double celsius = input.nextDouble();
		 
		    temperatue = (((9.0/5) * celsius) + 32);
		 
		    System.out.println("Temperatue in fahrenheit = " + temperatue);
		  }
		}