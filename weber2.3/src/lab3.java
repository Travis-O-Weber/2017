import java.util.Scanner;

public class lab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	
			Scanner input = new Scanner(System.in);      
		    System.out.print("Enter the value in feet");
		    double feet = input.nextDouble();
		    double meter = .305;
		    double newfeet = feet*meter  ;
		  
		    System.out.println("The entered lenth is eqal to  = " +newfeet +" meters");   
	}
}