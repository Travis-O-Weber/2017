import java.util.Scanner;

public class lab20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 double p, r, i;
	 
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter principal amount: ");
	       
	        p = sc.nextDouble();
	 
	        System.out.print("Enter rate: ");
	        
	        r = sc.nextDouble();
	 
	        i = p * (r / 1200);
	        System.out.println("The Interest is:  " + i);

	}

}
