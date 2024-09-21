package automation_testing_batch;
public class OverLoad_MainM_Static 
{
	public static void main() 
	{
		System.out.println("main 1");
	}
	public static void main(String name) 
	{
		System.out.println("main 2");
	}
	public static void main(char a) 
	{
		System.out.println("main 3");
	}
	public static void main(String[] args)   //Heart
	{
		
		main();
		main("Choudhary");
		main('J');
	}

}
