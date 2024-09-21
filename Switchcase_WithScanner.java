package automation_testing_batch;
import java.util.Scanner;

public class Switchcase_WithScanner 
{
	public static void main(String[] args) 
	{
		System.out.println("Press 1 For Chrome Browser");
		System.out.println("Press 2 For Firefox Browser");
		System.out.println("Press 3 For Edge Browser");
		System.out.println("Press 4 For Safari Browser");
		System.out.println("Press 5 For IE Brpwser");
		
		Scanner s1=new Scanner(System.in);
		int DoSelection= s1.nextInt();
		
	switch(DoSelection)
	{
	case 1:
	
		System.out.println("Launch Chrome Browser");
		break;
	case 2:
	
		System.out.println("Launch Firefox Browser");
		break;
	case 3:
	
		System.out.println("Launch Edge Browser");
		//break;
	case 4:
	
		System.out.println("Launch Safari Browser");
		//break;
	case 5:	
	
		System.out.println("Launch IE Browser");
	    break;
	
	default:
	    System.out.println("Your selection is wrong, Check again");  
	
	
	}
	
	
	}

}
