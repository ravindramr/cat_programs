package com.clientexamproblems;

import java.util.Scanner;

public class AddingOddDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
     AddingOddDigits ao=new AddingOddDigits();
     ao.add();
	}

	public void add() {
		// TODO Auto-generated method stub
		
		 Scanner sc=new Scanner(System.in);
		System.out.println("enter bill amount:");
	     int n=sc.nextInt();
	     int res=0,r=0;
		r=n%10;
		if((r%2)!=0)
		res+=r;
		n=n/10;
		System.out.println("discount amt:"+res);
			
			
		}
	}


