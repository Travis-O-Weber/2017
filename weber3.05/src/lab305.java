import java.util.Scanner;

public class lab305 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Enter today's day (0 - 6):  ");
		int day = input.nextInt();

		System.out.print("Enter the number of days elapsed since today:  ");
		int elapsed = input.nextInt();

		if(day == 0)
		{
		    System.out.println("Sunday");
		}
		if(day   == 1)
		{
		    System.out.println("Monday");
		}
		if(day ==  2)
		{
		    System.out.println("Tuesday");
		}
		if(day  == 3)
		{
		    System.out.println("Wednesday");
		}
		if(day  ==  4)
		{
		    System.out.print("Thursday");
		}
		if(day ==  5)
		{
		    System.out.print("Friday");
		}
		if(day  == 6)
		{
		    System.out.print("Saturday");
		}

		System.out.print("Today is " + day + " and the future day is " + elapsed);
		

	}

}