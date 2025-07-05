package com.skakarla.dsa;

import java.util.Scanner;

public class Java_Basic_Questions 
{
	
	public static void calculate_average(int a,int b,int c)
	{
		int sum=a+b+c;
		int avg=sum/3;
		System.out.println(avg);
	}
	
	private void printOdd(int s) 
	{
		System.out.println("Odd numbers from 1 to "+s+" are:");
		for(int i=1;i<=s;i++)
		{
			if(i%2==1)
			{
				System.out.println(i);
			}
		}
	}
	
	private void find_largest(int i, int j)
	{
		if(i>j)
		{
			System.out.println(i+" is greater than "+j);
		}
		else
		{
			System.out.println(j+" is greater than "+i);
		}
	}
	
	private void cal_cir(int i) 
	{
		System.out.println("Circumference of circle is"+3.14*i*i);
	}
	
	private void val_age(int i) 
	{
		if(i>=18)
		{
			System.out.println("Eligible to vote");
		}
		else
		{
			System.out.println("Not eligible to vote");
		}
	}
	

	private static void you_print(int i)
	{
		Scanner obj2=new Scanner(System.in);
		for(int a=1;a<=i;a++)
		{
			obj2.nextInt();
			
		}
		
		
	}
	
	public static void main(String[] args) 
	{
		
		//1.Average function
		
		Scanner myobj=new Scanner(System.in);
		System.out.println("Enter 3 numbers:");
		int a=myobj.nextInt();
		int b=myobj.nextInt();
		int c=myobj.nextInt();
		
		calculate_average(a,b,c);
		
		System.out.println();
		
		//2.print sum of all odd numbers from 1 to n
		Java_Basic_Questions obj=new Java_Basic_Questions();
		obj.printOdd(6);
		
		//3.print largest number
		obj.find_largest(10,7);
		
		//4.circumference of circle
		obj.cal_cir(12);
		
		//5.valid age
		obj.val_age(20);
		
		//6.infinite do-while loop
		do
		{
			System.out.println("8");
		}while(1>0);
	}

	

}
