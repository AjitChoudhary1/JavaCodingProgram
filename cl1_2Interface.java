package automation_testing_batch;
interface Google2
{
	void login_auth();
	void logout_auth();
}
interface Flipkart2   extends Google2
{
	void login_auth_flp();
	void logout_auth_flp();
}
public class cl1_2Interface   implements  Flipkart2
{
	public static void main(String[] args) 
	{
		
		
	}
	public void login_auth() 
	{
		
	}
	public void logout_auth() 
	{
		
	}
	public void login_auth_flp() 
	{
		
	}
	public void logout_auth_flp() 
	{
		
	}

}
