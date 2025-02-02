import java.util.Scanner;
public class areaofcircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r;
        double pi = 3.14;
        double area;
        Scanner input = new Scanner(System.in);
        System.out.print(" Please enter the radius of circle:");
        r = input.nextInt();
        area = pi * r * r;
        System.out.println("The area of circle is: "+area);

	}

}
