package com.syntax.class09;

public class task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Create an array of chars and store grades into it: A,B,C,D,E,F. 
 * Then print a grade B (use 2 different ways of creating an array).
 * 
 */
		
		char[]grade=new char[6];
		
		grade[0]='A';
		grade[1]='B';
		grade[2]='C';
		grade[3]='D';
		grade[4]='E';
		grade[5]='F';
		
		
		char[] grade2= {'A','B','C','D','E','F',};
				
		/*Create an array of names and store all names of your group.
		 * Then print your name from that array
		 * (use 2 different ways of creating an array).
		 */
		 
		String[]names=new String[5];
		
		names[0]="Eric";
		names[1]="Asma";
		names[2]="Birsel";
		names[3]="Humrea";
		names[4]="Bassem";
		
		/////////////////////////////////
		
		String[] name= {"Eric","Asma","Bassem"};
		
		
		for(int size2=0;size2<name.length;size2++) {
			
		System.out.println("student number "+ size2+" "+name[size2]);
		
	}
	

}
}
