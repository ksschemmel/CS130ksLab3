import java.util.Scanner;
public class FloatMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("First Number: ");
		float num1=scan.nextFloat();
		System.out.println("Second Number: ");
		float num2=scan.nextFloat();
		System.out.println("The sum is: " + (num1+=num2));
		System.out.println("The difference is: " + (num1-=num2));
		System.out.println("The Product is: " + (num1*=num2));
	}

}
