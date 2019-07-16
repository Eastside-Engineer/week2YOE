package day6;

import java.util.Scanner;

public class Operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner mack = new Scanner(System.in);
		
		//Create 3 int variables
		int first = 0;
		int second = 0;
		int sum = 0;
		int diff = 0;
		int product = 0;
		int quotient = 0;
		//Create 3 double variables
		double first1 = 0;
		double second2 = 0;
		double sum1 = 0;
		double diff1 = 0;
		double product1 = 0;
		double quotient1 = 0;
		
		//sysout says Welcome to {name} calculator!
		System.out.println("Welcome to Cynthia's calculator!");
		
		//sysout tells user to enter a number:
		System.out.println("Enter a number: ");
		//use one of the variables = {scanner}.next{datatype}();
		first = mack.nextInt();
		
		//sysout tells user to enter a number:
		System.out.println("Enter a second number: ");
		//use one of the variables = {scanner}.next{datatype}();
		second = mack.nextInt();
		//last int variable = variable + variable;
		sum = first + second;
		//sysout last variable
		System.out.println("This is the sum of your numbers: " + sum);
		
		//sysout "this the difference"
		//int {name} = blue - yellow;
		//sysout({name});
		diff = first - second;
		System.out.println("This is the difference of your numbers: " + diff);
		//do multiplication, division
		product = first * second;
		System.out.println("This is the product of your numbers: " + product);

		quotient = first / second;
		System.out.println("This is the quotient of your numbers: " + quotient);
		
		System.out.println("Decimals!");
		System.out.println("Enter a number: ");

		first1 = mack.nextDouble();
		
		System.out.println("Enter a second number: ");

		second2 = mack.nextDouble();

		sum1 = first1 + second2;

		System.out.println("This is the sum of your numbers: " + sum1);
		
		
		diff1 = first1 - second2;
		System.out.println("This is the difference of your numbers: " + diff1);

		product1 = first1 * second2;
		System.out.println("This is the product of your numbers: " + product1);

		quotient1 = first1 / second2;
		System.out.println("This is the quotient of your numbers: " + quotient1);
		
		System.out.println("Thank you for using Cynthia's Calculator!");
		
		mack.close();
	}

}
