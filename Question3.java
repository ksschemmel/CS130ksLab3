import java.util.Scanner;
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("First Number: ");
		double num1=scan.nextDouble();
		System.out.println("Second Number: ");
		double num2=scan.nextDouble();
		System.out.println("Third Number: ");
		double num3=scan.nextDouble();
		System.out.println("The average is:" + (num1+num2+num3)/3 );
	}

}
