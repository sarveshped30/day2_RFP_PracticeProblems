import java.util.Scanner;

public class ReverseInt {
	public static void main(String[] args) {
		System.out.print("Enter Number : ");
		Scanner N = new Scanner(System.in);
		int Num = N.nextInt();
		int reverse = 0;
		int remainder = 0;
		
		for(;Num != 0; Num = Num/10) {
			remainder = Num%10;
			reverse = reverse*10 + remainder;
		}
		System.out.println("Reverse Number is " + reverse);
	}
}
