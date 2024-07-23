package Scanner_class_usage;

import java.util.Scanner;

public class Scanner_Input_Exception {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Integer value");
		int a = sc.nextInt();
		System.out.println("Enter a Boolean value");
		boolean b = sc.nextBoolean();
		System.out.println("Enter a Byte value");
		byte c = sc.nextByte();
		System.out.println("Enter a Double value");
		double d = sc.nextDouble();
		System.out.println("Enter a Float value");
		float f = sc.nextFloat();
		System.out.println("Enter a String value");
		String s = sc.next();
		System.out.println("Enter a Long value");
		long l = sc.nextLong();
		System.out.println("Enter a short value");
		short k = sc.nextShort();

	}

}
