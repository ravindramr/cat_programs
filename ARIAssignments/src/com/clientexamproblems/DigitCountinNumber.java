package com.clientexamproblems;
import java.util.Scanner;

public class DigitCountinNumber {
	public void count()
	{
	int n,count=0,digit,m;
	Scanner input = new Scanner(System.in);
	System.out.println("Enter Number :");
	n = input.nextInt();
	System.out.println("Enter digit :");
	digit = input.nextInt();
	while(n>0)
	{
	m=n%10;
	if(m==digit)
	count++;
	n=n/10;
	}

	System.out.println(+digit+" "+"occurred "+count+" times");
	}
	public static void main(String[] args) {
		DigitCountinNumber dc=new DigitCountinNumber();
		dc.count();
	}
	}

