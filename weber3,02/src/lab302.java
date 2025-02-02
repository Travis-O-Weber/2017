import java.util.Scanner;

public class lab302 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);
		    int sum = 0;
		    int read;

		    System.out.println("Enter a number: ");
		    read = Integer.parseInt(reader.nextLine());
		    sum += read;

		    System.out.println("Enter a second number: ");
		    read = Integer.parseInt(reader.nextLine());
		    sum += read;

		    System.out.println("Enter a third number: ");
		    read = Integer.parseInt(reader.nextLine());
		    sum += read;

		    System.out.println("Sum: " + sum);

		 
	}

}