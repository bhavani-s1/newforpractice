package com.sample1;

import java.util.Scanner;

public class Ncaleculator extends Naddition {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		int choice;
		
		do {
			
			System.out.println("enter your choice");
			System.out.println("1.Addition");
			System.out.println("2.subtraction");
			System.out.println("3.multiplication");
			System.out.println("4.division");
			
			choice=sc.nextInt();
			
			switch(choice) {
			
			case 1:
				Naddition na=new Naddition();
				na.getresult();
				
			break;
			
			case 2:
				Nsubtraction nsub= new Nsubtraction();
				
				nsub.getresult();
				
				
				
				
				
			}
			
		}while(choice!=5);
	
		sc.close();

	}

}

