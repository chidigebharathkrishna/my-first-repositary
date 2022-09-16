package com.test;

public class BreakExample {

	public static void main(String[] args) {
		
		 int i,n=10;
		
		 for ( i=1;i<=10;i++)   // outer for loop - 4 times
		 {
		     for (int j=1;j<=5;j++) // inner for loop 5*4=20
			 {
			 if(i==5)
			 {
			 
				 break;
			 }
			 System.out.println(i);
			 System.out.println("Hello World");
		 }
	}
	}
}

