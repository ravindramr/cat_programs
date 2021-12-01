package com.clientexamproblems;

import java.util.Scanner;

public class ConvertBinaryToDecimal {
	public void convert(String str)
	{
		int decimalnumber=Integer.parseInt(str,2);
		System.out.println(decimalnumber);
		}
public static void main(String args[]){
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter a binary number");
	String binarynumber=sc.nextLine();
	ConvertBinaryToDecimal cd=new ConvertBinaryToDecimal();
	cd.convert(binarynumber);
		}
}

