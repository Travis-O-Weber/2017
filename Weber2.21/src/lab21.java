import java.util.Scanner;

public class lab21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double p, r, i;
        int t;
 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        // Waiting for the user input
        p = sc.nextDouble();
 
        System.out.print("Enter rate: ");
        // Waiting for the user input
        r = sc.nextDouble();
 
        System.out.print("Enter time (in years): ");
        // Waiting for the user input
        t = sc.nextInt();
 
        i = (p * r * t) / 100;
        System.out.println("T:  " + (i + p));
		
	}

}
