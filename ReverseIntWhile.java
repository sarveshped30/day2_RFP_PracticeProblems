import java.util.Scanner;

public class ReverseInt {
	public static void main(String[] args ) {
		System.out.print("Enter the Number : ");
		Scanner n = new Scanner(System.in);
		int Number = n.nextInt();
		int remainder = 0;
		int reverse = 0;
		
			while(Number != 0) {
				remainder = Number%10;
				reverse = reverse*10 + remainder;
				Number = Number/10;
			}
		System.out.print("Number is " +Number + " Reverse Number is " +reverse);
	}
}
