package com.syntax.class10;
import java.util.Arrays;
import java.util.Scanner;

public class homeWorkArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println(" Enter number of dresses");
		
		int size=scan.nextInt();
		
		double [] prices= new double[size];
		
		for(int i=0; i<size; i ++) {
			
		System.out.println("Please enter the price for dress "+ i);
		
		prices[i]= scan.nextDouble();
		
		
		}
		
	  System.out.println(Arrays.toString(prices));
	  
	  double sum=0;

	  for (double price:prices) {
		  
		  sum+=price; // sum=sum+price
		  
		  System.out.println("Total for all dresses = " +sum);
		  
		  
	  }
	  
	  
	}

}
