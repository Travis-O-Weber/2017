import java.util.Scanner;

public class lab23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);

		
		System.out.print("Enter the driving distance:");
		  double dis = input.nextDouble();
		  System.out.print("Enter miles per gallon:");
		  double fuelEff = input.nextDouble();
		  System.out.print("Enter price per gallon:");
		  double pPerG = input.nextDouble();
		  double cost = dis / 25.5 * pPerG;
		  System.out.print("The cost of driving is $" + cost);

	}

}
