package com.bptn.course;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in); 

		System.out.println("Enter your a number here to find out whether it is positive or negative : ");
		
		int num; 

		num = scan.nextInt();
		
		
		if (num > 0) {
		System.out.println("Your number is positive");
		
		if (num < 0) {
			System.out.println("Your number is " + num + "negative");
		}
			else if (num == 0) {
				System.out.println("Your number is " + num + "niether positive nor negative");
			}
	
				}
		
			}

	}

		
