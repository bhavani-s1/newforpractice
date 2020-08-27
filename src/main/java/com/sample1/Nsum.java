package com.sample1;

import java.util.Scanner;

public class Nsum {

	public static void main(String[] args) {
		
		int i, sum=0;
		
		Scanner scan = new Scanner(System.in);
				
		System.out.print("How many Number You want to Enter to Add them ? ");
	      
	       int n = scan.nextInt();
	       int num[]=new int[n];

	     System.out.println("Enter " +n+ " numbers : ");
	     
	     
	      for(i=0; i<n; i++)
	    	  
	       {
	    	  num[i] = scan.nextInt();
	    	  for (int j=0;j<num[i];j++) {
	    		  
	    		  sum =num[i]-sum; 
	    		  
	    	  }
	          
	       }
	          
	      System.out.println("sum of all numbers" +sum);  
	      scan.close();
	       }
	
	       
	       
}
	 
	      
	     
	
	





