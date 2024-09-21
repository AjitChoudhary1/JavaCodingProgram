package automation_testing_batch;
abstract class AB_Class
{
	abstract void login_logic();
	
}
public class ConcClass_ABClass extends AB_Class
{
	void login_logic()
	{
		System.out.println("Logic of login here");
	}
	public static void main(String[] args) 
	{
		
		
	}

}
