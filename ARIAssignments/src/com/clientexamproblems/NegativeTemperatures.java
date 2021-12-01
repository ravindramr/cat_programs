package com.clientexamproblems;

import java.util.Iterator;
import java.util.Scanner;

public class NegativeTemperatures {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("enter the number of products:");
	int s=sc.nextInt();
	double temper[]=new double[s];
	System.out.println("enter temperatures of products");
	for (int i = 0; i < temper.length; i++) {
	temper[i]=sc.nextDouble();	
	}
	NegativeTemperatures nt=new NegativeTemperatures();
	nt.findNegative(temper);
}

public void findNegative(double arr[]) {
	// TODO Auto-generated method stub
	int count=0;
for (int i = 0; i < arr.length; i++) {
	
	if(arr[i]<0)
	{
		count++;
	}
}	
System.out.println("number of products that have negative teperatures:"+count);
}
}
