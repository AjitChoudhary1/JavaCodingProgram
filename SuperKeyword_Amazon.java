package automation_testing_batch;
class Flipkart1
{
	void login()
	{
		System.out.println("Login by email id 1");
	}
}
public class SuperKeyword_Amazon   extends Flipkart1
{
	void login()
	{
		//super.login();
		System.out.println("Login by mobile no 1");
		super.login();
	}
	public static void main(String[] args) 
	{
		SuperKeyword_Amazon m1=new SuperKeyword_Amazon();
		m1.login();
		
	}

}
