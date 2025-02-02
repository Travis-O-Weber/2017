import java.util.Scanner;

public class lab9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);      
	   
		 System.out.println("Enter the velocity values to find acceleration");
         
	        System.out.println("Enter starting velocity in m/s: ");
	        double startingVel = input.nextDouble();
	         
	        System.out.println("Enter ending velocity in m/s: ");
	        double finVel = input.nextDouble();
	         
	        System.out.println("Enter time in seconds: ");
	        double time = input.nextDouble();
	         
	        double average = (finVel - startingVel) / time;
	        
	        System.out.println(average);
	       
	}

}
