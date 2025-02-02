import java.util.Random;
import java.util.Scanner;

public class highlow {

	public static void main(String[] args) {

	      Random random = new Random();
	       
	      Scanner scanner = new Scanner(System.in);
	
	      int number = random.nextInt(100);
	      int guess = -1;
	     
	      while (guess!=number) {
	     
	         System.out.print("Enter your guess: ");
	          
	         guess = scanner.nextInt();
	          
	         if (guess<number) {
	           
	            System.out.println("Too low");
	             
	         } else if (guess>number) {
	 
	            System.out.println("Too high");
	             
	         } else {
	             
	            System.out.println("Correct " + number);
	         }
	      }
	   }
	 
	}