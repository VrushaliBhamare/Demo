package day2;

import java.util.Scanner;
import java.util.*;
public class assgn1 {

	public static void main(String[] args) {
		int mark;
		String res;
		
		
			Scanner s= new Scanner(System.in);
			System.out.println("enter the mark");
			mark=s.nextInt();
			res=mark>40?"pass":"fail";
			System.out.println(res);
		}
	}

	

