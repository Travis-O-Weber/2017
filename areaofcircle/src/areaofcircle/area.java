import java.util.Scanner;
public class areaofcircle;{

public class area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r;
        double pi = 3.14, area;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter radius of circle:");
        r = s.nextInt();
        area = pi * r * r;
        System.out.println("Area of circle:"+area);

	}

}
