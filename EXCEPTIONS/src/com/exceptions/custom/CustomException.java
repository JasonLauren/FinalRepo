package com.exceptions.custom;

import java.util.Scanner;

public class CustomException
{
	public static void main(String args[])
	{
		System.out.println("Enter the age");
		Scanner obj=new Scanner(System.in);
		int age=obj.nextInt();
		/*System.out.println(age);
		CustomException ce1 = new CustomException();*/
		try
		{
			agecheck(age);
			
		}
		catch(Exception ex)
		{
			System.out.println("age is not valid" + ex);
		}
		
	}

	public static void agecheck(int age) throws InvalidException 
	{
		if (age<=0)
		{
			throw new InvalidException("Enter a valid age");
		}
		else
		{
			System.out.println(" Entered age is::" + age );
			
		}	
	}
	}