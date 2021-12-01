package com.clientexamproblems;

import java.util.Scanner;

public class DecimalToBinaryConversion {
	public void convertBinary(int num){
	     int binary[] = new int[10];
	     int index = 0;
	     while(num > 0){
	       binary[index++] = num%2;
	       num = num/2;
	     }
	     for(int i = index-1;i >= 0;i--){
	       System.out.print(binary[i]);
	     }
	  }
	 
	  public static void main(String a[]){
		  Scanner sc= new Scanner(System.in);
		  DecimalToBinaryConversion db = new DecimalToBinaryConversion();
	     System.out.println("Enter a decimal number ");
	     int n=sc.nextInt();
	     db.convertBinary(n);
	  }
}
