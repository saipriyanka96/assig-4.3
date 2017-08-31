package Xpattern;
import java.util.Scanner;
public class Xpattern {
	//public keyword is used in the declaration of a class,method or field;public classes,method and fields can be accessed by the members of any class.
		//class defines instance and class fields,methods and inner classes as well as specifying the interfaces the class implements and the immediate superclass of the class
	//Type casting is a class name
		
	public static void main(String[] args) {
		//Java Program processing starts from the main() method which is a mandatory part of every program 		
//static used to prepare a field,method or inner classes as a class field.
//void is used to define the return type of the method
//String[] args is actually an array of java.lang.String type and it's name is args here
//String is predefined class name 
//args is name of the array
		Scanner sc=new Scanner(System.in);
		//to scan values which we initialize
		
		System.out.print("Enter N:\n");
		//System is a final class in java.lang package
		//out is a static member field of system class and it's type PrintStream
		//println is a method of PrintStream class and it means print in next line
		//Inside the brackets is value which to be printed		
						
		int n=sc.nextInt();//scans next token of the input as int
		int arr[][]=new int[n][n];//creating an array list object and initializing them
		//inserting values in array
		for(int i=0;i<n;i++)//starting value for i=0
		{
			for (int j=0;j<n;j++)
			{
				if(i==j || (i+j)==(n-1))//here i value is equal to j and those values 
					//sum is equal to number -1
					System.out.print('*');// printing the value
				else
					System.out.print(' ');
			}
			System.out.println(' ');//printing the value in next line
		}
		}

}
