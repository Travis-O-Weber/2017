import java.util.Scanner;

public class lab5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);      
	    System.out.print("Enter the sub total and then gratuity rate");
	    double subtotal = input.nextDouble();	    
	    double gradrate = input.nextDouble();
	    double newgradrate = gradrate * .01;
	    double totaltip = subtotal*newgradrate;
	    double total = subtotal + totaltip;
	    
	    System.out.println("The gratuity is = " +totaltip);
	    System.out.println("The total is = " +total);
	}
}