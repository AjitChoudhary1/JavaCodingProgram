package automation_testing_batch;
public class OverLoad_MainM_NonStatic 
{
	public void main() 
	{
		System.out.println("main 1");
	}
	public void main(String name) 
	{
		System.out.println("main 2");
	}
	public void main(char a) 
	{
		System.out.println("main 3");
	}
	public static void main(String[] args)   //Heart
	{
		OverLoad_MainM_NonStatic o1=new OverLoad_MainM_NonStatic();
		o1.main();
		o1.main("Choudhary");
		o1.main('A');
		
	}

}
