package com.syntax.class10;

public class ArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[][] lottery= {{10,18,19},
		                  {4,5,6},
		                  {20,18,16}
			
		};
		
		
			
			
		System.out.println(lottery [1][2]);
		
		
		for (int i = 0; i<3; i++){
		
		System.out.println(lottery[i][i]);
		
		}
		
		System.out.println("----------------");
		
	
			for (int i=0; i<3; i++) {
				
			  for(int j=0; j<3;j++) {
				  System.out.println(lottery [i][j]);
			  }
			}
			
			
			
	}

}
