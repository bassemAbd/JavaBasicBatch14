package com.syntax.class10;

import java.util.Scanner;

public class Class10HomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		int[] value = new int[5];

		int sum = 0;

		System.out.println("Enter 5 values");

		int value2 = input.nextInt();

		for (int i = 0; i < value.length; i++) {

			System.out.println("Enter 5 values");

			value[i] = sum;

			sum += sum;

		}
		System.out.println("The sum of numbers = " + sum);

	}

}
