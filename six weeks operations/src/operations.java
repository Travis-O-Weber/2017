import java.util.Scanner;
public class operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		
        System.out.print("Please type the 3 numbers");
		
        int num1 = input.nextInt(); 
       
        int num2 = input.nextInt(); 
        
        int num3 = input.nextInt(); 
        
        System.out.println("The product of the three numbers is ");
        
        System.out.println(num1*num2*num3);
        
        System.out.println("The secound operation solution is ");
        
        System.out.println(num2 + num3 * num1);
        
        if (num1<num2){if (num1<num3){System.out.println("The first entered number is the smallest");}
        else{ System.out.println("Number 3");}
        }else{ if (num2<num3){System.out.println("The secound entered number is the smallest");}
        else{System.out.println("The third entered number is the smallest");}}

        
        if (num1>num2){if (num1>num3){System.out.println("The first entered number is the largest");}
        else{ System.out.println("Number 3");}
        }else{ if (num2>num3){System.out.println("The secound entered number is the largest");}
        else{System.out.println("The third entered number is the largest");}}
        
        System.out.println("The mean of the three numbers is ");
        
        System.out.println(num2+num3+num1/3);
        
        System.out.println("The median of the three numbers ");
        
        if( num2>num1 && num1>num3 || num3>num1 && num1>num2 )
		{
        	 System.out.println("The first entered number is the middle number");
		}
 
       
		if( num1>num2 && num2>num3 || num3>num2 && num2>num1 )
		{
			 System.out.println("The secound entered number is the middle number");
		}
 
       
		if( num1>num3 && num3>num2 || num2>num3 && num3>num1 )
		{
			 System.out.println("The third entered number is the middle number");
		}
        

	}

}
