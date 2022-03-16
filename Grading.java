package day3;

import java.util.Scanner;
/*A school has following rules for grading system:
	 a. Below 25 - F
	 b. 25 to 45 - E
	 c. 45 to 50 - D
	 d. 50 to 60 - C
	 e. 60 to 80 - B
	 f. Above 80 - A
	 Ask user to enter marks and print the corresponding grade */

	
public class Grading {

	public static void main(String[] args)
	{
		
String name ;
 int marks ;
 Scanner s= new Scanner(System.in);
 System.out.println("enter name and marks");
 name= s.next(); 
 marks=   s.nextInt();  
 if(marks<25)
	 System.out.println(" F grade");
	    else if(marks<45)
	    	System.out.println(" E grade");
	    else if(marks<50)
	    	System.out.println(" D grade");
	    else if(marks<60)
	    	System.out.println(" C grade"); 
	    else if(marks<80)
	    	System.out.println(" B grade"); 
	    else if(marks>=80) 
	    	System.out.println(" A grade");

	
	}
}

/*  USING AND OPERATOR
if(x<25){
      System.out.println("F");
    }
    else if((x>=25)&&(x<45)){
      System.out.println("E");
    }
    else if((x>=45)&&(x<50)){
      System.out.println("D");
    }
    else if((x>=50)&&(x<60)){
      System.out.println("C");
    }
    else if((x>=60)&&(x<80)){
      System.out.println("B");
    }
    else if((x>=80)&&(x<=100)){
      System.out.println("A");
    }
    else{
      System.out.println("Not correct marks"); */