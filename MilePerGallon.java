import java.util.Scanner;
public class MilePerGallon 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of miles driven: ");
		int miles=scan.nextInt();
		System.out.println("Enter the gallons of feul used: ");
		double gallons=scan.nextDouble();
		double mpg=miles/gallons;
		System.out.println("Miles Per Gallon:" + mpg);
	}

}
