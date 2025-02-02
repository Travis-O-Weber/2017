import java.util.Scanner;

public class lab7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("please enter the number of minutes");
		
		Scanner input = new Scanner(System.in);  
		
		double totalMinutes= input.nextDouble();
		
		double currentMinutes = totalMinutes % 60;
		
		double totalhours= totalMinutes/60;
		
		double currentHours = totalhours % 24;
		
		double totalday = totalhours/24;
		
		double currentday = totalday % 7;
		
		double totalweeks = totalday / 7;
		
		double currentweek = totalweeks % 52;

		double totalyear= totalweeks/52;
		
		double currentyears = totalyear/1;
		
		 System.out.print(totalMinutes);
		 System.out.print(" minutes is approximatly ");
		 System.out.println(totalyear);
		 System.out.println(" years and ");
		 System.out.println(totalday);
		 System.out.println(" days");	 
	}
}