package automation_testing_batch;
public class Airthmatic_Operators_Gbv_UtlizeLocally 
{
	// global variable utilization by locally
	
	static int a=50;
	static int b=100;
	
	static void add()
	{
		System.out.println(a+b);
	}
	static void sub()
	{
		System.out.println(a-b);
	}
	static void multi()
	{
		System.out.println(a*b);
	}
	static void divide()
	{
		System.out.println(b/a);
	}
	static void modulus()
	{
		System.out.println(a%b);
	}

	public static void main(String[] args) 
	{
		add();
		sub();
		multi();
		divide();
		modulus();
		
	}

}
