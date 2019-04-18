package com.savnet.session03;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		System.out.print("Introduceti suma in RON: ");

		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();

		System.out.print("Introduceti cursul valutar: ");

		double y = scanner.nextDouble();
		long a = (long) (x / y);

		long z = (long) (x % y);

		System.out.println(a);
		System.out.println(z);

		scanner.close();

	}

}
