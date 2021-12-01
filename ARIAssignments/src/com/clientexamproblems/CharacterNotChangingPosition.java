package com.clientexamproblems;

import java.util.Scanner;

public class CharacterNotChangingPosition 
	{
		public void position(String str) {
		   
		    int count=0;
		    StringBuffer s2=new StringBuffer(str);
		    s2=s2.reverse();
		    for (int i=0;i<str.length();i++)
		    {
		        if(str.charAt(i) == s2.charAt(i))
		        {
		            count++;
		        }
		    }
			System.out.println("The number of characters not changing position:"+count);
		}
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			CharacterNotChangingPosition c= new CharacterNotChangingPosition ();
			System.out.println("Enter a string");
			String str=sc.nextLine();
			c.position(str);
		}
	}

