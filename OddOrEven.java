package ifClass;

import java.util.Scanner;

public class OddOrEven {
	
	int num;
	void input()
	{
	
	Scanner scan = new Scanner(System.in);
	
	System.out.print("Enter a number");
	
	num = scan.nextInt();
	
	}

	void find()
	{
		if (num%2==0)
		{
			System.out.println("the number ' " + num + "' is even");
		}
		else
		{
			System.out.println("the number ' "+num + " ' is Odd");
	    }
		
	}
	
	

}
