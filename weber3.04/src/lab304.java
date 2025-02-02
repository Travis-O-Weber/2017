import java.util.Scanner;

public class lab304 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);

		int random = (int )(Math.random() * 12 + 1);
		
		
		if(random == 1)
		{
		    System.out.println("January");
		}
		if(random == 2)
		{
		    System.out.println("February");
		}
		if(random == 3)
		{
		    System.out.println("March");
		}
		if(random == 4)
		{
		    System.out.println("April");
		}
		if(random == 5)
		{
		    System.out.println("May");
		}
		if(random == 6)
		{
		    System.out.println("June");
		}
		if(random == 7)
		{
		    System.out.println("July");
		}
		if(random == 8)
		{
		    System.out.println("August");
		}
		if(random == 9)
		{
		    System.out.println("September ");
		}
		if(random == 10)
		{
		    System.out.println("October");
		}
		if(random == 11)
		{
		    System.out.println("November");
		}
		if(random == 12)
		{
		    System.out.println("December");
		}


		System.out.print("The Random month I generated is "); 
				System.out.print(random);
		

	}

}