package com.clientexamproblems;
import java.util.Scanner;
public class UniqueDigitCount {
	public static void countUnique(int num)
	{
	int res= 0;
	int count[] = new int[10];
	while (num > 0) {
	int r= num % 10;
	count[r]++;
	num = num /10;
	}

	for (int i = 0; i<10; i++)
	{
	if(count[i] == 1) {
	res++;
	}
	}
	System.out.println("Number of unique digits:"+res);
	}
	public static void main(String[] args)
	{
	UniqueDigitCount dc = new UniqueDigitCount();
	Scanner in = new Scanner(System.in);
	System.out.println("Enter number : ");
	int num =in.nextInt();
	dc.countUnique(num);
	}
}
