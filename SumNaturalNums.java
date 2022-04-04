import java.util.Scanner;

public class SumNaturalNums {
	public static void main(String[] args) {
		System.out.print("Enter Number : ");
		Scanner n = new Scanner(System.in);
		int Num = n.nextInt();
		int sum = 0;
		
		for(int i=1; i<=Num; i++) {
			sum += i;
		}
		System.out.println("Sum of " + Num +" Natural Numbers is " + sum);
	}
}
