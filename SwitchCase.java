package automation_testing_batch;
public class SwitchCase 
{
	public static void main(String[] args) 
	{
		switch(2)
		{
		case 1:
		
			System.out.println("Launch Chrome Browser");
			//break;
		case 2:
		
			System.out.println("Launch Firefox Browser");
			//break;
		case 3:
		
			System.out.println("Launch Edge Browser");
			break;
		case 4:
		
			System.out.println("Launch Safari Browser");
			break;
		case 5:	
		
			System.out.println("Launch IE Browser");
		    break;
		
		default:
		    System.out.println("Your selection is wrong, Check again");    
		
		}
		
	}

}
