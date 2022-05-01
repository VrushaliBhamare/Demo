package day3;
import java.util.Scanner;
//wap to check greater number among three numbers
public class Bignumber {

    public static void main(String[] args) 
    {
        int x, y, z;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number:");
        x = s.nextInt();
        System.out.print("Enter the second number:");
        y = s.nextInt();
        System.out.print("Enter the third number:");
        z = s.nextInt();
        
        if(x >= y) {
            if(x >= z)
                System.out.println(x + " is the largest number.");
            else
                System.out.println(z + " is the largest number.");
        } else {
            if(y >= z)
                System.out.println(y + " is the largest number.");
            else
                System.out.println(z + " is the largest number.");
        }
    }
}

/* USING AND OPERATOR
if((x>y) && (x>z))
System.out.println("x is greater");
else if((y>z) && (y>z))
System.out.println("y is greater");
else
System.out.println("z is greater");
*/


