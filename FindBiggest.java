package ifClass;

import java.util.Scanner;

public class FindBiggest {
	int number1, number2;
	
	Scanner scan = new Scanner(System.in);
	
	void input()
	{
		System.out.println("enter number 1");
		
		number1 =scan.nextInt();
		
		System.out.println("enter number 2");
		
		number2 =scan.nextInt();
		
	}
	void Biggest()
	{
		if(number1>number2)
		{
			System.out.println("number1 "+number1 +"is bigger");
		}
		else if (number2 > number1)
		{
			System.out.println("number2 "+number2 +"is bigger");
		}
	else 
	
		{
			System.out.println("both are equal...");
		}
	}

}
