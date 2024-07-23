package Scanner_class_usage;

import java.util.Scanner;

public class Scanner_Class_Circumfrence_Of_Circle {

	static Scanner sc = new Scanner(System.in); // we made it static because we can use the variabe "sc" in static
												// method
												// bcz static method can access only static variable

	static void circumfrence() {

		System.out.println("enter the value of pi");

		double pi = sc.nextDouble();
		System.out.println("enter the value of radius");
		double radius = sc.nextDouble();
		double circumfrence = 2 * pi * radius;
		System.out.println("circumfrence of circle is " + circumfrence);

	}

	public static void main(String[] args) {

		Scanner_Class_Circumfrence_Of_Circle.circumfrence();

	}

}
