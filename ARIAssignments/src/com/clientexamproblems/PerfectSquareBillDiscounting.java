package com.clientexamproblems;

import java.util.Scanner;

public class PerfectSquareBillDiscounting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the nuumber bills:");
int b=s.nextInt();
int [] bills=new int[b];
System.out.println("Enter the bill amounts:");
for (int j = 0; j < bills.length; j++) {
	bills[j]=s.nextInt();
}
PerfectSquareBillDiscounting bd=new PerfectSquareBillDiscounting();
System.out.println("The number of bills eligible for discount are:"+bd.perfect(bills));


	}

	public int perfect(int[] bills) {
		// TODO Auto-generated method stub
		int count=0;
		for (int i = 0; i < bills.length; i++) {
			double num=(double)Math.sqrt(bills[i]);
			double perfect=num*10;
			if(perfect%10 == 0)
			{
				count++;
			}
		}
		return count;
		
	}

}
