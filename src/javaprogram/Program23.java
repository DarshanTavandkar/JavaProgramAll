package javaprogram;

import java.util.Scanner;

public class Program23 {

	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter First No");
		System.out.println("Enter second No");
		System.out.println("select symbol(+,-,*,/)");
		
		int n1=s.nextInt();
		int n2=s.nextInt();
		
		String sym= s.next();
		
		switch(sym)
		{
		
		case"+":int res=n1+n2;
		System.out.println("Addition is:"+res);
		break;
		case"-":res=n1-n2;
		System.out.println("Subtraction:"+res);
		case"*":res=n1*n2;
		System.out.println("Multipication is :"+res);
		case"/":res=n1/n2;
		System.out.println("Division is:"+res);
		break;
		default:System.out.println("invalid symbol");
		break;
		
		}
	}
		
	}
	
	

