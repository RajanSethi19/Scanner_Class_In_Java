package Scanner_class_usage;

import java.util.Scanner;

public class Scanner_Class_Calculator_Code_two {

static Scanner sc = new Scanner(System.in);

	static void addition() {
		System.out.println("Enter the value of a");
		int a = sc.nextInt();
		System.out.println("Enter the value of b");
		int b = sc.nextInt();
		int sum = a + b;
		System.out.println("Sum of a and b is " + sum);

	}

	static void subtraction() {
		System.out.println("Enter the value of a");
		int a = sc.nextInt();
		System.out.println("Enter the value of b");
		int b = sc.nextInt();
		int sub = a - b;
		System.out.println("Subtraction of a and b is " + sub);

	}

	static void multiplication() {
		System.out.println("Enter the value of a");
		int a = sc.nextInt();
		System.out.println("Enter the value of b");
		int b = sc.nextInt();
		int mul = a * b;
		System.out.println("multiplication of a and b is " + mul);

	}

	static void divide() {
		System.out.println("Enter the value of a");
		int a = sc.nextInt();
		System.out.println("Enter the value of b");
		int b = sc.nextInt();
		int div = a / b;
		System.out.println("division of a and b is " + div);

	}
	static void modulas() {
		System.out.println("Enter the value of a");
		int a = sc.nextInt();
		System.out.println("Enter the value of b");
		int b = sc.nextInt();
		int mod = a %b;
		System.out.println("modulas of a and b is " + mod);

	}

	public static void main(String[] args) {
		
		addition();
		subtraction();
		multiplication();
		divide();
		modulas();
		

	}

}
