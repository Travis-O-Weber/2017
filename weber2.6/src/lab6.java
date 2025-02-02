import java.util.Scanner;

public class lab6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("please enter a numer 1 - 1000");
		

		Scanner input = new Scanner(System.in);      
		
		int num = input.nextInt();
		int num1 = num % 10; 
		int num2 = num / 10;
		int num3 = num2 % 10; 
		int num4 = num2 / 10;	
		int tot = num1 + num3 + num4;
		
		
		System.out.println("The total is = " +tot);
	}

}
