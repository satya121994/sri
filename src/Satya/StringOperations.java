package Satya;

import java.util.Scanner;

public class StringOperations {

	public static void main(String[] args) {
		
		String s1,s2;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter 2 strings");
		
		
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		
		String s3 = s1.concat(s2);//concatenation of two strings
		
		System.out.println("Result on concatenation is :"+s3);
		
		
		int l1 = s1.length(); //length of both the strings
		int l2 = s2.length();
		
		System.out.println("string 1 length is :"+l1);
		System.out.println("string 2 length is :"+l2);
		
		
		s1 =s1.toUpperCase();  //convert first string into UpperCase
		System.out.println("1st string in UpperCase:"+s1);
		
		
		
		
		

	}

}
