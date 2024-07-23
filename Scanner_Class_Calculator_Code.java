package Scanner_class_usage;

import java.util.Scanner;

public class Scanner_Class_Calculator_Code {

	static Scanner sc = new Scanner(System.in);
	// static int a = sc.nextInt();

	// static int b = sc.nextInt();

	static void addition(int a, int b) {

		int sum = a + b;
		System.out.println("Sum of a and b is " + sum);
		

	}

	static void subtraction(int a, int b) {

		int sub = a - b;
		System.out.println("Subtraction of a and b is " + sub);

	}

	static void multiplication(int a, int b) {

		int mul = a * b;
		System.out.println("multiplication of a and b is " + mul);

	}

	static void divide(int a, int b) {

		int div = a / b;
		System.out.println("division of a and b is " + div);

	}

	static void modulas(int a, int b) {

		int mod = a % b;
		System.out.println("modulas of a and b is " + mod);

	}

	public static void main(String[] args) {

		System.out.println("Please enter the value for a:");
		int a = sc.nextInt();
		System.out.println("Please enter the value for b:");
		int b = sc.nextInt();
		addition(a, b);
		subtraction(a, b);
		multiplication(a, b);
		divide(a, b);
		modulas(a, b);

	}

}
