import java.util.Scanner;
//9:Write a program to find factorial of a given number. ex:no5  fact=5*4*3*2*1=120

public class Prob9 {

	public static void main(String[] args) 
	{
		int num, fact = 1;
		System.out.println("Enter number:");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		for(int i = 1; i <= num; i++)
		{
			fact = fact * i;
		}
		System.out.println("Factirial of "+num+" is "+fact);

	}

}
