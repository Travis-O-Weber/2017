import java.util.Scanner;


public class lab14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);

	        double w = 0.0;
	        double h = 0.0;
	        double bmi = 0.0;

	        System.out.print("Enter your weight in pounds: ");
	        w = input.nextDouble();

	        System.out.print("Enter your height: ");
	        h = input.nextDouble();

	        bmi = ((w * 703)/(h * h));

	        System.out.printf("Your BMI is " + bmi);

	        
	}

}
