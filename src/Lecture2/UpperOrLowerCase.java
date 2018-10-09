package Lecture2;

import java.util.Scanner;

public class UpperOrLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		char ch=s.next().charAt(0);
	//	System.out.println(ch);
		
		if(ch>='a'&&ch<='z'){
			System.out.println("LowerCase");
		}else if(ch>='A'&&ch<='Z'){
			System.out.println("Uppercase");
		}else{
			System.out.println("Invalid Character");
		}
		
	}

}
