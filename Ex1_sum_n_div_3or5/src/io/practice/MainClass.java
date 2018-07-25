package io.practice;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
		CalSum cal=new CalSum();
		int result=cal.calSum(n);
		if(result==0){
			System.out.println("Number you have entered is not divisible by 3 and 5");
			System.out.println("So, can't find sum of that number");
		}
		else
		{
		  System.out.println("Sum of the first "+n+" natural numbers is "+result);
		}
	}

}
