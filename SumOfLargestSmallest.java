import java.util.Scanner;

public class SumOfLargestSmallest
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first number:");
	int first=sc.nextInt();
	System.out.println("Enter second number:");
	int second=sc.nextInt();
	System.out.println("Enter third number:");
	int third=sc.nextInt();
	int largest=0,smallest=0,sum=0;
	if(first>second && first>third)
	{
		largest=first;
	}
	else if(second>first && second>third)
	{
		largest=second;
	}
	else
	{
		largest=third;
	}
	
	if(first<second && first<third)
	{
		smallest=first;
	}
	else if(second<first && second<third)
	{
		smallest=second;
	}
	else
	{
		smallest=third;
	}
	sum=largest+smallest;
	System.out.println("Sum of Smallest and Largest Number is:"+sum);
	}
}