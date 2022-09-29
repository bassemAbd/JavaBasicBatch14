package com.syntax.class08;

import java.util.Scanner;

public class class8Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter two strings");

		String word1 = input.next();

		String word2 = input.next();

		System.out.println("Please enter two numbers");

		int num1 = input.nextInt();
		int num2 = input.nextInt();

		if (num1 == num2 && word1 == word2) {
			System.out.println("AND");
		}
		
          else if (num1 != num2 || word1 != word2) {

				System.out.println("OR");

			}

		 else {

			System.out.println("NONE");
		}

	}

}
