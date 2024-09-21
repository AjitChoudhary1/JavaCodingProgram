package automation_testing_batch;
class Flipkart
{
	void login()
	{
		System.out.println("Login by email id");
	}
}
public class Method_Override_Amazon    extends Flipkart
{
	void login()
	{
		System.out.println("Login by mobile no");
	}
	public static void main(String[] args) 
	{
		Method_Override_Amazon m1=new Method_Override_Amazon();
		m1.login();
		
	}

}
