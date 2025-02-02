import java.util.Scanner;


public class lab13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		 
		  System.out.print("Enter the monthly saving amount:");
		  double ini = input.nextDouble();
		  double msm = 0; 
		  msm = (ini + msm) * 1.00417; //month 1
		  msm = (ini + msm) * 1.00417; //month 2
		  msm = (ini + msm) * 1.00417; //month 3
		  msm = (ini + msm) * 1.00417; //month 4
		  msm = (ini + msm) * 1.00417; //month 5
		  msm = (ini + msm) * 1.00417; //month 6
		 
		  System.out
		    .print("After the sixth month, the account value is " + msm);
		 
	}

}
