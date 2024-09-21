package automation_testing_batch;
abstract class Facebook_auth
{
	abstract void fb_login();
	abstract void fb_reg();
}
abstract class Google_auth extends Facebook_auth
{
	abstract void google_login();
	abstract void google_reg();
}

public class GTM_CclassAndABclass extends Google_auth
{
	void google_login() 
	{

	}
	void google_reg() 
	{
		
	}
	void fb_login() 
	{
		
	}
	void fb_reg() 
	{
		
	}
public static void main(String[] args) 
{
	
		
}

}
