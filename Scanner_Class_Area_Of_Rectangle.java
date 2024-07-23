package Scanner_class_usage;

import java.util.Scanner;

public class Scanner_Class_Area_Of_Rectangle {

	static void Area() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of rectangle");
		int Length = sc.nextInt();
		System.out.println("Enter the width of rectangle");
		int Width = sc.nextInt();
		double Area = Length * Width;
		System.out.println("Area of rectangle is " + Area);

	}

	public static void main(String[] args) {
		Area();

	}

}
