import java.util.Scanner;

public class lab301 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a, b, c;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the A value");
		 a = input.nextDouble();               //enter a value
		  
		System.out.print("Enter the B value");
		 b = input.nextDouble();              //enter b value
		  
		System.out.print("Enter the C value");
		 c = input.nextDouble();              //enter c value
		 
		 
		double dis= ((b*b)+(-4*a*c)); //dis
		System.out.print("The discriminant is "+dis );
		
		double temp1 = Math.sqrt(b * b - 4 * a * c);
		 
        double root1 = (-b +  temp1) / (2*a) ;
        double root2 = (-b -  temp1) / (2*a) ;
		
		if (dis == 0)
		{
			System.out.print(" The equation has one real roots ");
			System.out.println("The root is "+root1);
		}
		
		if (dis > 0)
		{
			System.out.print(" The equation has two real roots ");
			System.out.println("The roots are "+root1+" and "+root2);
		}
		
		if (dis < 0)
		{
			System.out.print(" "
					+ "The equation has no real roots");
		}
	}
}