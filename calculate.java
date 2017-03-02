import java.util.Scanner;

public class calculate {
	public static void main(String[] args){
		
		int num1;
		int num2;
		int function;
		int output=0;

		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a positive integer number:");
		num1 = in.nextInt();
		num1=validateInt(num1); 
		System.out.println("Enter a second positive integer number:");
		num2 = in.nextInt();
		num2=validateInt(num2);
		System.out.println("Enter 1 for the Sum,2 for the product,3 for the difference");
		function = in.nextInt();
		
		if (num1!=-999){
				System.out.println(num1 + " is a positive integer number"); }
		else 
				System.out.println("Number 1 is incorrect!");
	
		if (num2!=-999){
			System.out.println(num2 + " is a positive integer number"); }
	else 
			System.out.println("Number 2 is incorrect!");
	in.close();
	
	switch(function){
		case 1:{
			output= sum(num1,num2);
			System.out.println("Sum of the values is: " +output);
			break;
		}
		case 2:{
			output= product(num1,num2);
			System.out.println("The product of the values is: "+output);
			break;
		}
		case 3:{
			output= difference(num1,num2);
			System.out.println("The difference of the values is: "+output);
			break;			
		}
	}
	} 
	
	public static int sum(int a,int b){
		return a+b;
	}
	public static int product(int a,int b){
		return a/b;
	}
	public static int difference(int a,int b){
		return a-b;
	}
	
	public static int validateInt(int num)
	{
		if(num>0)
			return num;
		else
			return -999;
	}
}




