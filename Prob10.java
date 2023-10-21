import java.util.Scanner;
//10:Write a program to find m to the power n. m=3 and n=4 so 3*3*3*3

public class Prob10 {

	public static void main(String[] args) 
	{
		int num, pow, res = 1;
		System.out.println("Enter the number and power:");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		pow = sc.nextInt();
		
		while(pow != 0)
		{
			res = res * num;
			pow--;
		}
		System.out.println("Answer is "+ res);	
		
		sc.close();

	}

}
