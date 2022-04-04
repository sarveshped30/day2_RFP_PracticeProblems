import java.util.Scanner;

public class ArthmeticOp {
	public static void main(String[] args) {
		System.out.print("Enter value of  a : ");
		Scanner A = new Scanner(System.in);
		int a = A.nextInt();
		
		System.out.print("Enter value of  b : ");
		Scanner B = new Scanner(System.in);
		int b = B.nextInt();
		
		System.out.print("Enter value of  c : ");
		Scanner C = new Scanner(System.in);
		int c = C.nextInt();
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		
		float value1 = a+b*c;
		float value2 = c+a/b;
		float value3 = a%b+c;
		float value4 = a*b+c;
		float max = value1;
		float min = value1;
		
		System.out.println("a+b*c = " + value1);
		System.out.println("c+a/b = " + value2);
		System.out.println("a%b+c = " + value3);
		System.out.println("a*b+c = " + value4);
		
		// Finding max value
		if(value2 > max) {
			max = value2;
		}
		if(value3 > max) {
			max = value3;
		}
		if(value4 > max) {
			max = value4;
		}
		
		// Finding min value
		if(value2 < min) {
			min = value2;
		}
		if(value3 < min) {
			min = value3;
		}
		if(value4 < min) {
			min = value4;
		}
		
		System.out.println("Maximum value is : " +max);
		System.out.println("Minimun value is : " + min);
	}
}
