import java.util.Scanner;

public class lab4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);      
	    System.out.print("Enter a number in pounds");
	    double pounds = input.nextDouble();	    
	    double kilo = .454;
	    double newweight = pounds*kilo  ;
	    
	    System.out.println("The entered weight is eqal to  = " +newweight +" kilos");
	}
}