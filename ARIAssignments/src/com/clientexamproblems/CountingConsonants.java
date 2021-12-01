package com.clientexamproblems;

	import java.util.Scanner;
	public class CountingConsonants {
	   public void count(String str){
	      int count = 0;
	      for (int i=0 ; i<str.length(); i++){
	         char ch = str.charAt(i);
	         if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
	            System.out.print("");
	         }else if(ch != ' '){
	            count++;
	         }
	      }
	      System.out.println("Number of consonants: "+count);
	   }
	   public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
		   CountingConsonants cc=new CountingConsonants();
		   System.out.println("Enter a word :");
		   String str=sc.nextLine();
		   cc.count(str);
		   
	}
	}

