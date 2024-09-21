package automation_testing_batch;
import java.util.Scanner;
public class AdditionRunTime 
{
	public static void main(String[] args) 
	{
		
		Scanner s1=new Scanner(System.in);
		
		System.out.println("Enter my name");
		String name=s1.next();
		
		System.out.println("age");
		short age=s1.nextShort();
		
		System.out.println("village zip");
		 int zipcode=s1.nextInt();
		 
		System.out.println("random number");
		 byte number=s1.nextByte();
		 
	    System.out.println("My mobile no"); 
		 long mobileno=s1.nextLong();
		 
		System.out.println("less salary"); 
		 float salary=s1.nextFloat();
		
		System.out.println("high salary");
		 double Highsalary=s1.nextDouble();
		 
		System.out.println("what result");
		 boolean result=s1.nextBoolean();
		
		
	}

}
