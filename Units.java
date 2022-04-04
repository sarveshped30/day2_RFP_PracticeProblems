import java.util.Scanner;

public class Units {
	public static void main(String[] args) {
		System.out.print("Enter Number from (1,10,100,1000,100000) : ");
		Scanner x = new Scanner(System.in);
		int Num = x.nextInt();
		
		if(Num == 1) {
			System.out.print("Unit");
		}else if(Num == 10) {
			System.out.print("Ten");
		}else if(Num == 100) {
			System.out.print("Hundred");
		}else if(Num == 1000) {
			System.out.print("Thousand");
		}else if(Num == 100000) {
			System.out.print("Lakh");
		}else {
			System.out.print("Enter Number from (1,10,100,1000,100000)");
		}
	}
}
