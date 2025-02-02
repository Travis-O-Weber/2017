import java.util.Scanner;

public class lab10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);      
		   
		 System.out.println("Enter the temprature and mass to find the amount of energy needed");
        
	        System.out.println("Enter starting temperaqture in celsius ");
	        double startingtemp = input.nextDouble();
	         
	        System.out.println("Enter ending temprature in celsius");
	        double fintemp = input.nextDouble();
	         
	        System.out.println("Enter the amount of water in kilograms ");
	        double time = input.nextDouble();
	         
	        double average = time * (fintemp - startingtemp) * 4184;
	        
	        System.out.println("The amount of energy is = " +average);
	}

}
