package day2;
//using ternary check if no entered by user is positive or negative.
import java.util.*;
import java.util.Scanner;

public class assgn2 {
	public static void main(String[] args) {
		int a;
		String result;
		Scanner s= new Scanner(System.in);
		System.out.println("enter the value ");
		a=s.nextInt();
		result=a>=0 ? "Positive number" : "Negative number";
		System.out.println(result);
		
	}


 
   
 
}