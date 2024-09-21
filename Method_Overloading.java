package automation_testing_batch;
public class Method_Overloading 
{
  //NonStatic
	
	void login(String emailid)
	{
		System.out.println("login email");
	}
	void login(long Mobileno)
	{
		System.out.println("login Mnumber");
	}
	void ajit()
	{
		System.out.println("non para");
	}
	
  // Static
	
	static void login1(String emailid)
	{
		System.out.println("login email 1");
	}
	static void login1(long Mobileno)
	{
		System.out.println("login Mnumber 1");
	}
	static void jat()
	{
		System.out.println("static non para");
	}
	public static void main(String[] args) 
	{
	// Non Static
		
		Method_Overloading m1=new Method_Overloading();
		m1.ajit();
		m1.login("aj@123");
		m1.login(8233668067l);
		
	// Static
		jat();
		login1("aj@321");
		login1(9599850867l);
	}

}
