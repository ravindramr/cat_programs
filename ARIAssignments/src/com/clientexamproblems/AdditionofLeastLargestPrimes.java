package com.clientexamproblems;

import java.util.Scanner;

public class AdditionofLeastLargestPrimes {
	
	
	    public static void main(String args[]) {
	       
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter 1st number of range:");
	       int f = sc.nextInt();

	        System.out.print("Enter last number of range:");
	        int l = sc.nextInt();
	        AdditionofLeastLargestPrimes ap=new AdditionofLeastLargestPrimes();
	       ap.sum(f,l);
	    }

		public void sum(int f, int l) {
			// TODO Auto-generated method stub
			int sum=0;
			for(int j=f;j<=l;j++)
			{
			boolean isPrime=check(j);
			if(isPrime)
			{
				sum+=j;
			}
			
			}
			System.out.println("The sum is:"+sum);
		}

		public boolean check(int n) {
			// TODO Auto-generated method stub
			if(n==1)
			{
			return false;
			}
				for(int i=2;i*i<=n;i++)
				{
					if(n%i==0)
					{
						return false;
					}
				}
				return true;
			}

		public void getLeast(int f, int l) {
			// TODO Auto-generated method stub
			
		}

		public void getHigh(int f, int l) {
			// TODO Auto-generated method stub
			
		}
		
}
