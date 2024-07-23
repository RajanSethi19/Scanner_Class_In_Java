package Scanner_class_usage;

import java.util.Scanner;

public class Practice {
	static Scanner sc = new Scanner(System.in);

	static void add() {
		
		System.out.println("Enter the value of a here");
		int a = sc.nextInt();
		System.out.println("Enter the value of a here");
		int b = sc.nextInt();
		int sum = a + b;
		System.out.println(sum);
	}

	static void mul() {
		System.out.println("Enter the value of a here");
		int a = sc.nextInt();
		System.out.println("Enter the value of a here");
		int b = sc.nextInt();
		int mul = a *b;
		System.out.println(mul);
	}

	static void sub() {
		System.out.println("Enter the value of a here");
		int a = sc.nextInt();
		System.out.println("Enter the value of a here");
		int b = sc.nextInt();
		int sub = a -b;
		System.out.println(sub);

	}

	static void div() {
		System.out.println("Enter the value of a here");
		int a = sc.nextInt();
		System.out.println("Enter the value of a here");
		int b = sc.nextInt();
		int div = a / b;
		System.out.println(div);

	}

	public static void main(String[] args) {
		add();
		mul();
		sub();
		div();

	}

}
