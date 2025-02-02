import java.util.Scanner;
public class primenumberchecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
			int temp;
			boolean isPrime=true;
			Scanner input= new Scanner(System.in);
			System.out.println("Please enter a number for check:");
			
			int num=input.nextInt();
			for(int i=2;i<=num/2;i++)
			{
		           temp=num%i;
			   if(temp==0)
			   {
			      isPrime=false;
			      break;
			   }
			}
			
			if(isPrime)
			   System.out.println(num + " is a Prime Number");
			else
			   System.out.println(num + " is not a Prime Number");
		   }
		

	}


