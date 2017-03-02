import java.util.Scanner;

public class calculate {
	public static void main(String[] args){
		
		int num1; //first number input	
		int num2; //second number input
		int function; //holds value for what the user wishes to do with values
		int output=0; //holds the result

		
		Scanner in = new Scanner(System.in); //allows user input to be scanned
		System.out.println("Enter a positive integer number:");
		num1 = in.nextInt(); //holds the value of the user input in num1
		num1=validateInt(num1); //checks to see if num input is valid, if less than 0 stores -999
		System.out.println("Enter a second positive integer number:");
		num2 = in.nextInt(); //holds the value of the user input in num2
		num2=validateInt(num2);  //checks to see if num input is valid, if less than 0 stores -999
		System.out.println("Enter 1 for the Sum,2 for the product,3 for the difference");
		function = in.nextInt(); //holds the function choice
		
		if (num1!=-999){ //result from validate int if value input is less than 0
				System.out.println(num1 + " is a positive integer number"); }
		else //if number was not negative
				System.out.println("Number 1 is incorrect!");
	
		if (num2!=-999){  //result from validate int if value input is less than 0
			System.out.println(num2 + " is a positive integer number"); }
	else  //if number was not negative
			System.out.println("Number 2 is incorrect!");
	in.close();
	
	switch(function){
		case 1:{ //add function
			output= sum(num1,num2); //sums the values and holds them in output
			System.out.println("Sum of the values is: " +output);
			break;
		}
		case 2:{ //product function
			output= product(num1,num2); //does the product function with the values and stores them in output
			System.out.println("The product of the values is: "+output);
			break;
		}
		case 3:{ //difference function
			output= difference(num1,num2); //calculates the difference and stores result in output
			System.out.println("The difference of the values is: "+output);
			break;			
		}
	}
	} 
	
	public static int sum(int a,int b){
		return a+b; //adds values
	}
	public static int product(int a,int b){
		return a/b; //divides a by b
	}
	public static int difference(int a,int b){
		return a-b; //finds the difference between the values
	}
	
	public static int validateInt(int num) //takes in the number and sees if valid
	{
		if(num>0) 
			return num;
		else //if negative
			return -999;
	}
}




