package automation_testing_batch;
import java.util.Scanner;
public class AddScanner 
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		
		System.out.println("Enter value of a");
		int a=s1.nextInt();
		
		System.out.println("Enter value of b");
		int b=s1.nextInt();
		
		int sum=a+b;
		System.out.println("addition->"+sum);
		
		System.out.println("my salary1");
		long salary=s1.nextLong();
		
		System.out.println("my salary2");
		long salary2=s1.nextLong();	
		
		long sum2=salary+salary2;
		System.out.println("my total salary->"+sum2);
		
		
		// Assgnmnt enter 32k and check exception
	
		byte a1= s1.nextByte();
		
		
	}
	
}
